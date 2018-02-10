/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import com.online.dbfactory.DeleteStudentDB;
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
@WebServlet(name = "StudentDelete", urlPatterns = {"/StudentDelete"})
public class StudentDelete extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
          PrintWriter out=response.getWriter();
           response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          /* user validation */
          if(session.getAttribute("accountant")==null)
          {
          response.sendRedirect("AccountantLogin.html");
          }
          /* end validation */
          
          /* main logic */
          else
          {
              
        
        String action=request.getParameter("action");
        
        
        if("deleteRegister".equals(action))
        {
        String sr=request.getParameter("sregisterno");
        
        int sregisterno=Integer.parseInt(sr);
        
        int status=DeleteStudentDB.deletebyRegister(sregisterno);
       
        if(status>0)
        {
            response.sendRedirect("Deletestudent.html");
        }
        
        else
        {
         request.setAttribute("StudentError", "3");
        RequestDispatcher rd=request.getRequestDispatcher("StudentException");
        rd.forward(request, response);
       
        }
        
        
        }
        
        
        
        
        if("deleteMobile".equals(action))
         {
             String smobile=request.getParameter("smobile");
             int status=DeleteStudentDB.deletebyMobile(smobile);
       
        if(status>0)
        {
       response.sendRedirect("Deletestudent.html");
        }
        
        else
        {
            
        request.setAttribute("StudentError", "4");
        RequestDispatcher rd=request.getRequestDispatcher("StudentException");
        rd.forward(request, response);
       
        }
        
        
         }
        
          }
         /* end logic */
        
        
      
    }
}
