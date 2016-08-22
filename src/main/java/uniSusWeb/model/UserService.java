package uniSusWeb.model;

import java.util.List;

import org.springframework.stereotype.Service;

import uniSusWeb.beans.AbstractBean;
import uniSusWeb.beans.User;

@Service("UserService")
public class UserService implements IService {

	public User get(long id) {
		// TODO Implementar acesso ao banco
		User user = new User();
		user.setUserName("Usuário Padrão");
		user.setUserPassword("senhaPadrao123");
		user.setId(1L);
		return user;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	public void update(long id) {
		// TODO Auto-generated method stub

	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByName(String name) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(1L);
		user.setUserName(name);
		user.setUserPassword("senha padrão");
		return user;
	}

	public User getById(long id) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(id);
		user.setUserName("Nome Padrão");
		user.setUserPassword("senha padrão");
		return user;
	}
}
