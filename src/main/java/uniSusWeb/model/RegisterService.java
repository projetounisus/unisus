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


	public List<Register> listByProfissionals(List<Long> ids){
		//TODO: Implementar pesquisa
		List<User> profissionals = new ArrayList<User>();

		for(Long id: ids){
			User user = new User();
			user.setId(id);
			user.setUserName("nome Profissional " + String.valueOf(id));
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
		}

		return registerByProfissional;
	}

}
