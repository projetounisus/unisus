package uniSusWeb.utils;

import java.util.ArrayList;
import java.util.List;

import uniSusWeb.beans.Registro;
import uniSusWeb.beans.Usuario;
import uniSusWeb.dtos.RegistroDTO;

public class ConversorParaDto {
	public static RegistroDTO fromRegister(Registro original){
		RegistroDTO dto = new RegistroDTO();
		dto.nome = original.getNome();
		dto.tipo = original.getTipo();
		dto.profssionaisResponsaveis = new ArrayList<String>();
		dto.pacientes = new ArrayList<String>();

		List<Usuario> profissionaisResponsaveis = original.getProfissionaisResponsaveis();
		for(Usuario profissionalAtual: profissionaisResponsaveis){
			String nomeAtual = profissionalAtual.getNomeUsuario();
			dto.profssionaisResponsaveis.add(nomeAtual);
		}

		List<Usuario> pacientes = original.getProfissionaisResponsaveis();
		for(Usuario pacienteAtual: pacientes){
			String nomeAtual = pacienteAtual.getNomeUsuario();
			dto.pacientes.add(nomeAtual);
		}

		return dto;
	}
}
