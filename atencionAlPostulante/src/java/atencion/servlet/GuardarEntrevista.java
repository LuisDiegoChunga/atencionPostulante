package atencion.servlet;

import atencion.clases.AtencionDAO;
import atencion.clases.Entrevista;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuardarEntrevista extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("modo").equals("registrar2")){
            
            String preg1 = request.getParameter("preg1");
            if(preg1.equals("1.1")){
                preg1 = "Si";
            }else{
                preg1 = "No";
            }
            
            String preg2 = request.getParameter("preg2");
            if(preg2.equals("2.1")){
                preg2 = "Si";
            }else{
                preg2 = "No";
            }
            
            String preg3 = request.getParameter("preg3");
            if(preg3.equals("3.1")){
                preg3 = "Si";
            }else{
                preg3 = "No";
            }
            
            String preg7 = request.getParameter("preg7");
            if(preg7.equals("7.1")){
                preg7 = "Si";
            }else{
                preg7 = "No";
            }
            
            String preg9 = request.getParameter("preg9");
            if(preg9.equals("9.1")){
                preg9 = "Si";
            }else{
                preg9 = "No";
            }
            
            String preg10 = request.getParameter("preg10");
            if(preg10.equals("10.1")){
                preg10 = "Si";
            }else{
                preg10 = "No";
            }
            
            String preg13 = request.getParameter("preg13");
            if(preg13.equals("13.1")){
                preg13 = "Si";
            }else{
                preg13 = "No";
            }
            
            String preg16 = request.getParameter("preg16");
            if(preg16.equals("16.1")){
                preg16 = "Si";
            }else{
                preg16 = "No";
            }
            
            String preg17 = request.getParameter("preg17");
            if(preg17.equals("17.1")){
                preg17 = "Si";
            }else{
                preg17 = "No";
            }
            
            String preg18 = request.getParameter("preg18");
            if(preg18.equals("18.1")){
                preg18 = "Si";
            }else{
                preg18 = "No";
            }
            
            String preg20 = request.getParameter("preg20");
            if(preg20.equals("20.1")){
                preg20 = "Si";
            }else{
                preg20 = "No";
            }
            
            String preg22 = request.getParameter("preg22");
            if(preg22.equals("22.1")){
                preg22 = "Ninguna";
            }else if(preg22.equals("22.2")){
                preg22 = "1";
            }else if(preg22.equals("22.3")){
                preg22 = "2";
            }else if(preg22.equals("22.4")){
                preg22 = "3";
            }else if(preg22.equals("22.5")){
                preg22 = "4";
            }else if(preg22.equals("22.6")){
                preg22 = "5";
            }else if(preg22.equals("22.7")){
                preg22 = "Mas de 5";
            }
            
            String preg23 = request.getParameter("preg23");
            if(preg23.equals("23.1")){
                preg23 = "Si";
            }else{
                preg23 = "No";
            }
            
            
            //REGISTRAR ENTREVISTA
            Entrevista entrevista = new Entrevista(
                    0,
                    preg1,
                    preg2,
                    preg3,
                    request.getParameter("preg4"),
                    request.getParameter("preg5"),
                    request.getParameter("preg6"),
                    preg7,
                    request.getParameter("preg8"),
                    preg9,
                    preg10,
                    request.getParameter("preg11"),
                    request.getParameter("preg12"),
                    preg13,
                    request.getParameter("preg14"),
                    request.getParameter("preg15"),
                    preg16,
                    preg17,
                    preg18,
                    request.getParameter("preg19"),
                    preg20,
                    request.getParameter("preg21"),
                    preg22,
                    preg23,
                    request.getParameter("preg24"),
                    request.getParameter("entrevistador"));
            
            new AtencionDAO().registrarEntrevista(entrevista);
        }
        response.sendRedirect("examenClinico.jsp");
    }
}
