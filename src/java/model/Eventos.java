package model;

public class Eventos {
    
public int ID_Evento;    
public String nombreEvento;
public int idInstitucion;
public String fechaInicio;
public String fechaFin;
public String Horario;
public int tipoEvento;
public int programaLic;
static String Descripcion;

    public int getID_Evento() {
        return ID_Evento;
    }

    public void setID_Evento(int ID_Evento) {
        this.ID_Evento = ID_Evento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(int tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getProgramaLic() {
        return programaLic;
    }

    public void setProgramaLic(int programaLic) {
        this.programaLic = programaLic;
    }

    public static String getDescripcion() {
        return Descripcion;
    }

    public static void setDescripcion(String Descripcion) {
        Eventos.Descripcion = Descripcion;
    }


}
