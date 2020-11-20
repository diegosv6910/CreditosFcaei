package model;

public class Eventos {
    
static private int ID_Evento;    
private String nombreEvento;
private int idInstitucion;
private String fechaInicio;
private String fechaFin;
private String Horario;
private int tipoEvento;
private int programaLic;
private String Descripcion;


    public Eventos(){
        
    }
    
    public Eventos(String nombre_evento, String fecha_i, String fecha_f, String horario, String descripcion){
        this.nombreEvento = nombre_evento;
        this.fechaInicio = fecha_i;
        this.fechaFin = fecha_f;
        this.Horario = horario;
        this.Descripcion = descripcion;
    }

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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }



}
