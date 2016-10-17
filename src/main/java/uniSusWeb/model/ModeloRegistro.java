package uniSusWeb.model;

import org.springframework.stereotype.Service;

import uniSusWeb.beans.Registro;

@Service("modeloRegistro")
public class ModeloRegistro extends DAO<Registro> {

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
}
