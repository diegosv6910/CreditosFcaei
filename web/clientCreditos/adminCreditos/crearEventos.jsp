<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Creacion Eventos</title>
    </head>
    <body>
        <h1>Registro de eventos y talleres.</h1>
        <form method="post" action="/Creditos/postCrearEventos">
            <label for="Nombre Evento">Nombre_Evento</label>
            <input type="text" name="txtNombreEvento" placeholder="Nombre Evento"  /> 
            <br>
            <label for="Institucion">ID Institucion</label>
            <input type="text" name="txtIDInstitucion" placeholder="ID Institucion" />
            <br>
            <label for="Fecha Inicio">Fecha Inicio</label>
            <input type="text" name="txtFechaInicio" placeholder="Fecha Inicio"  /> 
            <br>
            <label for="Fecha Final">Fecha Fin</label>
            <input type="text" name="txtFechaFinal" placeholder="Fecha Final" />
            <br>
            <label for="Horario">Horario</label>
            <input type="text" name="txtHorario" placeholder="Horario"  /> 
            <br>
            <label for="Tipo Evento">Tipo Evento</label>
            <input type="text" name="txtTipoEvento" placeholder="Tipo Evento" />
            <br>
            <label for="ID Licenciatura">ID Licenciatura</label>
            <input type="number" name="txtIDLicenciatura" placeholder="ID Licenciatura" /> 
            <br>
            <label for="Descripcion">Descripcion</label>
            <input type="text" name="txtDescripcion" placeholder="Descripcion del evento" />
            <br>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
