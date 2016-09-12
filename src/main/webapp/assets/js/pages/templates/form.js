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
		var dadosParaAtualizar = "{ 'nomeCompleto': '" + $("#nomeCompleto").val() + "', 'cpf': '" + $("#cpf").val() + "', 'dataNascimento':'" + $("#dataNascimento").val() + "'}";
		
		$.ajax({
			url: utils.buildURL("/usuario/" + userId), 
			method: "POST",
			data: dadosParaAtualizar
		});
	});
	
};

$(document).ready(Form);