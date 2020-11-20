<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="/Creditos/css/styles.css">
        <title>Creacion Eventos</title>
    </head>
    <body>

        <!--Navbar-->
        <!-- Nuestra barra de navegación comentada va aquí -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#"><img
                    src="https://getmatcha.com/wp-content/themes/getmatcha/img/footer_logo.svg" alt="matcha-header"></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Crea.
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Evento</a>
                            <a class="dropdown-item" href="#">Taller</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Valida Evidencias <span class="sr-only"></span></a>
                    </li>
            </div>
        </nav>

        <h1>Registro de eventos.</h1>

        <form method="post" action="/Creditos/postCrearEventos">
            <div class="form-group">
                <label for="exampleFormControlInput1">Nombre Evento.</label>
                <input type="text" name="txtNombreEvento" class="form-control" id="exampleFormControlInput1" placeholder="Evento...">
            </div>
            <div class="form-group">
                <label for="exampleFormControlSelect1">ID Institucion</label>
                <select class="form-control" id="exampleFormControlSelect1" name="txtIDInstitucion">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1">Fecha Inicio.</label>
                <input type="text" name="txtFechaInicio" class="form-control" id="exampleFormControlInput1" placeholder="DD/MM/YY">
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1">Fecha Fin.</label>
                <input type="text" name="txtFechaFinal" class="form-control" id="exampleFormControlInput1" placeholder="DD/MM/YY">
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1">Horario.</label>
                <input type="text" name="txtHorario" class="form-control" id="exampleFormControlInput1" placeholder="EJ: 18:00">
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1">Tipo Evento.</label>
                <select class="form-control" id="exampleFormControlSelect1" name="txtTipoEvento">
                    <option value="1">Academico</option>
                    <option value="2">Cultural</option>
                    <option value="3">Deportivo</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleFormControlInput1">ID Licenciatura.</label>
                <select class="form-control" id="exampleFormControlSelect1" name="txtIDLicenciatura">
                    <option value="1">Informatica</option>
                    <option value="2">Administracion</option>
                    <option value="3">Administracion Publica</option>
                    <option value="4">Contaduria</option>
                    <option value="5">Economia</option>
                </select>
            </div>
            <div class="form-group">
                <label for="exampleFormControlTextarea1">Example textarea</label>
                <textarea name="txtDescripcion" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
            </div>
            <input class="btn btn-primary"  value="Enviar" data-toggle="modal" data-target="#myModal">
            
            <div class="modal" tabindex="-1" id="myModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Confirmacion.</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <p>¿Estas seguro de querer insertar este Evento?.</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar.</button>
                            <button type="submit" class="btn btn-primary">Confirmar.</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>



        <script src="/Creditos/javaScript/script.js"></script>
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
                integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
                integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
                integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
    </body>
</html>
