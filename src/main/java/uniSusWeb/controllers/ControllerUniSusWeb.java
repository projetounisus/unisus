package uniSusWeb.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ModelAndView paginaLogin(HttpSession sessao){
		Object usuario = sessao.getAttribute("user");
		
		if(usuario == null)
			return new ModelAndView("login");
		
		Usuario usuarioLogado = (Usuario)usuario;
		ModelAndView mainPage = new ModelAndView("mainPage");
		mainPage.addObject("userId", usuarioLogado.getId());
		mainPage.addObject("userName", usuarioLogado.getLogin().getNomeUsuario());
		
		return mainPage;
	}

	//TODO: Extrair tratamento de erro
	@RequestMapping(path = "/login", method = RequestMethod.POST)
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
			ModelAndView respostaLoginEfetuado = new ModelAndView("redirect:/");
			return respostaLoginEfetuado;
		}
		
		ModelAndView respostaLoginFalhou = new ModelAndView();
		respostaLoginFalhou.addObject("respostaLogin", "usuário ou senha incorretos");
		return respostaLoginFalhou;
	}

	private ModeloUsuario userService;	
}
