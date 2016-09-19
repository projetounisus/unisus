<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page isELIgnored="false" %>

<script src="<c:url value="/assets/js/pages/templates/form.js"/>" type="text/javascript"></script>

<input type="hidden" value="${idObjeto}" id="idObjeto"/>
<input type="hidden" value="${nomeObjeto}" id="nomeObjeto"/>

<div>	
	<tiles:insertAttribute name="formFields" value="${formFields}"/>
	<button type="button" id="confirmForm">OK</button>
</div>
