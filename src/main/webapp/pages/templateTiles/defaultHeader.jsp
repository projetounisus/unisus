<link href="<c:url value="/assets/css/pages/templates/header.css"/>" rel="stylesheet" type="text/css"/>
<script src="<c:url value="/assets/js/pages/templates/header.js"/>" type="text/javascript"></script>

<header class="main-header">
      <nav class="navbar">
        <h1 class="item logo-unisus">UniCadSus</h1>

        <div class="item user-name dropdown">
          <div class="dropdown">
            <div class="dropdown-toggle" type="button" id="loginOptions" data-toggle="dropdown">
            	${userName}
            	<span class="caret"></span></div>
            <ul class="dropdown-menu item user-name dropdown" role="menu" aria-labelledby="loginOptions">
              <li role="presentation" id="logoutOption"><a role="menuitem" tabindex="-1" href="#">Logout</a></li>
            </ul>
          </div>
        </div>

      </nav>
</header>
