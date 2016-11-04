package atencion.servlet;

import atencion.clases.AtencionDAO;
import atencion.clases.Postulante;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuardarPostulante extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("modo").equals("registrar1")) {
            
            String sexo = request.getParameter("sexo");
            if(sexo.equalsIgnoreCase("F")){
                sexo = "F";
            }else{
                sexo = "M";
            }
            
            String estadoC = request.getParameter("estadoC");
            if(estadoC.equalsIgnoreCase("ec1")){
                estadoC = "Soltero (a)";
            }else if(estadoC.equalsIgnoreCase("ec2")){
                estadoC = "Casado (a)";
            }else if(estadoC.equalsIgnoreCase("ec3")){
                estadoC = "Viudo (a)";
            }else if(estadoC.equalsIgnoreCase("ec4")){
                estadoC = "Divorciado (a)";
            }else if(estadoC.equalsIgnoreCase("ec5")){
                estadoC = "Conviviente";
            }
            
            String grupoS = request.getParameter("grupoS");
            if(grupoS.equalsIgnoreCase("O")){
                grupoS = "O";
            }else if(grupoS.equalsIgnoreCase("A")){
                grupoS = "A";
            }else if(grupoS.equalsIgnoreCase("B")){
                grupoS = "B";
            }else if(grupoS.equalsIgnoreCase("AB")){
                grupoS = "AB";
            }
            
            String factorRh = request.getParameter("factorRh");
            if(factorRh.equalsIgnoreCase("pos")){
                factorRh = "Positivo";
            }else{
                factorRh = "Negativo";
            }
            
            String tipoDon = request.getParameter("tipoDon");
            if(tipoDon.equalsIgnoreCase("vol")){
                tipoDon = "Voluntaria";
            }else if(tipoDon.equalsIgnoreCase("rep")){
                tipoDon = "Reposicion";
            }else if(tipoDon.equalsIgnoreCase("aut")){
                tipoDon = "Autologa";
            }
            
            //REGISTRAR POSTULANTE
            Postulante postulante = new Postulante(
                    0,
                    request.getParameter("nombre"),
                    request.getParameter("dni"),
                    request.getParameter("ocupacion"),
                    request.getParameter("lugarN"),
                    request.getParameter("fechaN"),
                    Integer.parseInt(request.getParameter("edad")),
                    request.getParameter("distrito"),
                    request.getParameter("domicilio"),
                    request.getParameter("centroT"),
                    Integer.parseInt(request.getParameter("telCasa")),
                    Integer.parseInt(request.getParameter("celular")),
                    request.getParameter("fechaR"),
                    sexo,
                    estadoC,
                    grupoS,
                    factorRh,
                    tipoDon);

            new AtencionDAO().registrarPostulante(postulante);
            
        }
        
        response.sendRedirect("entrevistaPostulante.jsp");
    }

}
