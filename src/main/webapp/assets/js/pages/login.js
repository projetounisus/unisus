function loginUser(){
  var nameInput = $("#nameInput");
  var passwordInput = $("#passwordInput");

  var dataUser = {
    userName: nameInput.val(),
    userPassword: passwordInput.val()
  };

  $.ajax({
    url: "uniSusWeb/login",
    data: dataUser,
    method:"post",
    success: function(data){
      console.log(data);
    }
  });
}
