package uniSusWeb.controllersForms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uniSusWeb.beans.Usuario;
import uniSusWeb.controllers.ControllerAbstratoForm;

@Controller
@RequestMapping("/usuario")
public class ControllerUsuarioForm extends ControllerAbstratoForm<Usuario> {

	@Override
	protected String obterNomeClassObjeto() {
		return "usuario";
	}
	
}
