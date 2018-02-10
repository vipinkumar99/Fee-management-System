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

/**
 *
 * @author vipin
 */
@WebServlet(name = "AccountantException", urlPatterns = {"/AccountantException"})
public class AccountantException extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // 1 accountant name error   AccountantError
       // 2 dob error
       // 3 salary err
       
        PrintWriter out=response.getWriter();
         request.getRequestDispatcher("AccountantHeader.html").include(request, response);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container login'>");
	    out.println("<div class='row text-center'><div class='col-sm-6 set-pad col-sm-offset-3' >");     
            out.println("<strong class='error-txt'>ERROR ! </strong>");       
            out.println("</div></div>"); 
     
      String Error=(String)request.getAttribute("AccountantError");
            if(Error.equals("1"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>REGISTRATION ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested accountant name record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Viewaccount.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Adminhome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
           
          
      }
      else if(Error.equals("2"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>REGISTRATION ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested accountant dob record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Viewaccount.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Adminhome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
          
      }
      else if(Error.equals("3"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'> REGISTRATION ERROR!</h2>");
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested accountant salary record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Viewaccount.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Adminhome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Go to home</a>");        
         out.println("</div></div>");         
         
      }
      else  if(Error.equals("4"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>DATABASE ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested database not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='AddAccountant.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Adminhome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
           
          
      }
      
       
    }

}
