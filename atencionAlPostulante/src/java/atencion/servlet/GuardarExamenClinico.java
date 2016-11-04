package atencion.servlet;

import atencion.clases.AtencionDAO;
import atencion.clases.ExamenClinico;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuardarExamenClinico extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("modo").equals("registrar3")){
            
            String estAV = request.getParameter("estAV");
            if(estAV.equals("1")){
                estAV = "Buena";
            }else if(estAV.equals("2")){
                estAV = "Regular";
            }else if(estAV.equals("3")){
                estAV = "Dificil";
            }
            
            
            ExamenClinico examenC = new ExamenClinico(
                    0,
                    Integer.parseInt(request.getParameter("pesoKG")),
                    request.getParameter("pa"),
                    Integer.parseInt(request.getParameter("tallaM")),
                    Integer.parseInt(request.getParameter("pulso")),
                    estAV,
                    request.getParameter("obs"));
            
            new AtencionDAO().registrarExamenClinico(examenC); 
        }
        
        response.sendRedirect("listar-postulantes");
    }

}
