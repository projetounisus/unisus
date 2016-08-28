package uniSusWeb.beans;

import java.util.List;

public class DadosMedicosAuxiliares extends BeanAbstrato {
	private String tipoSanguineo;
	private float peso;
	private float altura;
	private List<Registro> tratamentosAtuais;
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public List<Registro> getTratamentosAtuais() {
		return tratamentosAtuais;
	}
	public void setTratamentosAtuais(List<Registro> tratamentosAtuais) {
		this.tratamentosAtuais = tratamentosAtuais;
	}
	
	
}
