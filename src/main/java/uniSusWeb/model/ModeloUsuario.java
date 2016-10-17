package uniSusWeb.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import uniSusWeb.beans.LoginUsuario;
import uniSusWeb.beans.Registro;
import uniSusWeb.beans.Usuario;

@Service("modeloUsuario")
public class ModeloUsuario extends DAO<Usuario> {

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
	
	public Usuario obterUsuarioPorLogin(LoginUsuario login){
		Session sessao = this.obterSessaoBanco();
		Query query = sessao.createQuery("FROM Usuario WHERE login = :idLogin");
		query.setParameter("idLogin", login.getId());
		
		List<Usuario> resultList = query.getResultList();
		return resultList.get(0);
	}
	
	public void criarUsuarioTeste(Usuario novoUsuario){
		
	}

}
