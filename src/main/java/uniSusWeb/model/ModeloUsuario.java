package uniSusWeb.model;

import java.util.List;

import org.springframework.stereotype.Service;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.Usuario;

public class ModeloUsuario implements Modelo {

	public void deletar(long id) {
		// TODO Auto-generated method stub

	}

	public void atualizar(long id) {
		// TODO Auto-generated method stub

	}

	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario obterPorNome(String name) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setNomeUsuario(name);
		usuario.setSenhaUsuario("senha");
		return usuario;
	}

	public Usuario obterPorId(long id) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNomeUsuario("Nome Padrão");
		usuario.setSenhaUsuario("senha");
		return usuario;
	}
}
