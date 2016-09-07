package uniSusWeb.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.LoginUsuario;

@Service("modeloLogin")
public class ModeloLogin extends Modelo<LoginUsuario>{

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
