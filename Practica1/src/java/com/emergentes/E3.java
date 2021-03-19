package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sammy
 */
@WebServlet(name = "E3", urlPatterns = {"/E3"})
public class E3 extends HttpServlet {

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
            out.println("<title>Servlet E1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>EJERCICIO 3</h2>");
            out.println("<h2>CALCULAR LA EDAD</h2>");
            out.println("<form action='E3' method='post'>");
            out.println("<label>Año de nacimiento:</label>");
            out.println("<input type='text' name='dato' required>");
            out.println("<br><br>");
            out.println("<input type='submit' value='calcular'>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String año1 = request.getParameter("dato");
        int año = Integer.parseInt(año1);
        //Año actual
        Calendar fecha = new GregorianCalendar();
        int añoAct = fecha.get(Calendar.YEAR);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcularEdad</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>DATOS DEL USUARIO</h1>");

            if (año > 0) {
                int edad = añoAct - año;
                out.println("<h2>Hola tu edad es " + edad + " años</h2>");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
