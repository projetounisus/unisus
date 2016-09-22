package uniSusWeb.utils;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.Usuario;

public class ModelAndViewUtils {
	public static ModelAndView construirModeloPadronizado(ModelAndView model){
		ModelAndView modelPadrao = model;
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
		HttpSession sessao = requestAttributes.getRequest().getSession();
		
		Usuario usuarioLogado = (Usuario)sessao.getAttribute("user");
		modelPadrao.addObject("userName", usuarioLogado.getLogin().getNomeUsuario());
		modelPadrao.addObject("userId", usuarioLogado.getId());
		
		return modelPadrao;
	}
}
