package uniSusWeb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.AbstractBean;
import uniSusWeb.beans.User;
import uniSusWeb.model.UserService;

@Controller
@RequestMapping("/")
public class LoginController extends AbstractController{
	@RequestMapping
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}

	@RequestMapping("login")
	public ModelAndView loginUser(@RequestParam String userName, @RequestParam String userPassword, HttpSession session){

		this.userService = new UserService();
		User userByName = userService.getByName(userName);
		String password = userByName.getUserPassword();

		if(password.equals(userPassword)){
			session.setAttribute("user", userByName);
			ModelAndView autorizedResponse = new ModelAndView("redirect:usuario/perfil");
			return autorizedResponse;
		}

		ModelAndView unauthorizedResponse = new ModelAndView();
		unauthorizedResponse.addObject("sessionResponse", "usuário ou senha incorretos");
		return unauthorizedResponse;

	}

	private UserService userService;
}
