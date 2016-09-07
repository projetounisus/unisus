package uniSusWeb.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class LoginUsuario extends BeanAbstrato{
	@Column(name="senha_usuario")
	private String senhaUsuario;
	@Column(name="nome_usuario")
	private String nomeUsuario;
	
	//chaves estrangeiras (inversa)
	@OneToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}	
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
}
