package Java;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalWebControlller {
	@Autowired private BicicletaDAO bicicletaDAO = new BicicletaDAO();
	@Autowired private CartaoDAO cartaoDAO = new CartaoDAO();
	@Autowired private EstacaoDAO estacaoDAO = new EstacaoDAO();;
	@Autowired private FornecedorDAO fornecedorDAO = new FornecedorDAO();
	@Autowired private LocalizacaoDAO localizacaoDAO = new LocalizacaoDAO();
	@Autowired private UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	@RequestMapping("/bicicletas")
	public ModelAndView showBikes() {
		ModelAndView mv = new ModelAndView("bicicletas");
		mv.addObject("bicicletas", bicicletaDAO.findAll());
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
	
	@RequestMapping("/estacoes")
	public ModelAndView showEstacoes() {
		ModelAndView mv = new ModelAndView("estacoes");
		mv.addObject("estacoes", estacaoDAO.findAll());
		return mv;
	}
	
	@RequestMapping("/fornecedores")
	public ModelAndView showFornecedores() {
		ModelAndView mv = new ModelAndView("fornecedores");
		mv.addObject("fornecedores", fornecedorDAO.findAll());
		return mv;
	}

}