/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pusit
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       
       request.setAttribute("result","---");
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);
   }
   
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       
       String first = request.getParameter("first");
       String second = request.getParameter("second");
       String operation = request.getParameter("operation");
       
       request.setAttribute("first",first);
       request.setAttribute("second",second);
       
       if((first==null||first.equals(""))&&(second==null||second.equals(""))){
           request.setAttribute("result","---");
       } else {
           try {
               int firstNum = Integer.parseInt(first);
               int secondNum = Integer.parseInt(second);
               
               switch (operation) {
                   case "+":
                       request.setAttribute("result",firstNum+secondNum);
                       break;
                   case "-":
                       request.setAttribute("result",firstNum-secondNum);
                       break;
                   case "*":
                       request.setAttribute("result",firstNum*secondNum);
                       break;
                   case "%":
                       request.setAttribute("result",firstNum%secondNum); 
                   default:
                       break;
               }
           }
           catch(NumberFormatException e){
               request.setAttribute("result","invalid");
           }
       }
       
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);
   }
}
