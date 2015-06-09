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
	@Autowired private CartaoDAO cartaoDAO;
	@Autowired private EstacaoDAO estacaoDAO;
	@Autowired private FornecedorDAO fornecedorDAO;
	@Autowired private LocalizacaoDAO localizacaoDAO;
	@Autowired private UsuarioDAO usuarioDAO;
	
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/bicicletas")
	public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		ModelAndView mv = new ModelAndView("bicicletas");

		mv.addObject("bicicletas", bicicletaDAO.findAll());
//		mv.addObject("name", name);
		return mv;
	}

}