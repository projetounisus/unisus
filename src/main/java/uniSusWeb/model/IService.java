package uniSusWeb.model;

import java.util.List;

import uniSusWeb.beans.AbstractBean;

public interface IService<T extends AbstractBean> {
	public T get(long id);

	public void delete(long id);

	public void update(long id);

	public List<T> list();

	public T getById(long id);

	public T getByName(String name);
}
