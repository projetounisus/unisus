package uniSusWeb.beans;

import java.util.List;

public class Medico extends ProfissionalSus {
	private String crm;
	private List<Especialidade> especialidades;
	private UnidadeSaude unidadeAtendimento;
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}
	public UnidadeSaude getUnidadeAtendimento() {
		return unidadeAtendimento;
	}
	public void setUnidadeAtendimento(UnidadeSaude unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}
}
