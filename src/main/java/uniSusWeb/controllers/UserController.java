package uniSusWeb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.AbstractBean;
import uniSusWeb.beans.Register;
import uniSusWeb.beans.User;
import uniSusWeb.dtos.RegisterDTO;
import uniSusWeb.model.IService;
import uniSusWeb.model.RegisterService;
import uniSusWeb.model.UserService;
import uniSusWeb.utils.ToDTOConverter;

//TODO: implementar spring security

@Controller
@RequestMapping("/")
public class UserController {

	//FIXME: a página inicial não deve ser carregada pelo controller de usuário
	@RequestMapping
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}

	@RequestMapping("login")
	public ModelAndView loginUser(@RequestParam String userName, @RequestParam String userPassword){
		this.userService = new UserService();

		//TODO: instancair usuário na sessão
		//TODO: implementar real autenticação
		ModelAndView modelAndView = new ModelAndView("redirect:mainPage");

		return modelAndView;
	}

	@RequestMapping("usuario/{id}/Register")
	public ResponseEntity<?> getRegisters(@PathVariable(value = "id") long id){
		this.registerService = new RegisterService();

		//TODO: pegar id da sessão
		List<Register> listByProfissionals = this.registerService.listByProfissionals(Arrays.asList(id));
		List<RegisterDTO> registersDTOList = new ArrayList<RegisterDTO>();

		for(Register currentRegister: listByProfissionals){
			registersDTOList.add(ToDTOConverter.fromRegister(currentRegister));
		}

		return new ResponseEntity(registersDTOList, HttpStatus.OK);
	}

	private UserService userService;

	private RegisterService registerService;
}
