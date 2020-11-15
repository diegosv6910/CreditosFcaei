package adminController;

import DAO.ListaDAO;
import DAO.TalleresDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Talleres;

public class postCrearTalleres extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet postCrearTalleres</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet postCrearTalleres at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreTaller = request.getParameter("txtNombreTaller");
        int idDocente = parseInt(request.getParameter("txtIDProfesor"));
        String horario = request.getParameter("txtHorario");
        String ubicacion = request.getParameter("txtUbicacion");
        String costo = request.getParameter("txtCosto");
        String descripcion = request.getParameter("txtDescripcion");
        Talleres.setNombre_Taller(nombreTaller);
        Talleres.setID_Docente(idDocente);
        Talleres.setHorario(horario);
        Talleres.setUbicacion(ubicacion);
        Talleres.setCosto(costo);
        Talleres.setDescripcion_Taller(descripcion);
        TalleresDAO objDao = new TalleresDAO();
        ListaDAO objLS = new ListaDAO();
        try {
            objDao.Insertar();
            objLS.Insertar();
        } catch (SQLException ex) {
            Logger.getLogger(postCrearTalleres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
