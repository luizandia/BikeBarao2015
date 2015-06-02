package HelloWorldController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


 
@Controller
public class HelloWorldController {
	@Autowired private PizzaDAO pizzaDAO;
	String message = "Welcome to Spring MVC!";
 
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("helloworld");
		List<Pizza> pizzas = pizzaDAO.findAll();
		System.out.println(pizzas.get(0).getName());
	    mv.addObject("pizzas", pizzas);
		
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}