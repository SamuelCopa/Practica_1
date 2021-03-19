/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "E1", urlPatterns = {"/E1"})
public class E1 extends HttpServlet {

    
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
             out.println("<h2>EJERCICIO 1</h2>");
            out.println("<h2>CALCULAR LA EDAD</h2>");
            out.println("<form action='CalcularEdad' method='post'>");
            out.println("<label>Nombre</label>");
            out.println("<input type='text' name='nombre' >");
            out.println("<br><br>");
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
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
