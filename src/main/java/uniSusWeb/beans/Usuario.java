package uniSusWeb.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario extends BeanAbstrato implements Serializable{
	private String nomeCompleto;
//	private List<Telefones> telefones;
	private String cpf;
	private Date dataNascimento;
	
	// chaves estrangeiras
	private Endereco endereco;
	private LoginUsuario login;

	@OneToOne(targetEntity = LoginUsuario.class ,cascade=CascadeType.ALL)
	@JoinColumn(name="login")
	public LoginUsuario getLogin() {
		return login;
	}
	public void setLogin(LoginUsuario login) {
		this.login = login;
	}
	@Column(name = "nome")
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	//@OneToMany(targetEntity = Telefones.class)
//	public List<Telefones> getTelefones() {
//		return telefones;
//	}
//	public void setTelefones(List<Telefones> telefones) {
//		this.telefones = telefones;
//	}
	@Column(name="cpf")
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Column(name="dt_nascimento")
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="endereco")
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco enderecoResidencial) {
		this.endereco = enderecoResidencial;
	}
}
