<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>
  <head>
    <title>UniSus</title>
	<%@ include file="/pages/templateTiles/defaultHeader.jsp" %>
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
              <h3><span>{{nome}}</span></h3>
              <div>
                <span><h4>Responsáveis</h4></span>
                <div>
                  {{#each profissionaisResponsaveis}}
                    <span>{{this}}</span>
                  {{/each}}
                </div>

                <span><h4>Pacientes</h4></span>
                <div>
                  {{#each pacientes}}
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
