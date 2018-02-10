/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.dbfactory;

import static com.online.dao.DBConnection.getCon;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author vipin
 */
public class DeleteStudentDB {
    
     public static int deletebyRegister(int id){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("delete from student where registerno=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

 public static int deletebyMobile(String mobile){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("delete from student where smobile=?");
			ps.setString(1,mobile);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
