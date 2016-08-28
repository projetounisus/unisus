package uniSusWeb.beans;

import java.util.List;

public class Registro extends BeanAbstrato {
	private String nome;
	private RegistroTipo tipo;
	private List<ProfissionalSus> profissionaisResponsaveis;
	private List<UsuarioComum> pacientes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public RegistroTipo getTipo() {
		return tipo;
	}
	public void setTipo(RegistroTipo tipo) {
		this.tipo = tipo;
	}
	public List<ProfissionalSus> getProfissionaisResponsaveis() {
		return profissionaisResponsaveis;
	}
	public void setProfissionaisResponsaveis(List<ProfissionalSus> profissionaisResponsaveis) {
		this.profissionaisResponsaveis = profissionaisResponsaveis;
	}
	public List<UsuarioComum> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<UsuarioComum> pacients) {
		this.pacientes = pacients;
	}


}
