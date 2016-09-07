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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String obterQueryAtualizar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String obterQueryListar() {
		// TODO Auto-generated method stub
		return "FROM LoginUsuario";
	}

	@Override
	protected String obterQueryObterPorNome() {
		// TODO Auto-generated method stub
		return "FROM LoginUsuario WHERE nome_usuario = :nome";
	}

	@Override
	protected String obterQueryObterPorId() {
		// TODO Auto-generated method stub
		return "FROM LoginUsuario WHERE id = :id";
	}

//	public void deletar(long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void atualizar(long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public List<LoginUsuario> listar() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public LoginUsuario obterPorId(long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public LoginUsuario obterPorNome(String nome) {
//		// TODO Auto-generated method stub
//		// TODO: extrair query
//		// TODO: extrair criação da sessão, evitar repetiação de código
//		
//		String hql = "from LoginUsuario where nome_usuario = :nome";
//		Session session = this.obterSessaoBanco();
//		
//		Transaction transaction = session.beginTransaction();
//		
//		Query query = session.createQuery(hql);
//		Query queryWithParameters = query.setParameter("nome", nome);
//		List results = queryWithParameters.list();
//		
//		transaction.commit();
//		
//		if(results.size() != 0){
//			LoginUsuario login = (LoginUsuario)results.get(0);
//			return login;
//		}
//		
//		return null;
//	}
//
//	public void atualizar(BeanAbstrato bean) {
//		// TODO Auto-generated method stub
//		
//	}

}
