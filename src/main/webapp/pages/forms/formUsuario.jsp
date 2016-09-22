<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<link href="<c:url value="/assets/css/pages/form.css"/>"
	rel="stylesheet" type="text/css" />

<div id="formUsuario" class="row-fluid formDiv">	
	<div class="col-md-4">
		<label>Nome</label> <input type="text" name="nomeCompleto"
			id="nomeCompleto" class="commomForm"/>
	</div>

	<div class="col-md-4">
		<label>CPF</label> <input type="text" name="cpf" id="cpf" class="commomForm"/>
	</div>

	<div class="col-md-4">
		<label>Data Nascimento</label> <input type="date"
			name="dataNascimento" id="dataNascimento" class="commomForm"/>
	</div>
</div>

<%@ include file="/pages/forms/formEndereco.jsp"%>