/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.controller;

import com.online.dbfactory.AccountantLoginDB;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AccountantLogin", urlPatterns = {"/AccountantLogin"})
public class AccountantLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         PrintWriter out=response.getWriter();
        
        String username=request.getParameter("username");
        String password=request.getParameter("password");
       
        boolean status=AccountantLoginDB.validate(username, password);
        if(status)
        {
            HttpSession session=request.getSession();
            session.setAttribute("accountant","true");
            session.setAttribute("accountant",username);
	   request.getRequestDispatcher("Accountanthome.html").include(request, response);
	
        }
        
        else
        {
            response.sendRedirect("AccountLoginError.html");
            
        }
        
    }

   
}
