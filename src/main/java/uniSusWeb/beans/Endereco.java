package uniSusWeb.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Null;

@Entity
@Table(name="endereco")
public class Endereco extends BeanAbstrato implements Serializable {
	
	private String pais;
	private String estado;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private String infoAdicional;
	
	@Column(name="pais")
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Column(name="uf")
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Column(name="cidade")
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Column(name="bairro")
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	@Column(name="rua")
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	@Column(name="numero", nullable=true)
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Column(name="ponto_referencia", nullable=true)
	public String getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	
}
