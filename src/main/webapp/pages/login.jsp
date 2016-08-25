<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>
	<head>
		<title>UniSus</title>
		<link href="<c:url value="/assets/3rdparty/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
		<link herf="<c:url value="/assets/css/3rdparty/normalize.css"/>" rel="stylesheet" type="text/css"/>

		<link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet" type="text/css"/>

		<script src="<c:url value="/assets/js/jquery-3.1.0.min.js"/>" type="text/javascript"></script>
	</head>

	<body>
		<div class="centered-div">
			<h1>UniCadSus</h1>
			<form method="post" action="login">
				<input type="text" name="nomeUsuario" placeholder="nome do usário"/>
				<input type="password" name="senhaUsuario" placeholder="senha" />
				<button type="submit" class="btn btn-primary btn-block btn-large">Logar</button>
				<span class="alert-text"><h4>${respostaLogin}</h4></span>
			</form>
		</div>
	</body>
</html>
