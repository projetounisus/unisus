package uniSusWeb.beans;

import org.springframework.stereotype.Repository;

@Repository
public class Usuario extends BeanAbstrato{
	private String nomeUsuario;
	private String senhaUsuario;

	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsusario) {
		this.nomeUsuario = nomeUsusario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
}
