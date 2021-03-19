package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sammy
 */
@WebServlet(name = "E4", urlPatterns = {"/E4"})
public class E4 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet E4</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO DE MONEDA </h1>");
            out.println("<form action='Cambio' method='post'>");
            out.println("<label>Monto</label>");
            out.println("<input type='text' name='monto'>");
            out.println("<label>Dolares/Bolivianos</label>");
            out.println("<br><br>");
            out.println("<label>Cambiar a:</label>");
            out.println("<br><br>");
            out.println("<input type='radio' name='mon' value='1'>");
            out.println("<label>Dolar</label>");
            out.println("<br><br>");
            out.println("<input type='radio' name='mon' value='2'>");
            out.println("<label>Boliviano</label>");
            out.println("<br><br>");
            out.println("<input type='submit' value='CALCULAR'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
