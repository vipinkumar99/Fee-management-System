/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import com.online.beans.StudentBeans;
import com.online.dbfactory.AddStudentDB;
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
@WebServlet(name = "StudentAdd", urlPatterns = {"/StudentAdd"})
public class StudentAdd extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        
          response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          
          /* user login validation */
          if(session.getAttribute("accountant")==null)
          {    
          response.sendRedirect("AccountantLogin.html");
          }

          /* main business logic */ 
          else
          {
              
        String sname=request.getParameter("sname");
        String semail=request.getParameter("semail");
        String ssex=request.getParameter("gender");
        String scourse=request.getParameter("course");
        String scoursefee=request.getParameter("fee");
        float fee=Float.parseFloat(scoursefee);
        String scourscepaid=request.getParameter("paid");
        float paid=Float.parseFloat(scourscepaid);
        String smobile=request.getParameter("smobile");
        
        float due=fee-paid;
        
              StudentBeans sb=new StudentBeans();
              sb.setName(sname);
              sb.setEmail(semail);
              sb.setSex(ssex);
              sb.setCourse(scourse);
              sb.setFee(fee);
              sb.setFeepaid(paid);
              sb.setMobile(smobile);
              sb.setDuefee(due);
              
             int status=AddStudentDB.addStudent(sb);
              
             if(status>0)
             {
          
        request.setAttribute("studentname", sname);
        RequestDispatcher rd=request.getRequestDispatcher("StudentConfirm");
        rd.forward(request, response);
        
             }
              
              else
              {
        request.setAttribute("StudentError", "11");
        RequestDispatcher rd=request.getRequestDispatcher("StudentException");
        rd.forward(request, response);
         
        
              }

              
          }
        /* end business logic */  
        
    }
}
