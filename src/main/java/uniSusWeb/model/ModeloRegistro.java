package uniSusWeb.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.ProfissionalSus;
import uniSusWeb.beans.Registro;
import uniSusWeb.beans.Usuario;
import uniSusWeb.beans.UsuarioComum;

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
