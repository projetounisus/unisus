package uniSusWeb.beans;

import java.util.List;

public class Medico extends ProfissionalSus {
	private String crm;
	private List<Especialidade> especialidades;
	private UnidadeAtendimento unidadeAtendimento;
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
	public UnidadeAtendimento getUnidadeAtendimento() {
		return unidadeAtendimento;
	}
	public void setUnidadeAtendimento(UnidadeAtendimento unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}
}
