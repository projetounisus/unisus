package uniSusWeb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import uniSusWeb.beans.LoginUsuario;
import uniSusWeb.model.Modelo;
import uniSusWeb.model.ModeloLogin;

@RequestMapping("/usuarioLogin")
public class ControllerLogin extends ControllerRest<LoginUsuario>{

	@Override
	protected Modelo<LoginUsuario> obterModelo() {
		// TODO Auto-generated method stub
		return new ModeloLogin();
	}
	
}
