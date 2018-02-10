/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import com.online.beans.AccountantBeans;
import com.online.dbfactory.AddAccountantDB;
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
@WebServlet(name = "AddAccountant", urlPatterns = {"/AddAccountant"})
public class AddAccountant extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
          response.setHeader("Pragma","no-cache");
          response.setHeader("Expires","0");
          HttpSession session=request.getSession();
          if(session.getAttribute("admin")==null)
          response.sendRedirect("AdminLogin.html");
         
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String name=request.getParameter("name");
        String qul=request.getParameter("qualification");
        String sex=request.getParameter("gender");
        String salary=request.getParameter("salary");
        float sal=Float.parseFloat(salary);
        String dob=request.getParameter("cdob");
        
        AccountantBeans ab=new AccountantBeans();
        ab.setUname(username);
        ab.setPass(password);
        ab.setName(name);
        ab.setDob(dob);
        ab.setSex(sex);
        ab.setQul(qul);
        ab.setSal(sal);
        
        int status=AddAccountantDB.addAccountant(ab);
        if(status>0)
        {
            response.sendRedirect("AccountantRegister.html");
        }
        
        else
        {
        request.setAttribute("AccountantError", "4");
        RequestDispatcher rd=request.getRequestDispatcher("AccountantException");
        rd.forward(request, response);
       
        
        }
        
        
        
    }

}
