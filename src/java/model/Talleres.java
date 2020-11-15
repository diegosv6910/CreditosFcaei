package model;

public class Talleres {
    static private int ID_Taller, ID_Docente;
    static private String Nombre_Taller, Horario, Ubicacion, Costo, Descripcion_Taller;

    public static int getID_Taller() {
        return ID_Taller;
    }

    public static void setID_Taller(int ID_Taller) {
        Talleres.ID_Taller = ID_Taller;
    }

    public static int getID_Docente() {
        return ID_Docente;
    }

    public static void setID_Docente(int ID_Docente) {
        Talleres.ID_Docente = ID_Docente;
    }

    public static String getNombre_Taller() {
        return Nombre_Taller;
    }

    public static void setNombre_Taller(String Nombre_Taller) {
        Talleres.Nombre_Taller = Nombre_Taller;
    }

    public static String getHorario() {
        return Horario;
    }

    public static void setHorario(String Horario) {
        Talleres.Horario = Horario;
    }

    public static String getUbicacion() {
        return Ubicacion;
    }

    public static void setUbicacion(String Ubicacion) {
        Talleres.Ubicacion = Ubicacion;
    }

    public static String getCosto() {
        return Costo;
    }

    public static void setCosto(String Costo) {
        Talleres.Costo = Costo;
    }

    public static String getDescripcion_Taller() {
        return Descripcion_Taller;
    }

    public static void setDescripcion_Taller(String Descripcion_Taller) {
        Talleres.Descripcion_Taller = Descripcion_Taller;
    }
    
    
    }
