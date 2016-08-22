<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>
  <head>
    <title>UniSus</title>
    <link href="<c:url value="/assets/3rdparty/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
    <link herf="<c:url value="/assets/css/3rdparty/normalize.css"/>" rel="stylesheet" type="text/css"/>

    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet" type="text/css"/>

    <script src="<c:url value="/assets/js/3rdParty/jquery-3.1.0.min.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/assets/js/3rdParty/handlebars-v4.0.5.js"/>" type="text/javascript"></script>

    <script src="<c:url value="/assets/js/pages/mainPage.js"/>" type="text/javascript"></script>
  </head>

  <input type="hidden" value="${userId}" id="userId"/>

  <body>
    <h2>${userName}</h2>
    <div class="centered-div">
      <h3>Main Page</h3>

      <div id="registerListContainer" class="container">
        <script id="registersList" type="text/x-handlebars-template">
          {{#each register}}
            <div>
              <h4><span>{{name}}</span></h4>
            </div>

            <span><h5>Responsáveis</h5></span>
            <div>
              {{#each responsiblesProfissionalsNames}}
                <span>{{this}}</span>
              {{/each}}
            </div>

            <span><h5>Pacientes</h5></span>
            <div>
              {{#each pacientsNames}}
                <span>{{this}}</span>
              {{/each}}
            </div>
          {{/each}}
        </script>
      </div>

    </div>
  </body>
</html>
