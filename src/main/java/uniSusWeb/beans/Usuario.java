package uniSusWeb.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario extends BeanAbstrato{
	
	@Column(name = "nome_completo")
	private String nomeCompleto;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="usuario", targetEntity = Telefones.class)
	private List<Telefones> telefones;
	@Column(name="cpf")
	private String cpf;
	
	private Date dataNascimento;
	
	// chaves estrangeiras
	@OneToOne
	@JoinColumn(name="endereco_idendereco")
	private Endereco endereco;
	@OneToOne
	@JoinColumn(name="id_login")
	private LoginUsuario login;

	public LoginUsuario getLogin() {
		return login;
	}
	public void setLogin(LoginUsuario login) {
		this.login = login;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public List<Telefones> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefones> telefones) {
		this.telefones = telefones;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco enderecoResidencial) {
		this.endereco = enderecoResidencial;
	}
}
