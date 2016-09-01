package uniSusWeb.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
		
		String hql = "from LoginUsuario where nome_usuario = :nome";
		Session session = this.getCurrentDBSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery(hql);
		Query queryWithParameters = query.setParameter("nome", nome);
		List results = queryWithParameters.list();
		
		transaction.commit();
		
		if(results.size() != 0){
			LoginUsuario login = (LoginUsuario)results.get(0);
			return login;
		}
		
		return null;
	}

}
