package uniSusWeb.controllers;

import java.net.Authenticator.RequestorType;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.model.DAO;

public abstract class ControllerAbstratoRest <T extends BeanAbstrato> extends ControllerAbstrato{
	@GetMapping("/{id}")
	public ResponseEntity<T> obter(@PathVariable Long id) throws Exception{
		DAO<T> modelo = this.obterModelo();
		
		T resultado = modelo.obterPorId(id);
		ResponseEntity<T> resposta = new ResponseEntity<T>(resultado, HttpStatus.OK);
		
		return resposta;
	}
	
	@GetMapping
	public ResponseEntity<?> listar(){
		 DAO<T> modelo = obterModelo();
		 
		 List<T> lista = modelo.listar();
		 ResponseEntity<List<T>> resultado = new ResponseEntity<List<T>>(lista, HttpStatus.OK);
		 
		 return resultado;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletar(@PathVariable Long id) throws Exception{
		DAO<T> modelo = obterModelo();
		
		T bean = modelo.obterPorId(id);
		modelo.deletar(bean);
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping("/{id}")
	public ResponseEntity<?> atualizar(@PathVariable long id, @RequestBody T bean){
		DAO<T> modelo = obterModelo();
		bean.setId(id);
		modelo.atualizar(bean);
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> criar(@RequestBody T bean){
		DAO<T> modelo = this.obterModelo();
		modelo.inserir(bean);
		
		return new ResponseEntity(HttpStatus.OK);
	}
	
	protected abstract DAO<T> obterModelo();
}
