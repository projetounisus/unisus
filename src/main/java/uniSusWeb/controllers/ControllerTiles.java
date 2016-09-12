package uniSusWeb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTiles {
	
	@RequestMapping("/head")
	public String defaultHeader(){
		return "templateTiles/defaultHeader";
	}
	
	@RequestMapping("/header")
	public String defaulrHead(){
		return "templateTiles/defaultHead";
	}
}
