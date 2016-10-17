package uniSusWeb.model;

import java.util.List;
import org.hibernate.*;
import org.hibernate.cfg.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.Endereco;
import uniSusWeb.beans.LoginUsuario;
import uniSusWeb.beans.Telefones;
import uniSusWeb.beans.Usuario;

public abstract class DAO<T extends BeanAbstrato>{
	
	private static Session sessaoSingleton;
	
	protected Session obterSessaoBanco(){
		if(sessaoSingleton == null)
		{
			Configuration configuration = new Configuration()
					.addAnnotatedClass(BeanAbstrato.class)
					.addAnnotatedClass(Usuario.class)
					.addAnnotatedClass(Endereco.class)
					.addAnnotatedClass(Telefones.class)
					.addAnnotatedClass(LoginUsuario.class)
					.configure();
			
			SessionFactory buildSessionFactory = configuration.buildSessionFactory();
			sessaoSingleton = buildSessionFactory.openSession();
		}
		
		return sessaoSingleton;
	}
	
	protected void fecharSessaoBanco(Session session) {
		session.close();
	}
	
	abstract protected String obterQueryDeletar();
	
	abstract protected String obterQueryAtualizar();
	
	abstract protected String obterQueryListar();
	
	abstract protected String obterQueryObterPorNome();
	
	abstract protected String obterQueryObterPorId();
	
	public void deletar(T bean){ 
		Session sessao = this.obterSessaoBanco();
		Transaction transacao = sessao.beginTransaction();
		
		sessao.delete(bean);
		
		transacao.commit();
	}

	public void atualizar(T bean){
		Session sessao = this.obterSessaoBanco();
		Transaction transacao = sessao.beginTransaction();
		
		String hql = obterQueryAtualizar();
		Query query = sessao.createQuery(hql);
		query.executeUpdate();
		
		transacao.commit();
	}

	public List<T> listar(){
		Session sessao = this.obterSessaoBanco();
		
		String hql = obterQueryAtualizar();
		List<T> lista = sessao.createQuery(hql).getResultList();
		
		return lista;
	}
	
	public void inserir(T bean){
		Session sessao = this.obterSessaoBanco();
		Transaction transacao = sessao.beginTransaction();
		
		sessao.save(bean);
		
		transacao.commit();
	}
	
	//TODO: Extrair mensagens de erro
	
	public T obterPorId(long id) throws Exception{
		Session sessao = this.obterSessaoBanco();
		int PRIMEIRO_ELEMENTO = 0;
		
		String hql = obterQueryObterPorId();
		
		Query query = sessao.createQuery(hql);
		query.setParameter("id", id);
		List lista = query.getResultList();
		
		if(lista.size() < 1){
			throw new Exception("Id não foi encontrado");
		}else if(lista.size() > 1){
			throw new Exception("Existem ids repetidos");
		}else{
			T bean = (T)lista.get(PRIMEIRO_ELEMENTO);
			return bean;
		}
	}

	/* (non-Javadoc)
	 * @see uniSusWeb.model.IDAO#obterPorNome(java.lang.String)
	 */
	public T obterPorNome(String nome) throws Exception{
		Session sessao = this.obterSessaoBanco();
		int PRIMEIRO_ELEMENTO = 0;
		
		String hql = obterQueryObterPorNome();
		
		Query query = sessao.createQuery(hql);
		query.setParameter("nome", nome);
		List lista = query.getResultList();
		
		if(lista.size() < 1){
			throw new Exception("Nome não foi encontrado");
		}else if(lista.size() > 1){
			throw new Exception("Existem nomes repetidos");
		}else{
			T bean = (T)lista.get(PRIMEIRO_ELEMENTO);
			return bean;
		}
	}
}
