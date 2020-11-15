package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ListaAsistencia;
import util.Conexion;

public class ListaDAO {

    private Connection con = null;//variable para la conexion a la BD
    ListaAsistencia LS = new ListaAsistencia();

    public void Insertar() throws SQLException {
        con = Conexion.getConnection();//crear una conexión al crear un objeto AdminDAO
        try {

            PreparedStatement pstm = null;
            PreparedStatement pstm1 = null;
            ResultSet rs = null;
            String s1 = "INSERT INTO lista_talleres (ID_Taller, Matricula1, Matricula2, Matricula3, Matricula4, Matricula5, ID_Docente) VALUES(?, ? ,?, ?, ?, ?, ?)";
            String s2 = "select * from proyecto.talleres order by ID_Taller desc limit 1;";
            pstm1 = con.prepareStatement(s2);
            rs = pstm1.executeQuery(s2);
            while (rs.next()) {
                ListaAsistencia.setID_Taller(rs.getInt("ID_Taller"));
                ListaAsistencia.setID_Docente(rs.getInt("ID_Docente"));
            }
            int idtaller = ListaAsistencia.getID_Taller();
            int iddocente = ListaAsistencia.getID_Docente();
            pstm = con.prepareStatement(s1);
            System.out.println("Desde aqui "+idtaller);
            System.out.println("Desde aqui "+iddocente);
            pstm.setInt(1, ListaAsistencia.getID_Taller());
            pstm.setNull(2, java.sql.Types.INTEGER);
            pstm.setNull(3, java.sql.Types.INTEGER);
            pstm.setNull(4, java.sql.Types.INTEGER);
            pstm.setNull(5, java.sql.Types.INTEGER);
            pstm.setNull(6, java.sql.Types.INTEGER);
            pstm.setInt(7, ListaAsistencia.getID_Docente());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
