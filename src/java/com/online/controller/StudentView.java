/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "StudentView", urlPatterns = {"/StudentView"})
public class StudentView extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          PrintWriter out=response.getWriter(); 
          
          response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          /* validation user login */
          if(session.getAttribute("accountant")==null)
          {
          response.sendRedirect("AccountantLogin.html");
          }
          /* end validation user login*/
          
          
          /* main logic */
          else
          {
                  
          
        String action=request.getParameter("action");
          
        if("viewName".equals(action))
        {
            
            String sname=request.getParameter("sname");
        if(sname.isEmpty())
        {
            response.sendRedirect("StudentError.html");
        }
        else
        {
        request.setAttribute("studentname", sname);
        RequestDispatcher rd=request.getRequestDispatcher("StudentName");
        rd.forward(request, response);   
        }
        }
        
       else if("viewCourse".equals(action))
        {
           String scourse=request.getParameter("course");
        if("none".equals(scourse))
        {
            response.sendRedirect("StudentError.html");
        }
        else
        {
        request.setAttribute("studentcourse", scourse);
        RequestDispatcher rd=request.getRequestDispatcher("StudentCourse");
        rd.forward(request, response);   
        }

        }
        
       else if("viewEmail".equals(action))
        {
           String semail=request.getParameter("semail");
         if(semail.isEmpty())
        {
            response.sendRedirect("StudentError.html");
        }
        else
        {
        request.setAttribute("studentemail", semail);
        RequestDispatcher rd=request.getRequestDispatcher("StudentEmail");
        rd.forward(request, response);   
        }
       
        }
      
              
          }
          /* end logic */
        
        
    }
          
          
         

}