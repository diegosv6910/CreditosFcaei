<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.Eventos"%>
<%@page import="DAO.EventosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="/Creditos/css/styles.css">
        <title>Ver eventos</title>
    </head>
    <body>
        <%
            EventosDAO dao;
            dao = new EventosDAO();
            List<Eventos> datos = new ArrayList();
        %>

        <%
            //Hacer un recorrido en la base de datos para mostrar las instituciones disponibles
            datos = dao.Listar();
            for (Eventos E : datos) {
        %>

        <div class="d-flex justify-content-center" >
            <div class="p-2">
                <div class="card" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title" name="ID"><%= E.getID_Evento() %></h5>
                        <h5 class="card-title" name="nombre_evento"><%= E.getNombreEvento()%></h5>
                        <h6 class="card-subtitle mb-2 text-muted"><%= E.getFechaInicio()%></h6>
                        <h6 class="card-subtitle mb-2 text-muted"><%= E.getFechaFin()%></h6>
                        <h6 class="card-subtitle mb-2 text-muted"><%= E.getHorario()%></h6>
                        <p class="card-text"><%= E.getDescripcion()%></p>
                        <a href="/Creditos/postModificarEliminarEventos?accion=eliminar&idE=<%= E.getID_Evento()%>"class="card-link">Eliminar</a>
                        <a href="#" class="card-link">Modificar</a>
                    </div>
                </div>
            </div>
        </div>                 

        <%
            }
        %>
    </body>
</html>
