package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import model.Eventos;
import util.Conexion;

public class EventosDAO {

    private Connection con = null;//variable para la conexion a la BD
    Eventos E = new Eventos();

    public EventosDAO(){
        con = Conexion.getConnection();
    }
    
    public void Insertar() throws SQLException {
        con = Conexion.getConnection();//crear una conexión al crear un objeto AdminDAO
        try {
            
            PreparedStatement pstm = null;
            ResultSet rs = null;
            String s1 = "INSERT INTO eventos (Nombre_Evento, ID_Institucion, Fecha_Inicio, Fecha_Fin, Horario, Tipo_Evento, ID_ProgramaLic, Descripcion_Evento) VALUES(?,?,?,?,?,?,?,?)";
            pstm = con.prepareStatement(s1);
            pstm.setString(1, E.getNombreEvento());
            pstm.setInt(2, E.getIdInstitucion());
            pstm.setString(3, E.getFechaInicio());
            pstm.setString(4, E.getFechaFin());
            pstm.setString(5, E.getHorario());
            pstm.setInt(6, E.getTipoEvento());
            pstm.setInt(7, E.getProgramaLic());
            pstm.setString(8, E.getDescripcion());
            int filas = pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public List<Eventos> Listar(){
        List<Eventos> datos = new ArrayList<>();
        PreparedStatement pstm = null; 
        ResultSet rs = null;
        String sql = "select * from proyecto.eventos";
        try{
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                datos.add(new Eventos(rs.getString("Nombre_Evento"),rs.getString("Fecha_Inicio"),rs.getString("Fecha_Fin"),rs.getString("Horario"),rs.getString("Descripcion_Evento")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return datos;
    }

}
