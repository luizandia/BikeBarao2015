package Java;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalWebControlller {
	@Autowired private BicicletaDAO bicicletaDAO = new BicicletaDAO();
	@Autowired private CartaoDAO cartaoDAO = new CartaoDAO();
	@Autowired private EstacaoDAO estacaoDAO = new EstacaoDAO();;
	@Autowired private FornecedorDAO fornecedorDAO = new FornecedorDAO();
	@Autowired private LocalizacaoDAO localizacaoDAO = new LocalizacaoDAO();
	@Autowired private UsuarioDAO usuarioDAO = new UsuarioDAO();
	@Autowired private AluguelDAO aluguelDAO = new AluguelDAO();
	
	@RequestMapping("/bicicletas")
	public ModelAndView showBikes() {
		ModelAndView mv = new ModelAndView("bicicletas");
		
		List<Bicicleta> bikes = bicicletaDAO.findAll();
		for(Bicicleta b : bikes){
			b.setNumAlugueis(aluguelDAO.getNumAlugueisByBike(b.getId()));
		}
		
		mv.addObject("bicicletas", bikes);
		mv.addObject("bicicletasConserto", bicicletaDAO.getBicicletasEmConserto());
		return mv;
	}
	
	@RequestMapping("/localizacoes")
	public ModelAndView showLocalizacoes() {
		ModelAndView mv = new ModelAndView("localizacoes");
		mv.addObject("localizacoes", localizacaoDAO.findAll());
		return mv;
	}
	
	@RequestMapping("/usuarios")
	public ModelAndView showUsuarios() {
		ModelAndView mv = new ModelAndView("usuarios");
		mv.addObject("usuarios", usuarioDAO.findAll());
		return mv;
	}
	
	@RequestMapping(value="/usuarios/{cpf}", method = RequestMethod.GET)
	public ModelAndView showUser(@PathVariable String cpf) {
		ModelAndView mv = new ModelAndView("usuario");
		mv.addObject("user", usuarioDAO.findByCpf(cpf));
		mv.addObject("alugueis", aluguelDAO.getAlugueisByClient(cpf));
		return mv;
	}
	
	@RequestMapping("/estacoes")
	public ModelAndView showEstacoes() {
		ModelAndView mv = new ModelAndView("estacoes");
		mv.addObject("estacoes", estacaoDAO.findAll());
		mv.addObject("estacoesDefeito", estacaoDAO.getEstacaoBiciletaDefeito());
		return mv;
	}
	
	@RequestMapping("/fornecedores")
	public ModelAndView showFornecedores() {
		ModelAndView mv = new ModelAndView("fornecedores");
		mv.addObject("fornecedores", fornecedorDAO.findAll());
		return mv;
	}
	
	@RequestMapping("/alugueis")
	public ModelAndView alugueis() {
		ModelAndView mv = new ModelAndView("aluguel");
		mv.addObject("usuarios", usuarioDAO.findAll());
		List<Aluguel> alugueis = aluguelDAO.findAll();
		mv.addObject("alugueis", alugueis);
		mv.addObject("bicicletas", bicicletaDAO.findAll());
		return mv;
	}

}