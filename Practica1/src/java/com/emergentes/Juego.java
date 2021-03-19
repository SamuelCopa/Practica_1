package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sammy
 */
@WebServlet(name = "Juego", urlPatterns = {"/Juego"})
public class Juego extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int suma, r;
        Random r1 = new Random();
        int valorDado1 = r1.nextInt(6) + 1;
        Random r2 = new Random();
        int valorDado2 = r2.nextInt(6) + 1;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Juego</title>");
            out.println("</head>");
            out.println("<body>");
             out.println("<h1>JUEGO DE DADOS</h1>");
            out.println("<h3>El dado 1 es : "+valorDado1+" </h3>");
            out.println("<h3>El dado 2 es : "+valorDado2+" </h3>");
            suma=valorDado1+valorDado2;
            out.println("<h3>La suma de los dados es "+suma+" </h3>");
            if(suma==7||suma==11){
            out.println("<h3>Ganaste</h3>");
            }   
            else{
            out.println("<h3>Perdiste</h3>");
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
