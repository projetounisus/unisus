package uniSusWeb.controllersRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uniSusWeb.beans.Usuario;

import uniSusWeb.controllers.ControllerAbstratoRest;
import uniSusWeb.model.DAO;
import uniSusWeb.model.ModeloRegistro;
import uniSusWeb.model.ModeloUsuario;

@Controller
@RequestMapping("/usuario")
public class ControllerUsuario extends ControllerAbstratoRest<Usuario> {

	
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
	protected DAO<Usuario> obterModelo() {
		// TODO Auto-generated method stub
		return new ModeloUsuario();
	}
}
