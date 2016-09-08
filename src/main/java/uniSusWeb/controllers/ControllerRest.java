package uniSusWeb.controllers;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.model.Modelo;

/*
 * Respons�vel pelo mapeamento REST.
 * Consiste em fornecer as fun��es de um CRUD para um certo dado (Bean no nosso caso) 
 * mapeando tais fun��es c�m URLs espec�ficas e tipos espec�ficos, ou seja, fornece a fun��es de buscar(obter), 
 * listar, deleter e atualizar.
 * As URLs s�o:
 * obter: url = nomeDoDado/idDoDado, tipo = GET
 * listar: url = nomeDoDado, tipo = GET
 * atualizar: url = nomeDoDado/idDoDao, tipo = PUT (sendo id idDoDado uma vari�vel de URL, devem ser passados os dados 
 * a serem atulizados no corpo da requisi��o, deve-se analisar a requisi��o feita pela p�gina)
 * deletar: url = nomeDoDado/idDoDado, tipo = DELETE
 * criar: url = nomeDoDado, tipo = POST
 * 
 * � poss�vel ver que nas URLs n�o existe nomeDoDado, pois ele � obtido na heran�a que � feita com outro
 * Controller
 * */
public abstract class ControllerRest <T extends BeanAbstrato> extends ControllerAbstrato{
	@RequestMapping(name= "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public T obter(@PathVariable Long id) throws Exception{
		Modelo<T> modelo = this.obterModelo();
		return modelo.obterPorId(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<T> listar(){
		 Modelo<T> modelo = obterModelo();
		 return modelo.listar();
	}
	
	@RequestMapping(name="/{id}", method = RequestMethod.POST)
	public void deletar(@RequestBody T bean){
		Modelo<T> modelo = obterModelo();
		
		modelo.deletar(bean);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void atualizar(@RequestBody T bean){
		Modelo<T> modelo = obterModelo();
		modelo.atualizar(bean);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void criar(@RequestBody T bean){
		Modelo<T> modelo = this.obterModelo();
		modelo.inserir(bean);
	}
	
	protected abstract Modelo<T> obterModelo();
}
