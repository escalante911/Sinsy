
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Control.UsersMysql"%>
<%@page import="Entidades.Users"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/regis.css">
        <title>JSP Page</title>
    </head>
    <body>
      <div class="container">  
  <form id="contact" action="" method="get" onsubmit="verificarPasswords(); return false">
    <h3>Registrate</h3>
    <h4>Ingresa Tus Datos</h4>
    <fieldset>
      <input placeholder="Cedula" name="cedula" type="text" tabindex="1" required autofocus>
    </fieldset>
    <fieldset>
      <input placeholder="Nombres" name="nombres" type="text" tabindex="2" required>
    </fieldset>
    <fieldset>
      <input placeholder="Apellidos" name="apellidos" type="text" tabindex="3" required>
    </fieldset>
    <fieldset>
      <input placeholder="Dirección" name="direccion" type="text" tabindex="5" required>
    </fieldset>
    <fieldset>
      <input placeholder="Celular" name="celular" type="tel" tabindex="6" required>
    </fieldset>
    <fieldset>
      <input placeholder="Correo" name="correo" type="email" tabindex="7" required>
    </fieldset>
    <fieldset>
        Ingresa el código de aprobación:
      <input placeholder="Código de Aprobación" type="text" tabindex="7" required>
    </fieldset>
    <fieldset>
         Contraseña: <input type="password" name="clave" id="myInput" tabindex="8" required>
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
      Correcto ! (Procesando formulario ... )
       </div>
       <!-- Fin Mensajes de Verificación -->
    
    <fieldset>
      <button name="enviar" type="submit" id="contact-submit" data-submit="...Sending">Registrar</button>
    </fieldset>
  </form>
         
          <%
            UsersMysql us = new UsersMysql();
            Users u = new Users();
            u.setCedula(request.getParameter("cedula"));
            u.setNombres(request.getParameter("nombres"));
            u.setApellidos(request.getParameter("apellidos"));
            u.setDireccion(request.getParameter("direccion"));
            u.setTelefono(request.getParameter("celular"));
            u.setCorreo(request.getParameter("correo"));
            u.setClave(request.getParameter("clave"));
             System.out.println(u.toString());
             if (request.getParameter("enviar") != null) {
                us.insertar(u);
                System.out.println("Ya");
            }
             else{
                 System.out.println("No");
             } 
              %>
          
          
</div>
        <script src="js/regjs.js"></script>
    </body>
</html>
