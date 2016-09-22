<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<link href="<c:url value="/assets/css/pages/form.css"/>"
	rel="stylesheet" type="text/css" />

<div id="formEndereco" class="row-fluid formDiv">	
	<div class="col-md-4">
		<label>Bairro</label> <input type="text" name="bairro" id="bairro" class="commomForm" />
	</div>

	<div class="col-md-2">
		<label>Cidade</label> <input type="text" name="cidade" id="cidade" class="commomForm"/>
	</div>

	<div class="col-md-2">
		<label>UF</label> <input type="text" name="estado" id="estado" class="commomForm"/>
	</div>

	<div class="col-md-4">
		<label>Rua</label> <input type="text" name="rua" id="rua" class="commomForm"/>
	</div>
</div>
