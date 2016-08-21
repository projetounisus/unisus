package uniSusWeb.utils;

import java.util.ArrayList;
import java.util.List;

import uniSusWeb.beans.Register;
import uniSusWeb.beans.User;
import uniSusWeb.dtos.RegisterDTO;

public class ToDTOConverter {
	public static RegisterDTO fromRegister(Register source){
		RegisterDTO dto = new RegisterDTO();
		dto.name = source.getName();
		dto.type = source.getType();
		dto.responsiblesProfissionalsNames = new ArrayList<String>();
		dto.pacientsNames = new ArrayList<String>();

		List<User> resposibleProfissionals = source.getResposibleProfissionals();
		for(User currentProfissional: resposibleProfissionals){
			String currentUserName = currentProfissional.getUserName();
			dto.responsiblesProfissionalsNames.add(currentUserName);
		}

		List<User> pacients = source.getResposibleProfissionals();
		for(User currentPacient: pacients){
			String currentUserName = currentPacient.getUserName();
			dto.pacientsNames.add(currentUserName);
		}

		return dto;
	}
}
