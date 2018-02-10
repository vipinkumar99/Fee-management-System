/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.dbfactory;

import com.online.beans.StudentBeans;
import static com.online.dao.DBConnection.getCon; 
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author vipin
 */
public class AddStudentDB {
      public static int addStudent(StudentBeans sb){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("insert into student(sname,semail,ssex,scourse,sfee,spaid,smobile,sdue) values(?,?,?,?,?,?,?,?)");
			ps.setString(1,sb.getName());
                        ps.setString(2,sb.getEmail());
                        ps.setString(3,sb.getSex());
                        ps.setString(4,sb.getCourse());
			ps.setFloat(5,sb.getFee());
			ps.setFloat(6,sb.getFeepaid());
                        ps.setString(7,sb.getMobile());
                        ps.setFloat(8, sb.getDuefee());
                        status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

    
}
