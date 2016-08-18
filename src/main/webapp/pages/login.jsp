<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
	<head>
		<link href="<c:url value="/resources/3rdparty/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
		<title>UniSus</title>
	</head>

	<body>
		<div class="col-centered">
				<form>
					<label>Nome</label>
					<input type="text"/>
					<label>Senha</label>
					<input type="text"/>
				</form>
		</div>
	</body>
</html>
