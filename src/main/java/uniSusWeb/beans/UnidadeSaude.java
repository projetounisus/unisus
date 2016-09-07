package uniSusWeb.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import uniSusWeb.constants.Constants;
import uniSusWeb.constants.Constants.UnidadeAtendimentoTipo;

@Entity
@Table(name="unidade_saude")
public class UnidadeSaude extends BeanAbstrato {
	
	@Column(name="nome")
	private String nome;
	private UnidadeAtendimentoTipo tipo;
	
	//chaves estrangeiras
	@OneToOne
	@JoinColumn(name="endereco_idendereco")
	private Endereco endereco;
	
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
