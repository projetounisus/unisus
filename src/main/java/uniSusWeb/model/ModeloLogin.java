package uniSusWeb.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import uniSusWeb.beans.LoginUsuario;
import uniSusWeb.model.hibernateUtils.HibernateSessionFactory;

public class ModeloLogin implements Modelo{

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
		String hql = "from login where nome_usuario :nome";
		Session sessao = HibernateSessionFactory.criaNovaSessaoHibernate();
		return sessao.createQuery(hql).setParameter("nome", nome).list();	
	}

}
