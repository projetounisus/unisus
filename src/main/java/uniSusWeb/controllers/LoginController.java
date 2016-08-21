package uniSusWeb.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//TODO: implementar spring security

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}

	@RequestMapping("login")
	public ModelAndView loginUser(@RequestParam String userName, @RequestParam String userPassword){
		return new ModelAndView("redirect:mainPage");
	}
}
