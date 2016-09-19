package uniSusWeb.controllersForms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uniSusWeb.beans.Usuario;
import uniSusWeb.constants.Constants;
import uniSusWeb.controllers.ControllerAbstratoForm;

@Controller
@RequestMapping("/usuario")
public class ControllerUsuarioForm extends ControllerAbstratoForm<Usuario> {

	@Override
	protected String obterNomeClassObjeto() {
		return "usuario";
	}

	@Override
	protected String obterPathForm() {
		// TODO Auto-generated method stub
		return Constants.PREFIXO_PATH_FORMS + "/formUsuario";
	}
	
}
