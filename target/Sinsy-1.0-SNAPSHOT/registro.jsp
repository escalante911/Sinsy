
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/regis.css">
        <title>JSP Page</title>
    </head>
    <body>
      <div class="container">  
  <form id="contact" action="" method="post" onsubmit="verificarPasswords(); return false">
    <h3>Registrate</h3>
    <h4>Ingresa Tus Datos</h4>
    <fieldset>
      <input placeholder="Cedula" type="text" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Nombres" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Apellidos" type="text" tabindex="3" required>
    </fieldset>
    <fieldset>
       <input type="date" id="start" name="trip-start" value="2021-01-01" min="1920-01-01" max="2050-12-31" tabindex="4" required>
    </fieldset>
    <fieldset>
      <input placeholder="Dirección" type="text" tabindex="5" required>
    </fieldset>
    <fieldset>
      <input placeholder="Celular" type="tel" tabindex="6" required>
    </fieldset>
    <fieldset>
      <input placeholder="Correo" type="email" tabindex="7" required>
    </fieldset>
    <fieldset>
         Contraseña: <input type="password" id="myInput" tabindex="8" required>
          <br>
         Confirma Contraseña: <input type="password" id="myInput2" tabindex="9" required>
          <!-- An element to toggle between password visibility -->
          <input type="checkbox" onclick="myFunction()"> Show Password
    </fieldset>
    
    <div id="msg"></div>
 
     <!-- Mensajes de Verificación -->
     <div id="error" class="alert alert-danger ocultar" role="alert">
         Las Contraseñas no coinciden, vuelve a intentar !
     </div>
     <div id="ok" class="alert alert-success ocultar" role="alert">
      Las Contraseñas coinciden ! (Procesando formulario ... )
       </div>
       <!-- Fin Mensajes de Verificación -->
    
    <fieldset>
      <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Registrar</button>
    </fieldset>
  </form>
</div>
        <script src="js/regjs.js"></script>
    </body>
</html>
