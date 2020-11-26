package model;

public class Eventos {
    
public static int ID_Evento;    
public static String nombreEvento;
public static int idInstitucion;
public static String fechaInicio;
public static String fechaFin;
public static String Horario;
public static int tipoEvento;
public static int programaLic;
public static String Descripcion;


    public Eventos(){
        
    }
    
    public Eventos(String nombre_evento, String fecha_i, String fecha_f, String horario, String descripcion, int id){
        this.nombreEvento = nombre_evento;
        this.fechaInicio = fecha_i;
        this.fechaFin = fecha_f;
        this.Horario = horario;
        this.Descripcion = descripcion;
        this.ID_Evento = id;
    }

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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }





}
