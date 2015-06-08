package Java;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


 
@Controller
public class PrincipalWebControlller {
	@Autowired private BicicletaDAO BicicletaDAO;
	@Autowired private CartaoDAO CartaoDAO;
	@Autowired private EstacaoDAO EstacaoDAO;
	@Autowired private FornecedorDAO FornecedorDAO;
	@Autowired private LocalizacaoDAO LocalizacaoDAO;
	@Autowired private UsuarioDAO UsuarioDAO;
	
	
	
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
//		List<Usuario> Usuario = UsuarioDAO.findAll();
//	    mv.addObject("usuarios", Usuario);
		
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}