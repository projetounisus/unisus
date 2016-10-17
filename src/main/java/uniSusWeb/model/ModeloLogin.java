package uniSusWeb.model;

import org.springframework.stereotype.Service;
import uniSusWeb.beans.LoginUsuario;

@Service("modeloLogin")
public class ModeloLogin extends DAO<LoginUsuario>{

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
		return "FROM LoginUsuario";
	}

	@Override
	protected String obterQueryObterPorNome() {
		return "FROM LoginUsuario WHERE nome_usuario = :nome";
	}

	@Override
	protected String obterQueryObterPorId() {
		return "FROM LoginUsuario WHERE id = :id";
	}
}
