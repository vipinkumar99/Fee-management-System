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
@WebServlet(name = "StudentConfirm", urlPatterns = {"/StudentConfirm"})
public class StudentConfirm extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          if(session.getAttribute("accountant")==null)
          response.sendRedirect("AccountantLogin.html");
         
       response.setContentType("text/html;charset=UTF-8");
      String name=(String)request.getAttribute("studentname");
       PrintWriter out = response.getWriter();
       request.getRequestDispatcher("AccountantHeader.html").include(request, response);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Student Confirm</title>");            
            out.println("</head>");
            out.println("<body>");
            
            List<StudentBeans> list=ViewStudentName.getRecordsByName(name); 
                 out.println("<div class='container login'><div class='row text-center'><div class='col-sm-8 col-sm-offset-2'>");
		
		
		out.println("<h3 class='user'> Customer details are... </h3>");
                
            
                out.println("<br>");
		out.println("<table class='table table-bordered' id='table'>");
		for(StudentBeans sb:list){
            
		
                out.println("<tbody>");
		
                out.println("<tr>");
		out.println("<th>Registration Number</th>");
		out.println("<td>"+sb.getId()+"</td>");
                out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Name</th>");
		out.println("<td>"+sb.getName()+"</td>");
    		out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Email id</th>");
		out.println("<td>"+sb.getEmail()+"</td>");
    		out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Gender</th>");
		out.println("<td>"+sb.getSex()+"</td>");
    		out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Course</th>");
		out.println("<td>"+sb.getCourse()+"</td>");
    		out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Mobile Number</th>");
		out.println("<td>"+sb.getMobile()+"</td>");
    		out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Total Fee</th>");
		out.println("<td>"+sb.getFee()+"</td>");
    		out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Paid Fee</th>");
		out.println("<td>"+sb.getFeepaid()+"</td>");
    		out.println("</tr>");
                
                out.println("<tr>");
                out.println("<th>Balance</th>");
		out.println("<td>"+sb.getDuefee()+"</td>");
    		out.println("</tr>");
                
                
            
                
                out.println("</tbody>");
                out.println("</table>");
                }
               
        out.println("<a href='Addstudent.html' class='btn btn-warning btn-lg' role='button' > Save </a> ");
    	out.println("<a href='index.html' class='btn btn-danger btn-lg' role='button' > Print </a> ");
    	
                  out.println("</div></div></div>");
               
    
            out.println("</body>");
            out.println("</html>");

    }
   
    }
    


