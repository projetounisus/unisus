package uniSusWeb.beans;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class LoginUsuario extends BeanAbstrato{
	//TODO: refatorar nome, porque foi escrito assim?
	
	private String usuario_senha;
	private String usuario_nome;
	private Usuario usuario;
	
	@OneToOne
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usaurio) {
		this.usuario = usaurio;
	}
	public String getUsuario_senha() {
		return usuario_senha;
	}
	public void setUsuario_senha(String usuario_senha) {
		this.usuario_senha = usuario_senha;
	}
	public String getUsuario_nome() {
		return usuario_nome;
	}
	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}
}
