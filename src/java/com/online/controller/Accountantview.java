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
@WebServlet(name = "Accountantview", urlPatterns = {"/Accountantview"})
public class Accountantview extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter(); 
         response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          if(session.getAttribute("admin")==null)
          response.sendRedirect("AdminLogin.html");
         
        
        
        String action=request.getParameter("action");
          
        if("viewName".equals(action))
        {
            
        String sname=request.getParameter("name");
        if(sname.isEmpty())
        {
            response.sendRedirect("Viewaccount.html");
        }
        else
        {
        request.setAttribute("studentname", sname);
        RequestDispatcher rd=request.getRequestDispatcher("AccountantName");
        rd.forward(request, response);   
        }
        }
        
       else if("viewDob".equals(action))
        {
           String sdob=request.getParameter("cdob");
        if(sdob.isEmpty())
        {
            response.sendRedirect("Viewaccount.html");
        }
        else
        {
        request.setAttribute("Dob", sdob);
        RequestDispatcher rd=request.getRequestDispatcher("AccountantDob");
        rd.forward(request, response);   
        }

        }
        
       else if("viewSalary".equals(action))
        {
           String semail=request.getParameter("salary");
         if(semail.equals("none"))
        {
            response.sendRedirect("Viewaccount.html");
        }
        else
        {
        request.setAttribute("accountantsalary", semail);
        RequestDispatcher rd=request.getRequestDispatcher("AccountantSalary");
        rd.forward(request, response);   
        }
       
        }
        
        
    }
      


    }

   

