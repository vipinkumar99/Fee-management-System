/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import com.online.beans.AccountantBeans;
import com.online.dbfactory.ViewAccountant;
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
@WebServlet(name = "AccountantDob", urlPatterns = {"/AccountantDob"})
public class AccountantDob extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          PrintWriter out=response.getWriter();
           response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          if(session.getAttribute("admin")==null)
          response.sendRedirect("AdminLogin.html");
         
         String dob=(String)request.getAttribute("Dob");
         
         request.getRequestDispatcher("AdminHeader.html").include(request, response);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Due Fee</title>");            
            out.println("</head>");
            out.println("<body>");
            
            List<AccountantBeans> list=ViewAccountant.getRecordsByDob(dob);
            
           if(list.isEmpty())
            {
        request.setAttribute("AccountantError", "2");
        RequestDispatcher rd=request.getRequestDispatcher("AccountantException");
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
		out.println("<th>Accountant id</th><th>Username</th><th>Password</th><th> Accountant Name</th><th>Date of birth</th><th>Gender</th><th>Education</th><th>Salary</th>");
		out.println("</tr>");
                
                for(AccountantBeans ab:list){
            
                out.println("<tr>");
              
                out.println("<td>"+ab.getId()+"</td><td>"+ab.getUname()+"</td><td>"+ab.getPass()+"</td><td>"+ab.getName()+"</td><td>"+ab.getDob()+"</td><td>"+ab.getSex()+"</td><td>"+ab.getQul()+"</td><td>"+ab.getSal()+"</td>");
                out.println("</tr>");
                
                }
                
            
             
                out.println("</tbody>");
                out.println("</table>");
                
               
        out.println("<a href='Viewaccount.html' class='btn btn-warning btn-lg' role='button' > Save </a> ");
    	out.println("<a href='Adminhome.html' class='btn btn-danger btn-lg' role='button' > Print </a> ");
    	
                  out.println("</div></div></div>");
               
    
            out.println("</body>");
            out.println("</html>");
            }
    }

        
    }


