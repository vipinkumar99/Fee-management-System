/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import com.online.beans.StudentBeans;
import com.online.dbfactory.ViewStudentName;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "StudentName", urlPatterns = {"/StudentName"})
public class StudentName extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
         response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          if(session.getAttribute("accountant")==null)
          response.sendRedirect("AccountantLogin.html");
         
         String name=(String)request.getAttribute("studentname");
         
         request.getRequestDispatcher("AccountantHeader.html").include(request, response);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Due Fee</title>");            
            out.println("</head>");
            out.println("<body>");
            
            List<StudentBeans> list=ViewStudentName.getAllRecordsByName(name);
            
           if(list.isEmpty())
            {
                request.setAttribute("StudentError", "7");
        RequestDispatcher rd=request.getRequestDispatcher("StudentException");
        rd.forward(request, response);
       
                
            }
            
            else
            {
                 out.println("<div class='container login'><div class='row text-center'><div class='col-sm-10 col-sm-offset-1'>");
		
		
		out.println("<h3 class='user'>Student detial are...</h3>");
                
            
                out.println("<br>");
		out.println("<table class='table table-bordered' id='table'>");
		
		
                out.println("<tbody>");
		
                out.println("<tr>");
		out.println("<th>Registration Number</th><th>Name</th><th>Email id</th><th>Gender</th><th>Course Name</th><th>Mobile Number</th><th>Total Fee</th><th>Paid Fee</th><th>Balance</th>");
		out.println("</tr>");
                
                for(StudentBeans sb:list){
            
                out.println("<tr>");
              
                out.println("<td>"+sb.getId()+"</td><td>"+sb.getName()+"</td><td>"+sb.getEmail()+"</td><td>"+sb.getSex()+"</td><td>"+sb.getCourse()+"</td><td>"+sb.getMobile()+"</td><td>"+sb.getFee()+"</td><td>"+sb.getFeepaid()+"</td><td>"+sb.getDuefee()+"</td>");
                out.println("</tr>");
                
                }
                
            
             
                out.println("</tbody>");
                out.println("</table>");
                
               
        out.println("<a href='Viewstudent.html' class='btn btn-warning btn-lg' role='button' > Save </a> ");
    	out.println("<a href='Accountanthome.html' class='btn btn-danger btn-lg' role='button' > Print </a> ");
    	
                  out.println("</div></div></div>");
               
    
            out.println("</body>");
            out.println("</html>");
            }
    }

        
     
    }


