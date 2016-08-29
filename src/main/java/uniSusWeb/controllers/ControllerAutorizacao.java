package uniSusWeb.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ControllerAutorizacao extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest requisicao, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession sessao = requisicao.getSession();
		boolean isNotinitialPageRequests = !(requisicao.getRequestURI().endsWith("/") ||
				requisicao.getRequestURI().endsWith("/login") ||
				requisicao.getRequestURI().endsWith("/logout"));
		boolean igualURLAssets = requisicao.getRequestURI().contains("assets");

		if(sessao.getAttribute("user") == null && isNotinitialPageRequests){
			if(sessao.getAttribute("user") == null && igualURLAssets)
				return true;

			response.sendRedirect("logout");
			return false;
		}

		return true;
	}
}
