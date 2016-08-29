package uniSusWeb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.LoginUsuario;
import uniSusWeb.beans.Usuario;
import uniSusWeb.model.ModeloLogin;
import uniSusWeb.model.ModeloUsuario;

@Controller
@RequestMapping("/")
public class ControllerLogin extends ControllerAbstrato{
	@RequestMapping
	public ModelAndView paginaLogin(){
		return new ModelAndView("login");
	}

	@RequestMapping("login")
	public ModelAndView logarUsuario(@RequestParam String nomeUsuario, @RequestParam String senhaUsuario, HttpSession sessao){
		/*
		this.userService = new ModeloUsuario();
		Usuario userByName = userService.obterPorNome(nomeUsuario);
		String password = userByName.getSenhaUsuario();

		if(password.equals(senhaUsuario)){
			sessao.setAttribute("user", userByName);
			ModelAndView autorizedResponse = new ModelAndView("redirect:usuario/perfil");
			return autorizedResponse;
		}

		ModelAndView unauthorizedResponse = new ModelAndView();
		unauthorizedResponse.addObject("respostaLogin", "usu�rio ou senha incorretos");
		return unauthorizedResponse;
		*/
		
		ModeloLogin modeloLogin = new ModeloLogin();
		LoginUsuario loginPorNome = modeloLogin.obterPorNome(nomeUsuario);
		String usuario_senha = loginPorNome.getUsuario_senha();
		
		if(usuario_senha.equals(senhaUsuario)){
			Usuario usuario = loginPorNome.getUsuario();
			sessao.setAttribute("user", usuario);
			ModelAndView autorizedResponse = new ModelAndView("redirect:usuario/perfil");
			return autorizedResponse;
		}
		
		ModelAndView unauthorizedResponse = new ModelAndView();
		unauthorizedResponse.addObject("respostaLogin", "usu�rio ou senha incorretos");
		return unauthorizedResponse;
	}

	private ModeloUsuario userService;
}
