<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login de Usuario</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div style="text-align: center">
            <img src="img/login-donacionSangre.jpg" alt=""/>
        </div>

        <div style="text-align: center">
            <h1>ATENCION AL POSTULANTE</h1>
        </div>

        <div class="container" id="login">
            <form method="post" action="login-usuario">
                <div class="form-group">
                    <label>Usuario</label>
                    <input class="form-control" type="text" placeholder="Ingrese Usuario"
                           name="usuario"/>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input class="form-control" type="password" placeholder="Ingrese Contraseña"
                           name="password"/>
                </div>
                <div class="bg-danger" style="margin-bottom: 20px">
                    <%= request.getAttribute("error") %>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-danger">Ingresar</button>
                </div>
            </form>
        </div>
    </body>
</html>
