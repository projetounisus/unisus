function buildListRegisterItem(register){
  var $newItem = $("<div>",{id: register.name});
  var $itemProfissionalNames = $("<div>");
  var $itemPacientNames = $("<div>");
  var $itemRegisterName = $("<div>");

  var $spanRegisterName = $("<span>");
  $spanRegisterName.html(register.name);
  $itemRegisterName.append($spanRegisterName);

  $.each(register.responsiblesProfissionalsNames, function(index, current){
    var profissionalNameSpan = $("<span>");
    profissionalNameSpan.html(current);

    $itemProfissionalNames.append(profissionalNameSpan);
  });

  $.each(register.pacientsNames, function(index, current){
    var pacientNameSpan = $("<span>");
    pacientNameSpan.html(current);

    $itemPacientNames.append(pacientNameSpan);
  });


  $newItem.append($itemRegisterName);
  $newItem.append($itemProfissionalNames);
  $newItem.append($itemPacientNames);

  return $newItem
}

function listRegisters(registers){
  var $registerList = $("#registersList");

  $.each(registers, function(index, current){
    var newRegisterItem = buildListRegisterItem(current);
    $registerList.append(newRegisterItem);
  });
}


function constructPage(){
  var $userId = $("#userId");
  var userId = $userId.val();

  $.ajax({url: "usuario/" + userId + "/Register",
        success: function(data){
          listRegisters(data);
        }
      });
}

$(document).ready(constructPage);
