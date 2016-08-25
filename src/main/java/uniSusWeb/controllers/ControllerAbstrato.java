package uniSusWeb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public abstract class ControllerAbstrato {
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession currentSession){
		currentSession.invalidate();
		return new ModelAndView("redirect:/");
	}
}
