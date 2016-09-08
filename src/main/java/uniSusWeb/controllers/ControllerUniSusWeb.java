package uniSusWeb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.LoginUsuario;
import uniSusWeb.beans.Usuario;
import uniSusWeb.model.Modelo;
import uniSusWeb.model.ModeloLogin;
import uniSusWeb.model.ModeloUsuario;

@Controller
@RequestMapping
public class ControllerUniSusWeb extends ControllerAbstrato{
	@RequestMapping("/")
	public ModelAndView paginaLogin(){
		return new ModelAndView("login");
	}

	//TODO: Extrair tratamento de erro
	@RequestMapping("/login")
	public ModelAndView logarUsuario(@RequestParam String nomeUsuario, @RequestParam String senhaUsuario, HttpSession sessao){
		ModeloLogin modeloLogin = new ModeloLogin();
		LoginUsuario loginPorNome;
		
		try{
			loginPorNome = modeloLogin.obterPorNome(nomeUsuario);
		}catch(Exception e){
			ModelAndView respostaLoginFalhou = new ModelAndView();
			respostaLoginFalhou.addObject("respostaLogin", e.getMessage());
			return respostaLoginFalhou;
		}
		
		String usuario_senha = loginPorNome.getSenhaUsuario();
		
		if(usuario_senha.equals(senhaUsuario)){
			Usuario usuario = loginPorNome.getUsuario();
			sessao.setAttribute("user", usuario);
			ModelAndView respostaLoginEfetuado = new ModelAndView("redirect:usuario/perfil");
			return respostaLoginEfetuado;
		}
		
		ModelAndView respostaLoginFalhou = new ModelAndView();
		respostaLoginFalhou.addObject("respostaLogin", "usu�rio ou senha incorretos");
		return respostaLoginFalhou;
	}

	private ModeloUsuario userService;	
}
