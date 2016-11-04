package atencion.servlet;

import atencion.clases.AtencionDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EliminarPostulante extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long codP = Long.parseLong(request.getParameter("codP"));
        
        new AtencionDAO().eliminarPostulante(codP);
        
        response.sendRedirect("listar-postulantes");
    }

}
