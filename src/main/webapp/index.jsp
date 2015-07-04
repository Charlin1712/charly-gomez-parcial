<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido ingresa tus datos de autenticacion</h1>
        <!--
        empieza el formulario y un scriptlet
        -->
            <form action="autenticar.php" method="post">
            login <br>
            <input type="text" name="login"><br>
            password <br>
            <input type="text" name="password"><br>
            <input type="submit" value="ingresar">
            
        </form>
    </body>
</html>
