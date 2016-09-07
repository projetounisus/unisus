package uniSusWeb.beans;

import java.util.List;

public class ProfissionalSus extends Usuario{
	private List<Endereco> enderecoTrabalho;
	private UnidadeSaude unidadeAtendimento;
	public List<Endereco> getEnderecoTrabalho() {
		return enderecoTrabalho;
	}
	public void setEnderecoTrabalho(List<Endereco> enderecoTrabalho) {
		this.enderecoTrabalho = enderecoTrabalho;
	}
	public UnidadeSaude getUnidadeAtendimento() {
		return unidadeAtendimento;
	}
	public void setUnidadeAtendimento(UnidadeSaude unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}
}
