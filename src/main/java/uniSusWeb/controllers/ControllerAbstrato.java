package uniSusWeb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public abstract class ControllerAbstrato {
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession sessao){
		if(!sessao.isNew())
		{
			sessao.invalidate();
		}
		
		return new ModelAndView("redirect:/");
	}
}
