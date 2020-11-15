/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Eventos;
import model.Talleres;
import util.Conexion;

/**
 *
 * @author diego
 */
public class TalleresDAO {
    
        private Connection con = null;//variable para la conexion a la BD
        Talleres T = new Talleres();
    
        public void Insertar() throws SQLException {
        con = Conexion.getConnection();//crear una conexión al crear un objeto AdminDAO
        try {
            
            PreparedStatement pstm = null;
            ResultSet rs = null;
            String s1 = "INSERT INTO talleres (Nombre_Taller, ID_Docente, Horario, Ubicacion, Costo, Descripcion_Taller) VALUES(?,?,?,?,?,?)";
            pstm = con.prepareStatement(s1);
            pstm.setString(1, Talleres.getNombre_Taller());
            pstm.setInt(2, Talleres.getID_Docente());
            pstm.setString(3, Talleres.getHorario());
            pstm.setString(4, Talleres.getUbicacion());
            pstm.setString(5, Talleres.getCosto());
            pstm.setString(6, Talleres.getDescripcion_Taller());
            int filas = pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
