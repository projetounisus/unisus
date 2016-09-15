package uniSusWeb.controllersRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uniSusWeb.beans.LoginUsuario;
import uniSusWeb.controllers.ControllerAbstratoRest;
import uniSusWeb.model.Modelo;
import uniSusWeb.model.ModeloLogin;

@Controller
@RequestMapping("/usuarioLogin")
public class ControllerLogin extends ControllerAbstratoRest<LoginUsuario>{

	@Override
	protected Modelo<LoginUsuario> obterModelo() {
		return new ModeloLogin();
	}
	
}
