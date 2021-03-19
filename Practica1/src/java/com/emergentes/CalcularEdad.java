package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.GregorianCalendar;

/**
 *
 * @author Sammy
 */
@WebServlet(name = "CalcularEdad", urlPatterns = {"/CalcularEdad"})
public class CalcularEdad extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
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
                out.println("<h2>Hola " + nombre + " tu edad es " + edad + " años</h2>");
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
