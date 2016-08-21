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

	public List<AbstractBean> list() {
		// TODO Auto-generated method stub
		return null;
	}
}
