/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import com.online.beans.StudentBeans;
import com.online.dbfactory.UpdateStudent;
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
@WebServlet(name = "StudentUpdate", urlPatterns = {"/StudentUpdate"})
public class StudentUpdate extends HttpServlet {
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
           
          String sr=request.getParameter("sregisterno");
        int sregisterno=Integer.parseInt(sr);
        
        String sname=request.getParameter("sname");
        String semail=request.getParameter("semail");
        
        String scourse=request.getParameter("course");
        String scoursefee=request.getParameter("fee");
        float fee=Float.parseFloat(scoursefee);
        String scourscepaid=request.getParameter("paid");
        float paid=Float.parseFloat(scourscepaid);
        String smobile=request.getParameter("smobile");
        float due=fee-paid;
      
        
         StudentBeans sb=new StudentBeans();
              sb.setId(sregisterno);
              sb.setName(sname);
              sb.setEmail(semail);
              sb.setCourse(scourse);
              sb.setFee(fee);
              sb.setFeepaid(paid);
              sb.setMobile(smobile);
              sb.setDuefee(due); 
             
        
      int status=UpdateStudent.updateStudentByRegister(sb);
      
      if(status>0)
      {
              
      response.sendRedirect("Editstudent.html");  
      }
      else
      {
         request.setAttribute("StudentError", "9");
        RequestDispatcher rd=request.getRequestDispatcher("StudentException");
        rd.forward(request, response);
       
      }   
          }
          /* end logic */
         
    } 

}
