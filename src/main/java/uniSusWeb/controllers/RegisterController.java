package uniSusWeb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uniSusWeb.beans.AbstractBean;
import uniSusWeb.beans.Register;
import uniSusWeb.beans.User;
import uniSusWeb.model.IService;
import uniSusWeb.model.RegisterService;

@Controller
@RequestMapping("Register")
public class RegisterController {

	//FIXME: será substituido por mesma função no UserController
	@RequestMapping("/profissional/{idProfissional}")
	public ResponseEntity<?> getRegistersByProfisssional(@RequestParam Long idProfissional){
		List<Register> registers = registerService.listByProfissionals(Arrays.asList(idProfissional));
		return new ResponseEntity(registers, HttpStatus.OK);
	}

	private RegisterService registerService;

}
