<%-- 
    Document   : crearTalleres
    Created on : 22 oct 2020, 17:38:59
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Talleres.</title>
    </head>
    <body>
        <h1>Registro de Talleres.</h1>
        <form method="post" action="/Creditos/postCrearTalleres">
            <label for="Nombre Taller">Nombre del Taller</label>
            <input type="text" name="txtNombreTaller" placeholder="Nombre Taller"  /> 
            <br>
            <label for="Profesor">ID Profesor</label>
            <input type="text" name="txtIDProfesor" placeholder="ID Profesor" />
            <br>
            <label for="Horario">Horario</label>
            <select id="Horario" name="txtHorario">
                <option value="Matutino">Matutino</option>
                <option value="Vespertino">Vespertino</option>
            </select>
            <br>
            <label for="Ubicacion">Ubicacion</label>
            <input type="text" name="txtUbicacion" placeholder="Ubicacion / Centro Deportivo" />
            <br>
            <label for="Costo">Costo</label>
            <input type="text" name="txtCosto" placeholder="Costo en MXN"  /> 
            <br>
            <label for="Descripcion">Descripcion</label>
            <input type="text" name="txtDescripcion" placeholder="Descripcion del Taller" />
            <br>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
