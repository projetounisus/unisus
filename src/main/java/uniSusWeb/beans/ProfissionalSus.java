package uniSusWeb.beans;

import java.util.List;

public class ProfissionalSus extends Usuario{
	private List<Endereco> enderecoTrabalho;
	private UnidadeAtendimento unidadeAtendimento;
	public List<Endereco> getEnderecoTrabalho() {
		return enderecoTrabalho;
	}
	public void setEnderecoTrabalho(List<Endereco> enderecoTrabalho) {
		this.enderecoTrabalho = enderecoTrabalho;
	}
	public UnidadeAtendimento getUnidadeAtendimento() {
		return unidadeAtendimento;
	}
	public void setUnidadeAtendimento(UnidadeAtendimento unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}
}
