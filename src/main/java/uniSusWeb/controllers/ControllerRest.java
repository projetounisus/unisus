package uniSusWeb.controllers;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.model.Modelo;

public abstract class ControllerRest <T extends BeanAbstrato> extends ControllerAbstrato{
	@RequestMapping(name= "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public T obter(@PathVariable Long id) throws Exception{
		Modelo<T> modelo = this.obterModelo();
		return modelo.obterPorId(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<T> list(){
		 Modelo<T> modelo = obterModelo();
		 return modelo.listar();
	}
	
	@RequestMapping(name="/{id}", method = RequestMethod.POST)
	public void delete(@RequestBody T bean){
		Modelo<T> modelo = obterModelo();
		
		modelo.deletar(bean);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void update(@RequestBody T bean){
		Modelo<T> modelo = obterModelo();
		modelo.atualizar(bean);
	}
	
	protected abstract Modelo<T> obterModelo();
}
