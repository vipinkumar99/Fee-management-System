/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.dbfactory;

import static com.online.dao.DBConnection.getCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author vipin
 */
public class AccountantLoginDB {
    
  public static boolean validate(String email,String password){
	boolean status=false;
	try{
		Connection con=getCon();
		PreparedStatement ps=con.prepareStatement("select * from accountant where auname=? and apassword=?");
		ps.setString(1,email);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
		con.close();
	}catch(Exception ex){System.out.println(ex);}
	return status;
}

        
    }
    

