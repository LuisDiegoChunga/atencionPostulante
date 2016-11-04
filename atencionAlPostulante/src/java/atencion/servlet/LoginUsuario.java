package atencion.servlet;

import atencion.clases.AtencionDAO;
import atencion.clases.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUsuario extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        Usuario usuario = new AtencionDAO().obtenerUsuario(user);
        
        if(usuario != null && password.equals(usuario.getPassword())){
            request.getSession().setAttribute("usuario", usuario);
            response.sendRedirect("listar-postulantes");
        }else{
            request.setAttribute("error", "El usuario y/o password no coinciden");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
    }
}
