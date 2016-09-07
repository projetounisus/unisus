package uniSusWeb.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;
import org.hibernate.loader.plan.build.internal.returns.EncapsulatedEntityIdentifierDescription;

@Entity
@Table(name="usuario")
public class Usuario extends BeanAbstrato{
	
	@Column(name = "nome_completo")
	private String nomeCompleto;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="usuario", targetEntity = Telefones.class)
	private List<Telefones> telefones;
	@Column(name="cpf")
	private String cpf;
	
	// chaves estrangeiras
	@OneToOne
	@JoinColumn(name="endereco_idendereco")
	private Endereco enderecoResidencial;
	@OneToOne
	@JoinColumn(name="login_idlogin")
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
}
