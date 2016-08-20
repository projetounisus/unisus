<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
	<head>
		<title>UniSus</title>
		<link href="<c:url value="/assets/3rdparty/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
		<link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet" type="text/css"/>
		<link herf="<c:url value="/assets/css/normalize.css"/>" rel="stylesheet" type="text/css"/>

		<script src="<c:url value="/assets/js/jquery-3.1.0.min.js"/>" type="text/javascript"></script>
		<script src="<c:url value="/assets/js/pages/login.js"/>" type="text/javascript"></script>
	</head>

	<body>
		<div class="login">
			<h1>UniSus</h1>
			<form method="post" onsubmit="uniSusWeb/login">
				<input type="text" name="u" placeholder="Username" required="required" />
				<input type="password" name="p" placeholder="Password" required="required" />
				<button type="submit" class="btn btn-primary btn-block btn-large">Logar</button>
			</form>
		</div>
	</body>
</html>
