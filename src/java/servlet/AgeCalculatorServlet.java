/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pusit
 */
public class AgeCalculatorServlet extends HttpServlet {
    
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request, response);
   }
   
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       String age = request.getParameter("age");
       
       request.setAttribute("age", age);
       
       if(age==null||age.equals("")){
           request.setAttribute("message","You must give your current age."+"<br>");
       } else {
           try {
               int nextAge = Integer.parseInt(age)+1;
               request.setAttribute("message","Your age next birthday will be " + nextAge+"<br>");
           }
           catch(NumberFormatException e){
               request.setAttribute("message","You must enter a number."+"<br>");
           }
       }
       
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
               .forward(request, response);
   }
}
