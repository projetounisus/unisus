package uniSusWeb.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import uniSusWeb.beans.AbstractBean;
import uniSusWeb.beans.Register;
import uniSusWeb.beans.User;

@Service("RegisterService")
public class RegisterService implements IService<Register> {

	public Register get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	public void update(long id) {
		// TODO Auto-generated method stub

	}

	public List<Register> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Register getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Register getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Register> listByProfissionals(List<Long> ids){
		this.userService = new UserService();
		//TODO: Implementar pesquisa
		List<User> profissionals = new ArrayList<User>();

		for(Long id: ids){
			User user = this.userService.get(id);
			profissionals.add(user);
		}

		List<Register> registerByProfissional = new ArrayList<Register>();

		for(User profissional: profissionals){
			Register register = new Register();
			register.setName("registro nome padrão - " + profissional.getUserName());
			register.setResposibleProfissionals(Arrays.asList(profissional));

			User pacient = new User();
			pacient.setUserName("teste paciente - " + register.getName());
			register.setPacients(Arrays.asList(pacient));

			registerByProfissional.add(register);

			Register register2 = new Register();
			register2.setName("registro nome padrão - " + profissional.getUserName() + "2");
			register2.setResposibleProfissionals(Arrays.asList(profissional));

			User pacient2 = new User();
			pacient2.setUserName("teste paciente - " + register2.getName() + "2");
			register2.setPacients(Arrays.asList(pacient2));

			registerByProfissional.add(register2);
		}

		return registerByProfissional;
	}

	private UserService userService;
}
