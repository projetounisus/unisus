package uniSusWeb.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.ProfissionalSus;
import uniSusWeb.beans.Registro;
import uniSusWeb.beans.Usuario;
import uniSusWeb.beans.UsuarioComum;

@Service("RegisterService")
public class ModeloRegistro implements Modelo<Registro> {

	public void deletar(long id) {
		// TODO Auto-generated method stub

	}

	public void atualizar(long id) {
		// TODO Auto-generated method stub

	}

	public List<Registro> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	public Registro obterPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Registro obterPorNome(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Registro> listarPorProfissional(List<Long> ids){
		this.userService = new ModeloUsuario();
		//TODO: Implementar pesquisa
		List<ProfissionalSus> profissionals = new ArrayList<ProfissionalSus>();

		for(Long id: ids){
			ProfissionalSus user = (ProfissionalSus)this.userService.obterPorId(id);
			profissionals.add(user);
		}

		List<Registro> registerByProfissional = new ArrayList<Registro>();

		for(ProfissionalSus profissional: profissionals){
			Registro register = new Registro();
			register.setNome("registro nome padrão - " + profissional.getNomeUsuario());
			register.setProfissionaisResponsaveis(Arrays.asList(profissional));

			UsuarioComum pacient = new UsuarioComum();
			pacient.setNomeUsuario("teste paciente - " + register.getNome());
			register.setPacientes(Arrays.asList(pacient));

			registerByProfissional.add(register);

			Registro register2 = new Registro();
			register2.setNome("registro nome padrão - " + profissional.getNomeUsuario() + "2");
			register2.setProfissionaisResponsaveis(Arrays.asList(profissional));

			UsuarioComum pacient2 = new UsuarioComum();
			pacient2.setNomeUsuario("teste paciente - " + register2.getNome() + "2");
			register2.setPacientes(Arrays.asList(pacient2));

			registerByProfissional.add(register2);
		}

		return registerByProfissional;
	}

	private ModeloUsuario userService;
}
