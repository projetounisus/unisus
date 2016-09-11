package uniSusWeb.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.Registro;
import uniSusWeb.beans.Usuario;
import uniSusWeb.beans.UsuarioComum;
import uniSusWeb.dtos.RegistroDTO;
import uniSusWeb.model.Modelo;
import uniSusWeb.model.ModeloRegistro;
import uniSusWeb.model.ModeloUsuario;
import uniSusWeb.utils.ConversorParaDto;

//TODO: implementar spring security

@Controller
@RequestMapping("/usuario")
public class ControllerUsuario extends ControllerRest<UsuarioComum> {

	@RequestMapping("/{id}/Register")
	public ResponseEntity<?> obterRegistros(@PathVariable(value = "id") long id){
//		this.modeloRegistros = new ModeloRegistro();
//
//		List<Registro> regsitrosPorProfissional = this.modeloRegistros.listarPorProfissional(Arrays.asList(id));
//		List<RegistroDTO> dtos = new ArrayList<RegistroDTO>();
//
//		for(Registro registroAtual: regsitrosPorProfissional){
//			dtos.add(ConversorParaDto.fromRegister(registroAtual));
//		}
		
		//ResponseEntity resposta = new ResponseEntity(dtos, HttpStatus.OK);
		ResponseEntity resposta = new ResponseEntity("mock", HttpStatus.OK);
		return resposta;
	}

	private ModeloRegistro modeloRegistros;

	@Override
	protected Modelo<UsuarioComum> obterModelo() {
		// TODO Auto-generated method stub
		return new ModeloUsuario();
	}
}
