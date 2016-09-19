<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
    
<link href="<c:url value="/assets/css/pages/login.css"/>" rel="stylesheet" type="text/css"/>

<div class="centered-div">
	<h1>UniCadSus</h1>
	<form method="post" action="login">
		<input type="text" name="nomeUsuario" placeholder="nome do usário"/>
		<input type="password" name="senhaUsuario" placeholder="senha" />
		<button type="submit" class="btn btn-primary btn-block btn-large">Logar</button>
		<span class="alert-text"><h4>${respostaLogin}</h4></span>
	</form>
</div>
