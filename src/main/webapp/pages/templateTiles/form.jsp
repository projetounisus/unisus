<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>UniSusCad</title>
		
		<%@ include file="/pages/templateTiles/defaultHead.jsp" %>
		
		<script src="<c:url value="/assets/js/pages/templates/form.js"/>" type="text/javascript"></script>
		
		<link href="<c:url value="/assets/css/pages/mainPage.css"/>" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<%@ include file="/pages/templateTiles/defaultHeader.jsp" %>
		<input type="hidden" value="${userId}" id="userId"/>
		
		<div>  
		   <div id="formDiv" class="row-fluid form-container">
		     <div class="form-group col-md-4">
		       <label>Nome</label>
		       <input type="text" name="nomeCompleto" id="nomeCompleto"/>
		     </div>
		
		     <div class="form-group col-md-4">
		       <label>CPF</label>
		       <input type="text" name="cpf" id="cpf"/>
		     </div>
		
		     <div class="form-group col-md-4s">
		       <label>Data Nascimento</label>
		       <input type="date" name="dataNascimento" id="dataNascimento"/>
		     </div>
		
		     <button id="confirmForm">OK</button>
		   </div>
		</div>
	</body>
</html>