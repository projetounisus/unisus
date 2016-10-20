package uniSusWeb.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="medico")
public class Medico extends ProfissionalSus {
	private String crm;
	private List<Especialidade> especialidades;
	private UnidadeSaude unidadeAtendimento;
	
	@Column(name="crm")
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	//TODO: Implementar mapeamento de um para muitos
	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="unidade_atendimento")
	public UnidadeSaude getUnidadeAtendimento() {
		return unidadeAtendimento;
	}
	public void setUnidadeAtendimento(UnidadeSaude unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}
}
