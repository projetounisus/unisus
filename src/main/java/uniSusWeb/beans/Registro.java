package uniSusWeb.beans;

import java.util.List;

public class Registro extends BeanAbstrato {
	private String nome;
	private String tipo;
	private List<Usuario> profissionaisResponsaveis;
	private List<Usuario> pacientes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public List<Usuario> getProfissionaisResponsaveis() {
		return profissionaisResponsaveis;
	}
	public void setProfissionaisResponsaveis(List<Usuario> profissionaisResponsaveis) {
		this.profissionaisResponsaveis = profissionaisResponsaveis;
	}
	public List<Usuario> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<Usuario> pacients) {
		this.pacientes = pacients;
	}


}
