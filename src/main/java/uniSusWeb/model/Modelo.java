package uniSusWeb.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import uniSusWeb.beans.BeanAbstrato;

public abstract class Modelo<T extends BeanAbstrato> extends DAO{
	
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
		this.fecharSessaoBanco(sessao);
	}

	public void atualizar(T bean){
		Session sessao = this.obterSessaoBanco();
		Transaction transacao = sessao.beginTransaction();
		
		String hql = obterQueryAtualizar();
		Query query = sessao.createQuery(hql);
		query.executeUpdate();
		
		transacao.commit();
		this.fecharSessaoBanco(sessao);
	}

	public List<T> listar(){
		Session sessao = this.obterSessaoBanco();
		
		String hql = obterQueryAtualizar();
		List<T> lista = sessao.createQuery(hql).getResultList();
		
		this.fecharSessaoBanco(sessao);
		return lista;
	}
	
	public void inserir(T bean){
		Session sessao = this.obterSessaoBanco();
		Transaction transacao = sessao.beginTransaction();
		
		sessao.save(bean);
		
		transacao.commit();
		this.fecharSessaoBanco(sessao);
	}
	
	//TODO: Extrair mensagens de erro
	
	public T obterPorId(long id) throws Exception{
		Session sessao = this.obterSessaoBanco();
		Transaction transacao = sessao.beginTransaction();
		int PRIMEIRO_ELEMENTO = 0;
		
		String hql = obterQueryObterPorId();
		
		Query query = sessao.createQuery(hql);
		query.setParameter("id", id);
		List lista = query.getResultList();

		transacao.commit();
		this.fecharSessaoBanco(sessao);
		
		if(lista.size() < 1){
			throw new Exception("Id n�o foi encontrado");
		}else if(lista.size() > 1){
			throw new Exception("Existem ids repetidos");
		}else{
			T bean = (T)lista.get(PRIMEIRO_ELEMENTO);
			return bean;
		}
	}

	public T obterPorNome(String nome) throws Exception{
		Session sessao = this.obterSessaoBanco();
		Transaction transacao = sessao.beginTransaction();
		int PRIMEIRO_ELEMENTO = 0;
		
		String hql = obterQueryObterPorNome();
		
		Query query = sessao.createQuery(hql);
		query.setParameter("nome", nome);
		List lista = query.getResultList();
		
		transacao.commit();
		this.fecharSessaoBanco(sessao);
		
		if(lista.size() < 1){
			throw new Exception("Nome n�o foi encontrado");
		}else if(lista.size() > 1){
			throw new Exception("Existem nomes repetidos");
		}else{
			T bean = (T)lista.get(PRIMEIRO_ELEMENTO);
			return bean;
		}
	}
}
