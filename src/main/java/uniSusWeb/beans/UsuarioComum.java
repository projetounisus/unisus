package uniSusWeb.beans;

public class UsuarioComum extends Usuario{
	private String nCns;
	private DadosMedicosAuxiliares estadoAtual;
	
	public String getnCns() {
		return nCns;
	}
	public void setnCns(String nCns) {
		this.nCns = nCns;
	}
	public DadosMedicosAuxiliares getEstadoAtual() {
		return estadoAtual;
	}
	public void setEstadoAtual(DadosMedicosAuxiliares estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
}
