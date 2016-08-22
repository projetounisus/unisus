package uniSusWeb.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.Register;
import uniSusWeb.beans.User;
import uniSusWeb.dtos.RegisterDTO;
import uniSusWeb.model.RegisterService;
import uniSusWeb.model.UserService;
import uniSusWeb.utils.ToDTOConverter;

//TODO: implementar spring security

@Controller
@RequestMapping("/usuario")
public class UserController {

	@RequestMapping("/perfil")
	public ModelAndView perfilPage(HttpSession currentSession){
		ModelAndView mainPageModel = new ModelAndView("mainPage");

		//TODO: Obter usuário da sessão
		User loggedUser = (User) currentSession.getAttribute("user");

		mainPageModel.addObject("userId", loggedUser.getId());
		mainPageModel.addObject("userName", loggedUser.getUserName());

		return mainPageModel;
	}

	@RequestMapping("/{id}/Register")
	public ResponseEntity<?> getRegisters(@PathVariable(value = "id") long id){
		this.registerService = new RegisterService();

		//TODO: pegar id da sessão
		List<Long> idsList = new ArrayList<Long>();
		idsList.add(1L);
		idsList.add(2L);
		idsList.add(3L);
		List<Register> listByProfissionals = this.registerService.listByProfissionals(idsList);
		List<RegisterDTO> registersDTOList = new ArrayList<RegisterDTO>();

		for(Register currentRegister: listByProfissionals){
			registersDTOList.add(ToDTOConverter.fromRegister(currentRegister));
		}

		ResponseEntity responseEntity = new ResponseEntity(registersDTOList, HttpStatus.OK);
		return responseEntity;
	}

	private RegisterService registerService;
}
