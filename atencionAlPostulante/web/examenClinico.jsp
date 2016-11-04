<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>III. Examen Clinico</title>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="container">
        <form method="post" action="guardar-examen-clinico">
            <h1 class="text-center">FORMATO DE SELECCION DEL POSTULANTE</h1>
            <h2>III. EXAMEN CLINICO</h2>
            <div class="col-lg-6">
                <table class="table table-hover table-bordered">
                    <tbody>
                        <tr>
                            <td class="col-md-4"><label>Codigo de examen clinico:</label></td>
                            <td class="col-md-4"><input size="20" type="text"
                                       id="codExaC" name="codExaC" readonly/></td>
                        </tr>
                    </tbody>
                </table>
                <table class="table table-hover table-bordered">
                    <tbody>
                        <tr>
                            <td class="col-md-4"><label>Peso (Kg): </label></td>
                            <td class="col-md-4"><input size="20" type="text"
                                                         id="pesoKG" name="pesoKG" required/></td>
                        </tr>
                        <tr>
                            <td class="col-md-4"><label>Talla (m): </label></td>
                            <td class="col-md-4"><input size="20" type="text"
                                                         id="tallaM" name="tallaM" required/></td>
                        </tr>
                    </tbody>
                </table>
            </div>

            <div class="col-lg-6">
                <table class="table table-hover table-bordered">
                    <tbody>
                        <tr>
                            <td class="col-md-6"><label>P.A (mmHg) [fraccion]: </label></td>
                            <td class="col-md-6"><input size="20" type="text"
                                                         id="pa" name="pa" required/></td>
                        </tr>
                        <tr>
                            <td class="col-md-6"><label>Pulso (pul/min): </label></td>
                            <td class="col-md-6"><input size="20" type="text" 
                                                         id="pulso" name="pulso" required/></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            
            <div class="col-lg-6">
                <table class="table table-hover table-bordered">
                    <tbody>
                        <tr>
                            <td class="col-md-6"><label>Estado de accesos venosos:</label></td>
                            <td class="col-md-6">
                                <select name="estAV">
                                    <option value="1">Buena</option>
                                    <option value="2">Regular</option>
                                    <option value="3">Dificil</option>
                                </select>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
            
            <div class="col-lg-12"><label>Observaciones:</label></div>
            <div class="col-lg-12"><textarea cols="150" rows="3" id="obs" name="obs" required></textarea></div>
            
            <div class="col-lg-12" style="margin-top: 30px">
                <input type="hidden" name="modo" value="registrar3"/>
                <input type="submit" class="btn btn-primary" value="Guardar"/>
            </div>
            
        </form>
    </body>
</html>
