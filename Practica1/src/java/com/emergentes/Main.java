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
@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

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
            out.println("<title>Practica 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>PRACTICA 1</h1>");
            out.println("<h2>Ejercicio 1</h2>");
            out.print("<p><b>Calcular edad</b>  <a href='E1'>Pulsa qui para ver</a></p>");            
            out.println("<br>");            
            //ejercicio 2
            out.println("<h2>Ejercicio 2</h2>");
            out.println("<p><b>Factorial</b>     <a href='E2'>Pulsa aqui para ver</a></p>");           
            out.println("<br>");
            out.println("<h2>Ejercicio 3</h2>");
            out.println("<p><b>Calcular edad</b>     <a href='E3'>Pulsa aqui para ver</a></p>");           
            out.println("<br>");
             out.println("<h2>Ejercicio 4</h2>");
            out.println("<p><b>Cambio de moneda</b>     <a href='E4'>Pulsa aqui para ver</a></p>");           
            out.println("<br>");
             out.println("<h2>Ejercicio 5</h2>");
            out.println("<p><b>Operaciones aritmeticas</b>     <a href='E5'>Pulsa aqui para ver</a></p>");           
            out.println("<br>");
             out.println("<h2>Ejercicio 6</h2>");
            out.println("<p><b>Juego de dos dados </b>     <a href='E6'>Pulsa aqui para ver</a></p>");           
            out.println("<br>");
             out.println("<h2>Ejercicio 7</h2>");
            out.println("<p><b>Matriz Caracol</b>     <a href='E7'>Pulsa aqui para ver</a></p>");           
            out.println("<br>");
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
