package uniSusWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.User;

@Controller
@RequestMapping("/mainPage")
public class PerfilController {
	@RequestMapping
	public ModelAndView mainPage(){
		ModelAndView mainPageModel = new ModelAndView("mainPage");

		//TODO: Obter usuário da sessão
		User loggedUser = new User();
		loggedUser.setId(1L);
		mainPageModel.addObject("userId", loggedUser.getId());
		mainPageModel.addObject("userName", loggedUser.getUserName());

		return mainPageModel;
	}
}
