package uniSusWeb.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import uniSusWeb.beans.LoginUsuario;

public class ModeloLogin extends DAO{

	public void deletar(long id) {
		// TODO Auto-generated method stub
		
	}

	public void atualizar(long id) {
		// TODO Auto-generated method stub
		
	}

	public List<LoginUsuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public LoginUsuario obterPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public LoginUsuario obterPorNome(String nome) {
		// TODO Auto-generated method stub
		// TODO: extrair query
		// TODO: extrair criação da sessão, evitar repetiação de código
		String hql = "from login where nome_usuario :nome";
		SessionFactory sessionFactory = this.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		LoginUsuario login = (LoginUsuario)session.createQuery(hql).setParameter("nome", nome).list().get(0);
		
		return login;	
	}

}
