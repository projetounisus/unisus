<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>
  <head>
    <title>UniSus</title>

    <link href="<c:url value="/assets/3rdparty/bootstrap/css/bootstrap.css"/>" rel="stylesheet" type="text/css"/>
    <link herf="<c:url value="/assets/css/3rdparty/normalize.css"/>" rel="stylesheet" type="text/css"/>

    <link herf="<c:url value="/assets/css/pages/mainPage.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/assets/css/style.css"/>" rel="stylesheet" type="text/css"/>

    <!--<script src="<c:url value="/assets/js/3rdParty/jquery-3.1.0.min.js"/>" type="text/javascript"></script>-->
    <script src="<c:url value="/assets/js/3rdParty/jquery-1.9.1.js"/>" type="text/javascript"></script> <!--Versão para o bootstrap-->
    <script src="<c:url value="/assets/js/3rdParty/jquery-ui.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/assets/js/3rdParty/handlebars-v4.0.5.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/assets/3rdparty/bootstrap/js/bootstrap.js"/>" type="text/javascript"></script>

    <script src="<c:url value="/assets/js/pages/mainPage.js"/>" type="text/javascript"></script>
  </head>

  <input type="hidden" value="${userId}" id="userId"/>

  <body>
    <header class="main-header">
      <nav class="navbar">
        <h1 class="item logo-unisus">UniCadSus</h1>

        <div class="item user-name dropdown">
          <div class="dropdown">
            <div class="dropdown-toggle" type="button" id="loginOptions" data-toggle="dropdown">${userName}
            <span class="caret"></span></div>
            <ul class="dropdown-menu item user-name dropdown" role="menu" aria-labelledby="loginOptions">
              <li role="presentation" id="logoutOption"><a role="menuitem" tabindex="-1" href="#">Logout</a></li>
            </ul>
          </div>
        </div>

      </nav>
    </header>

    <div class="centered-div-horizontal">

      <!--centered-div-adaptive-->

      <div>
        <h3>Registros Recentes</h3>
      </div>

      <div id="registerListContainer" class="register-list-container">

        <script id="registersList" type="text/x-handlebars-template">
          {{#each register}}
            <div class="box box-primary register-container">
              <h3><span>{{name}}</span></h3>
              <div>
                <span><h4>Responsáveis</h4></span>
                <div>
                  {{#each responsiblesProfissionalsNames}}
                    <span>{{this}}</span>
                  {{/each}}
                </div>

                <span><h4>Pacientes</h4></span>
                <div>
                  {{#each pacientsNames}}
                    <span>{{this}}</span>
                  {{/each}}
                </div>
              </div>
            </div>
          {{/each}}
        </script>
      </div>

    </div>
  </body>
</html>
