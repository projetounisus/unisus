package uniSusWeb.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="telefones")
public class Telefones extends BeanAbstrato {
	@ManyToOne
	@JoinColumn(name="usuario_idusuario")
	private Usuario usuario;
	@Column(name="telefone")
	private String telefone;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
