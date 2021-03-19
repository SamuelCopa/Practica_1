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
@WebServlet(name = "E5", urlPatterns = {"/E5"})
public class E5 extends HttpServlet {

   
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
            out.println("<title>Servlet E5</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>OPERACIONES</h1>");
            out.println("<form action='Operaciones' method='post'>");
            out.println("<label>Ingrese numero</label>");
            out.println("<input type='text' name='num1'>");
            out.println("<br><br>");
            out.println("<label>Ingrese numero</label>");
            out.println("<input type='text' name='num2'>");
            out.println("<br><br>");
            out.println("<label for='op'>OPERACION</lavel>");
            out.println("<select name='opcion' id='op'>");
            out.println("<option value='1'>SUMA</option>");
            out.println("<option value='2'>RESTA</option>");
            out.println("<option value='3'>MULTIPLICACION</option>");
            out.println("<option value='4'>DIVISION</option>");
            out.println("</select>");
            out.println("<br><br>");
            out.println("<input type='submit' value='PROCESAR'>");
            out.println("</form>");
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
