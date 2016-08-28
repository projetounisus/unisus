package uniSusWeb.beans;

import uniSusWeb.constants.Constants;
import uniSusWeb.constants.Constants.UnidadeAtendimentoTipo;

public class UnidadeAtendimento extends BeanAbstrato {
	private Endereco endereco;
	private String nome;
	private UnidadeAtendimentoTipo tipo;
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Constants.UnidadeAtendimentoTipo getTipo() {
		return tipo;
	}
	public void setTipo(Constants.UnidadeAtendimentoTipo tipo) {
		this.tipo = tipo;
	}
}
