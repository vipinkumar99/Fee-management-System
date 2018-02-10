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
@WebServlet(name = "StudentException", urlPatterns = {"/StudentException"})
public class StudentException extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
            String Error=(String)request.getAttribute("StudentError");
             if(Error.equals("10"))
        {
         	
	 out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT SEARCH ERROR!</h2>");
         out.println("<h3 class='p-err'>The requested name students is not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='SearchStudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Go to home</a>");        
         out.println("</div></div>");         
       
         }
       
            
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
     
    }
    
    
    
    
 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
     
      String Error=(String)request.getAttribute("StudentError");
      // 1 duefee list
      // 2 view by course
      // 3 delete by register 
      // 4 delete by mobile
      // 5 due update error
      // 6 view by email error
      // 7 view by name error
      // 8 search by register error
      // 9 update student error
      // 10 view by start error
      // 11 database error
      if(Error.equals("1"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT DUE FEE ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested student due fee record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Duestudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
           
          
      }
      else if(Error.equals("2"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT VIEW ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested student course record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Viewstudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
          
      }
      else if(Error.equals("3"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT REGISTRATION ERROR!</h2>");
         out.println("<h3 class='p-err'>The requested registration number is not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Deletestudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Go to home</a>");        
         out.println("</div></div>");         
         
      }
      else if(Error.equals("4"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT MOBILE NUMBER ERROR!</h2>");
         out.println("<h3 class='p-err'>The requested mobile number is not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Deletestudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Go to home</a>");        
         out.println("</div></div>");         
          
        
          
      }
      else if(Error.equals("5"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT DUE FEE ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested student due fee record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Duestudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='index.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");            
      }
      else if(Error.equals("6"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT VIEW ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested student email record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Viewstudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
          
      }
      else if(Error.equals("7"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT VIEW ERROR!</h2>");                   
         out.println("<br/><br/>"); 
         out.println("<h3 class='p-err'>The requested student name record not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='Viewstudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
          
      }
      else if(Error.equals("8"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT REGISTRATION ERROR!</h2>");
         out.println("<h3 class='p-err'>The requested registration number is not found !</h3>");                   
         out.println("<br/><br/>"); 
         out.println("<a href='SearchStudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Go to home</a>");        
         out.println("</div></div>");         
          
          
      }
      else if(Error.equals("9"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>STUDENT UPDATE ERROR!</h2>");                    
         out.println("<h3 class='p-err'>The requested student record not found !</h3>");
         out.println("<br/>");
         out.println("<a href='Editstudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
       
          
      }
    
 else if(Error.equals("11"))
      {
         out.println("<div class='row text-center'><div class='col-sm-8  col-sm-offset-2' >");                 
         out.println("<h2 class='p-err'>DATABASE ERROR!</h2>");                    
         out.println("<h3 class='p-err'>The requested database record not found !</h3>");
         out.println("<br/>");
         out.println("<a href='Addstudent.html' class='btn btn-danger btn-lg form-control' id='error-btn'  >Try Again</a>");         
         out.println("<br/><br/>"); 
         out.println("<a href='Accountanthome.html' class='btn btn-success btn-lg form-control' id='error-btn' >Home</a>");        
         out.println("</div></div>");         
       
          
      }
    
 
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
     
 
 
 }

}
