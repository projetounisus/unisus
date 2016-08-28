package uniSusWeb.utils;

import java.util.ArrayList;
import java.util.List;

import uniSusWeb.beans.ProfissionalSus;
import uniSusWeb.beans.Registro;
import uniSusWeb.beans.RegistroTipo;
import uniSusWeb.beans.Usuario;
import uniSusWeb.beans.UsuarioComum;
import uniSusWeb.dtos.RegistroDTO;

public class ConversorParaDto {
	public static RegistroDTO fromRegister(Registro original){
		RegistroDTO dto = new RegistroDTO();
		dto.nome = original.getNome();
		RegistroTipo tipo = original.getTipo();
		dto.tipoNome = tipo.getNome();
		dto.tipoId = tipo.getId();
		dto.profissionaisResponsaveis = new ArrayList<String>();
		dto.pacientes = new ArrayList<String>();

		List<ProfissionalSus> profissionaisResponsaveis = original.getProfissionaisResponsaveis();
		for(Usuario profissionalAtual: profissionaisResponsaveis){
			String nomeAtual = profissionalAtual.getNomeUsuario();
			dto.profissionaisResponsaveis.add(nomeAtual);
		}

		List<UsuarioComum> pacientes = original.getPacientes();
		for(Usuario pacienteAtual: pacientes){
			String nomeAtual = pacienteAtual.getNomeUsuario();
			dto.pacientes.add(nomeAtual);
		}

		return dto;
	}
}
