package uniSusWeb.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
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
		CriteriaBuilder criteriaBuilder = sessao.getCriteriaBuilder();
		
		CriteriaQuery<Usuario> query = criteriaBuilder.createQuery(Usuario.class);
		Root<Usuario> usuarioRoot = query.from(Usuario.class);
		
		query.select(usuarioRoot);
		query.where(criteriaBuilder.equal(usuarioRoot.get("login"), login.getId()));
		
		List<Usuario> resultList = sessao.createQuery(query).getResultList();
		return resultList.get(0);
	}
	
	public void criarUsuarioTeste(Usuario novoUsuario){
		
	}

}
