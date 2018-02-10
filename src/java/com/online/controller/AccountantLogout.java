/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vipin
 */
@WebServlet(name = "AccountantLogout", urlPatterns = {"/AccountantLogout"})
public class AccountantLogout extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out=response.getWriter();
          response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          if(session.getAttribute("accountant")==null)
          response.sendRedirect("AccountantLogin.html");
         
           // HttpSession session=request.getSession();
            String accountantname=(String)session.getAttribute("accountant");
            
            
            
	 
          request.getRequestDispatcher("AccountantHeader.html").include(request, response);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Logout</title>");            
            out.println("</head>");
            out.println("<body>");
             out.println("<div class='container login'><div class='row text-center'><div class='col-sm-6 col-sm-offset-3'>");
		
		
		out.println("<h2 class='user '>Login As Accountant !</h2>");
                 
                out.println("<h3 class='user '>"+accountantname+"</h3><br/>");
               
                out.println("<h3>You want to logout !</h3><br/>");
               
          
         out.println("<form action='AccountantLogout' method='post'>");  
        out.println("<div class='row'><div class='col-sm-6 col-sm-offset-3'><input type='submit' class='btn btn-danger form-control' value='Logout' name='Logout'></div></div><br/><br/>");
    	out.println("<div class='row'><div class='col-sm-6 col-sm-offset-3'><input type='submit' class='btn btn-success form-control' value='Not Now' name='Login'> </div></div>");
    	out.println("</form>");
                  out.println("</div></div></div>");
               
    
            out.println("</body>");
            out.println("</html>");

    }

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
          
            String logout=request.getParameter("Logout");
          
            
            if("Logout".equals(logout))
            {
             HttpSession session=request.getSession();
              session.invalidate();
              response.sendRedirect("index.html");
            }
	 
            else 
            {
            response.sendRedirect("Accountanthome.html");
            }
	 
  }






}
