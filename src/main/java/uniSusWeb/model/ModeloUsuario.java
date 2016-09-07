package uniSusWeb.model;

import java.util.List;

import org.springframework.stereotype.Service;

import uniSusWeb.beans.Registro;
import uniSusWeb.beans.Usuario;

@Service("modeloUsuario")
public class ModeloUsuario extends Modelo {

	@Override
	protected String obterQueryDeletar() {
		return null;
	}

	@Override
	protected String obterQueryAtualizar() {
		return null;
	}

	@Override
	protected String obterQueryListar() {
		return null;
	}

	@Override
	protected String obterQueryObterPorNome() {
		return null;
	}

	@Override
	protected String obterQueryObterPorId() {
		return null;
	}
	
	public List<Registro> obterRegistroPorPorfissional(Usuario usuario){
		return null;
	}
	
}
