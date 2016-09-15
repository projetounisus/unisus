<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>UniCadSus</title>
		
		<%@ include file="/pages/templateTiles/defaultHead.jsp" %>
		
		<script src="<c:url value="/assets/js/pages/templates/form.js"/>" type="text/javascript"></script>
	</head>
	<body>
		<%@ include file="/pages/templateTiles/defaultHeader.jsp" %>
		<input type="hidden" value="${idObjeto}" id="idObjeto"/>
		<input type="hidden" value="${nomeObjeto}" id="nomeObjeto"/>
		
		<div>
			<div id="formDivContainer"/>
			
			<button type="button" id="confirmForm">OK</button>
		</div>
		
	</body>
</html>