<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
	<head>
		<title>UniSus</title>
		<link href="<c:url value="/assets/3rdparty/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
		<link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet" type="text/css"/>

		<script src="<c:url value="/assets/js/jquery-3.1.0.min.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/assets/js/pages/login.js"/>" type="text/javascript"></script>
	</head>

	<body>
		<div class="centered-div" onsubmit="uniSusWeb/login" method="post">
			<form>
				<label>Nome</label><input type="text" id="nameInput"/><br>
				<label>Senha</label><input type="text" id="passwordInput"/>
				<input type="submit"/>
			</form>
		</div>
	</body>
</html>
