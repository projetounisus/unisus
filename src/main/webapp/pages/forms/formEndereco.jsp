<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<link href="<c:url value="/assets/css/pages/form.css"/>"
	rel="stylesheet" type="text/css" />

<div id="formEndereco" class="row-fluid formDiv">	
	<div class="col-md-1">
		<label>UF</label> 
		<c:import url="/pages/templateTiles/inputTemplates/ufSelect.jsp">
			<c:param name="name" value="estado"/>
			<c:param name="id" value="estado"/>
			<c:param name="classes" value="commomForm"/>
		</c:import>
	</div>
	
	<div class="col-md-3">
		<label>Cidade</label> <input type="text" name="cidade" id="cidade" class="commomForm"/>
	</div>


	<div class="col-md-4">
		<label>Bairro</label> <input type="text" name="bairro" id="bairro" class="commomForm" />
	</div>


	<div class="col-md-4">
		<label>Rua</label> <input type="text" name="rua" id="rua" class="commomForm"/>
	</div>
</div>
