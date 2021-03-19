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
@WebServlet(name = "MCaracol", urlPatterns = {"/MCaracol"})
public class MCaracol extends HttpServlet {

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
           int numero;
        String varnum= request.getParameter("num");
        numero=Integer.parseInt(varnum);
       
      int filas=numero;
      int columnas=numero;
        
      boolean derecha = true, izquierda = false, abajo = false;
      int[][] matrizc = new int[ filas ][ columnas ];
      int x = 0, y = -1;

      for( int k = 1; k <= columnas * filas; k++ ) {
        if( izquierda ) {
          y --;
          if( y == -1 ) {
            y = 0; x --;
            izquierda = false;
          } else if( matrizc[ x ][ y ] != 0 ) {
            y ++; x --;
            izquierda = false;
          }
        } else if( derecha ) {
          y ++;
          if( y == columnas ) {
            y = columnas - 1; x ++;
            derecha = false;
            abajo = true;
          } else if( matrizc[ x ][ y ] != 0 ) {
            y --; x ++;
            derecha = false;
            abajo = true;
          }
        } else if( abajo ) {
          x ++;
          if( x == filas ) {
            x = filas - 1; y --;
            abajo = false;
            izquierda = true;
          } else if( matrizc[ x ][ y ] != 0 ) {
            y --; x --;
            abajo = false;
            izquierda = true;
          }
        } else {
          x --;
          if( x == -1 || matrizc[ x ][ y ] != 0 ) {
            x ++; y ++;
            derecha = true;
          }
        }

        matrizc[ x ][ y ] = k;
      }
        

                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SolEjer1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Matriz Caracol de: " +numero+" X "+numero+"</h1>");
            out.println("<table width='300' border='1' cellspacing='0'>");
            
            for( int i = 0; i < filas; i++ ) 
            {
            out.println("<tr>");    
              for( int j = 0; j < columnas; j++ ) 
              {
                out.println("<td><center>"+matrizc[i][j]+"</center></td>");
              }
            out.println("</tr>");
            }
            out.println("</table");

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
