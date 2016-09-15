<div id="formDiv" class="row-fluid form-container">
	<div class="form-group col-md-4">
		<label>Nome</label> <input type="text" name="nomeCompleto"
			id="nomeCompleto" />
	</div>

	<div class="form-group col-md-4">
		<label>CPF</label> <input type="text" name="cpf" id="cpf" />
	</div>

	<div class="form-group col-md-4s">
		<label>Data Nascimento</label> <input type="date"
			name="dataNascimento" id="dataNascimento" />
	</div>

	<div class="subForm">
		<%@ include file="/pages/forms/formEndereco.jsp"%>
	</div>
</div>