<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>I. Datos Personales</title>
        <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">FORMATO DE SELECCION DEL POSTULANTE</h1>
            <h2>I. DATOS PERSONALES</h2>
            <form method="post" action="guardar-postulante">
                <div>
                    <div class="col-md-3" style="margin-bottom: 30px; margin-top: 20px">
                        <label>DNI:</label>
                    </div>
                    <div class="col-md-3" style="margin-bottom: 30px; margin-top: 20px">
                        <input size="30" type="text" placeholder="Ingrese DNI" id="dni" name="dni" required/>
                    </div>
                    <div class="col-md-3" style="margin-bottom: 30px; margin-top: 20px">
                        <a href="" class="btn btn-primary">Buscar</a>
                    </div>
                </div>

                <div class="col-lg-6">
                    <table class="table table-hover table-bordered">
                        <tbody>
                            <tr>
                                <td><label>Codigo de Postulante:</label></td>
                                <td><input size="30" type="text" 
                                           id="codP" name="codP" readonly/></td>
                            </tr>
                            <tr>
                                <td><label>Fecha de Registro:</label></td>
                                <td><input size="30" type="text" placeholder="Ingrese Fecha de registro"
                                           id="fechaR" name="fechaR" required/></td>
                            </tr>
                        </tbody>
                    </table>

                    <table class="table table-hover table-bordered">
                        <tbody>
                            <tr>
                                <td class="col-md-1"><label>Nombre:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Nombre"
                                                            id="nombre" name="nombre" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Ocupacion:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Ocupacion"
                                                            id="ocupacion" name="ocupacion" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Lugar de Nacimiento:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Lugar de nacimiento"
                                                            id="lugarN" name="lugarN" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Fecha de Nacimiento:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Fecha de nacimiento"
                                                            id="fechaN" name="fechaN" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Edad:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese edad"
                                                            id="edad" name="edad" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Distrito:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Distrito"
                                                            id="distrito" name="distrito" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Domicilio:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Domicilio"
                                                            id="domicilio" name="domicilio" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Centro de Trabajo:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Centro de Trabajo"
                                                            id="centroT" name="centroT" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Telefono Casa:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Telefono Casa"
                                                            id="telCasa" name="telCasa" required/></td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Celular:</label></td>
                                <td class="col-md-1"><input size="30" type="text" placeholder="Ingrese Celular"
                                                            id="celular" name="celular" required/></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-lg-6">
                    <table class="table table-hover table-bordered">
                        <tbody>
                            <tr>
                                <td class="col-md-1"><label>Sexo:</label></td>
                                <td class="col-md-1">
                                    <select name="sexo">
                                        <option value="F">F</option>
                                        <option value="M">M</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>
                                        Estado Civil:</label></td>
                                <td class="col-md-1">
                                    <select name="estadoC">
                                        <option value="ec1">Soltero (a)</option>
                                        <option value="ec2">Casado (a)</option>
                                        <option value="ec3">Viudo (a)</option>
                                        <option value="ec4">Divorciado (a)</option>
                                        <option value="ec5">Conviviente</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Grupo Sanguineo:</label></td>
                                <td class="col-md-1">
                                    <select name="grupoS">
                                        <option value="O">O</option>
                                        <option value="A">A</option>
                                        <option value="B">B</option>
                                        <option value="AB">AB</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="col-md-1"><label>Factor Rh:</label></td>
                                <td class="col-md-1">
                                    <select name="factorRh">
                                        <option value="pos">Positivo</option>
                                        <option value="neg">Negativo</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td class="col-md-1">
                                    <label>Tipo de Donacion:</label></td>
                                <td class="col-md-1">
                                    <select name="tipoDon">
                                        <option value="vol">Voluntaria</option>
                                        <option value="rep">Reposicion</option>
                                        <option value="aut">Autologa</option>
                                    </select>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>

                <div class="col-lg-6">
                    <input type="hidden" name="modo" value="registrar1"/>
                    <input type="submit" class="btn btn-primary" value="Continuar" />
                    <a href="listar-postulantes" class="btn btn-primary" style="margin-left: 20px">Cancelar</a>
                </div>
            </form>
        </div>
    </body>
</html>
