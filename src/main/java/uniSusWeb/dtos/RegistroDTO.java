package uniSusWeb.dtos;

import java.util.List;

import uniSusWeb.beans.RegistroTipo;
import uniSusWeb.constants.Constants;

public class RegistroDTO {
	public String nome;
	public String tipoNome;
	public Long tipoId;
	public List<String> profissionaisResponsaveis;
	public List<String> pacientes;
}
