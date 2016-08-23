function listRegisters(registers){
  var $registerList = $("#registersList");
  var registerListTemplateContent = $registerList.html();
  var registerListTemplate = Handlebars.compile(registerListTemplateContent);

  var registerListContent = registerListTemplate({register:registers});

  var $registerListContainer = $("#registerListContainer");
  $registerListContainer.html(registerListContent);
  var $registersContainers = $(".register-container");

  $.each($registersContainers, function(index, currentContainer){
    $(currentContainer).accordion({
      active: false,
      collapsible: true
    });
  });
}

function constructPage(){
  var $userId = $("#userId");
  var userId = $userId.val();

  $.ajax({url: userId + "/Register",
    success: function(data){
      listRegisters(data);
    }
  });

  var logoutOpition = $("#logoutOption");
  logoutOpition.bind("click", function(){
    console.log("logout");

    //FIXME: pode ser uma má prática, analizar melhor este método
    window.location.assign("/uniSusWeb/usuario/logout");

    /*
    $.ajax({
      url:"uniSusWeb/ususario/logout"
    });
    */
  });

}

$(document).ready(constructPage);
