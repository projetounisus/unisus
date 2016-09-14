/**
 * 
 */

var Form = function(){
	var userId = $("#userId").val();
	var form = $("#formDiv");
	var inputs = form.find("input");
	var confirmForm = $("#confirmForm");
	
//	var dadoParaAtualizar = {nome: $("#nomeCompleto").value,
//			cpf: $("#cpf").value,
//			dataNascimento: $("#dataNascimento").value
//	};
	
	confirmForm.bind("click", function(){
		var dadosParaAtualizar = { 
				nomeCompleto: $("#nomeCompleto").val() ,
				cpf:  $("#cpf").val() ,
				dataNascimento: $("#dataNascimento").val()
			};
		
		var dadosParaAtualizarStr = JSON.stringify(dadosParaAtualizar);
		
		$.ajax({
			url: utils.buildURL("/usuario/" + userId), 
			method: "POST",
			contentType: 'application/json',
			data: dadosParaAtualizarStr
		});
	});
	
};

$(document).ready(Form);