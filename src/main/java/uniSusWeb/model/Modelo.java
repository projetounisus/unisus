package uniSusWeb.model;

import java.util.List;

import uniSusWeb.beans.BeanAbstrato;

public interface Modelo<T extends BeanAbstrato> {

	public void deletar(long id);

	public void atualizar(long id);

	public List<T> listar();

	public T obterPorId(long id);

	public T obterPorNome(String name);
}
