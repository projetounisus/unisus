var Form = function(){
	var nomeObjeto = $("#nomeObjeto").val();
	var idObjeto = $("#idObjeto").val();
	var $confirmForm = $("#confirmForm");
	var $formDiv = $("#formDivContainer");
	
	var construirDto = function(inputs){
		var dto = {};
		
		$.each(inputs, function(index, current){
			var $current = $(current);
			dto[current.name] = $current.val();
		});
		
		return dto;
	}
	
	var construirForm = function(){
		$.ajax({
			url:utils.buildURL("/" + nomeObjeto + "/form/" + idObjeto),
			success: function(page){
				$formDiv.append(page);
			}
		});
	}
	
	$confirmForm.bind("click", function(){
		var inputs = $formDiv.find("input");
		var dto = construirDto(inputs);
		var dadosParaAtualizarStr = JSON.stringify(dto);
		
		$.ajax({
			url: utils.buildURL("/" + nomeObjeto + "/" + idObjeto), 
			method: "POST",
			contentType: 'application/json',
			data: dadosParaAtualizarStr
		});
	});
	
	construirForm();
};

$(document).ready(Form);