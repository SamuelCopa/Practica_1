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
@WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet {

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
        String numero1 = request.getParameter("num1");
        double num1 = Double.parseDouble(numero1);
        String numero2 = request.getParameter("num2");
        double num2 = Double.parseDouble(numero2);
        String opcion = request.getParameter("opcion");
        int op = Integer.parseInt(opcion);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Operaciones</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>RESULTADO DE LA OPERACION</h1>");
            if (op == 1) {
                double suma = num1 + num2;
                out.println("<h2>La suma de " + num1 + " + " + num2 + " = " + suma + "</h2>");
            }
            if (op == 2) {
                double resta = num1 - num2;
                out.println("<h2>La resta de " + num1 + " - " + num2 + " = " + resta + "</h2>");
            }
            if (op == 3) {
                double multi = num1 * num2;
                out.println("<h2>La multiplicación de " + num1 + " * " + num2 + " = " + multi + "</h2>");
            }
            if (op == 4) {
                double division = num1 / num2;
                out.println("<h2>La división de " + num1 + " / " + num2 + " = " + division + "</h2>");
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
