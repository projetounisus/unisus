package uniSusWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.model.UserService;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}

	@RequestMapping("login")
	public ModelAndView loginUser(@RequestParam String userName, @RequestParam String userPassword){

		//TODO: instancair usuário na sessão
		//TODO: implementar real autenticação
		ModelAndView modelAndView = new ModelAndView("redirect:usuario/perfil");

		return modelAndView;
	}

	private UserService userService;
}
