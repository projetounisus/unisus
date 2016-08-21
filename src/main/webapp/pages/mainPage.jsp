<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>
  <head>
    <title>UniSus</title>
    <link href="<c:url value="/assets/3rdparty/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet" type="text/css"/>
    <link herf="<c:url value="/assets/css/normalize.css"/>" rel="stylesheet" type="text/css"/>

    <script src="<c:url value="/assets/js/jquery-3.1.0.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/assets/js/pages/mainPage.js"/>" type="text/javascript"></script>
  </head>

  <input type="hidden" value="${userId}" id="userId"/>

  <body>
    <h2>${userName}</h2>

    <div class="centered-div">
      <h3>Main Page</h3>

      <div id="registersList"></div>
    </div>
  </body>
</html>