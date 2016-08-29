package uniSusWeb.beans;

import javax.persistence.Entity;

@Entity
public class LoginUsuario extends BeanAbstrato{
	private String usuario_senha;
	private String usuario_nome;
	
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
