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
public class UpdateStudent {
    
        
     public static int updateStudentByRegister(StudentBeans sb){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("update student set sname=?,semail=?,scourse=?,sfee=?,spaid=?,smobile=?,sdue=? where registerno='"+sb.getId()+"'");
			ps.setString(1,sb.getName());
			ps.setString(2,sb.getEmail());
			ps.setString(3,sb.getCourse());
                        ps.setFloat(4,sb.getFee());
                        ps.setFloat(5,sb.getFeepaid());
                        ps.setString(6,sb.getMobile());
                        ps.setFloat(7,sb.getDuefee());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

    

        
     public static int updateStudentDuefee(StudentBeans sb){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("update student set sfee=?,sdue=? where registerno='"+sb.getId()+"' and sname='"+sb.getName()+"' ");
			ps.setFloat(1,sb.getFee());
                        ps.setFloat(2,sb.getDuefee());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

    




}
