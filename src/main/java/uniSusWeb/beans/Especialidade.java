package uniSusWeb.beans;

import java.util.List;

public class Especialidade extends BeanAbstrato{
	private String nome;
	private String descricao;
	private List<RegistroTipo> tiposRegistros;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<RegistroTipo> getTiposRegistros() {
		return tiposRegistros;
	}
	public void setTiposRegistros(List<RegistroTipo> tiposRegistros) {
		this.tiposRegistros = tiposRegistros;
	}
}
