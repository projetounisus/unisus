<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>

<html>
  <head>
    <title>UniSus</title>
	<%@ include file="/pages/templateTiles/defaultHead.jsp" %>
  </head>

  <input type="hidden" value="${userId}" id="userId"/>

  <body>
   	<%@ include file="/pages/templateTiles/defaultHeader.jsp" %>	
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
