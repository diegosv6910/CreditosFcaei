package model;

public class Eventos {
    
static private int ID_Evento;    
static private String nombreEvento;
static private int idInstitucion;
static private String fechaInicio;
static private String fechaFin;
static private String Horario;
static private int tipoEvento;
static private int programaLic;
static private String Descripcion;

    public static int getID_Evento() {
        return ID_Evento;
    }

    public static void setID_Evento(int ID_Evento) {
        Eventos.ID_Evento = ID_Evento;
    }


    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        Eventos.nombreEvento = nombreEvento;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        Eventos.idInstitucion = idInstitucion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        Eventos.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        Eventos.fechaFin = fechaFin;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        Eventos.Horario = Horario;
    }

    public int getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(int tipoEvento) {
        Eventos.tipoEvento = tipoEvento;
    }

    public int getProgramaLic() {
        return programaLic;
    }

    public void setProgramaLic(int programaLic) {
        Eventos.programaLic = programaLic;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        Eventos.Descripcion = Descripcion;
    }


}
