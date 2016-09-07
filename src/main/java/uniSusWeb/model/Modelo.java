package uniSusWeb.model;

import java.util.List;

import org.hibernate.Session;
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
		
		sessao.delete(bean);
		
		this.fecharSessaoBanco(sessao);
	}

	public void atualizar(T bean){
		Session sessao = this.obterSessaoBanco();
		
		String hql = obterQueryAtualizar();
		Query query = sessao.createQuery(hql);
		query.executeUpdate();
		
		this.fecharSessaoBanco(sessao);
	}

	public List<T> listar(){
		Session sessao = this.obterSessaoBanco();
		
		String hql = obterQueryAtualizar();
		List<T> lista = sessao.createQuery(hql).getResultList();
		
		this.fecharSessaoBanco(sessao);
		return lista;
	}
	
	//TODO: Extrair mensagens de erro
	
	public T obterPorId(long id) throws Exception{
		Session sessao = this.obterSessaoBanco();
		int PRIMEIRO_ELEMENTO = 0;
		
		String hql = obterQueryObterPorId();
		
		Query query = sessao.createQuery(hql);
		query.setParameter("id", id);
		List lista = query.getResultList();

		this.fecharSessaoBanco(sessao);
		
		if(lista.size() < 1){
			throw new Exception("Id não foi encontrado");
		}else if(lista.size() > 1){
			throw new Exception("Existem ids repetidos");
		}else{
			T bean = (T)lista.get(PRIMEIRO_ELEMENTO);
			return bean;
		}
	}

	public T obterPorNome(String nome) throws Exception{
		Session sessao = this.obterSessaoBanco();
		int PRIMEIRO_ELEMENTO = 0;
		
		String hql = obterQueryObterPorNome();
		
		Query query = sessao.createQuery(hql);
		query.setParameter("nome", nome);
		List lista = query.getResultList();
		
		this.fecharSessaoBanco(sessao);
		
		if(lista.size() < 1){
			throw new Exception("Id anão foi encontrado");
		}else if(lista.size() > 1){
			throw new Exception("Existe ids repetidos");
		}else{
			T bean = (T)lista.get(PRIMEIRO_ELEMENTO);
			return bean;
		}
	}
}
