package uniSusWeb.controllersRest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uniSusWeb.beans.Registro;
import uniSusWeb.controllers.ControllerAbstrato;
import uniSusWeb.model.ModeloRegistro;

// FIXME: Refactor completo
@Controller
@RequestMapping("Register")
public class ControllerRegistro extends ControllerAbstrato {

	//FIXME: será substituido por mesma função no UserController
	@RequestMapping("/profissional/{idProfissional}")
	public ResponseEntity<?> obterRegistrosPorProfissional(@RequestParam Long idProfissional){
		return new ResponseEntity("Dados mockados", HttpStatus.OK);
	}

	private ModeloRegistro modeloRegistro;

}
