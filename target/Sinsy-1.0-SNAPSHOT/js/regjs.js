function myFunction() {
  var x = document.getElementById("myInput");
  var y = document.getElementById("myInput2");
  if ((x.type === "password") && (y.type === "password")){
    x.type = "text";
    y.type = "text";
  } else {
    x.type = "password";
    y.type = "password";
  }
}

function verificarPasswords() {
 
    // Ontenemos los valores de los campos de contraseñas 
    pass1 = document.getElementById('myInput');
    pass2 = document.getElementById('myInput2');
 
    // Verificamos si las constraseñas no coinciden 
    if (pass1.value != pass2.value) {
 
        // Si las constraseñas no coinciden mostramos un mensaje 
        document.getElementById("error").classList.add("mostrar");
 
        return false;
    } else {
 
        // Si las contraseñas coinciden ocultamos el mensaje de error
        document.getElementById("error").classList.remove("mostrar");
 
        // Mostramos un mensaje mencionando que las Contraseñas coinciden 
        document.getElementById("ok").classList.remove("ocultar");
 
        // Desabilitamos el botón de login 
        document.getElementById("contact-submit").disabled = true;
 
        // Refrescamos la página (Simulación de envío del formulario) 
        setTimeout(function() {
            location.reload();
        }, 3000);
 
        return true;
    }
 
}

