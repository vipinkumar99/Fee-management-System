/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.online.dbfactory;

import com.online.beans.AccountantBeans;
import static com.online.dao.DBConnection.getCon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vipin
 */
public class ViewAccountant {
     public static List<AccountantBeans> getRecordsByName(String name){
		List<AccountantBeans> list=new ArrayList<AccountantBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from accountant where aname='"+name+"'");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			AccountantBeans ab=new AccountantBeans();
			ab.setId(rs.getInt(1));
                        ab.setUname(rs.getString(2));
                        ab.setPass(rs.getString(3));
                        ab.setName(rs.getString(4));
                        ab.setDob(rs.getString(5));
                        ab.setSex(rs.getString(6));
                        ab.setQul(rs.getString(7));
                        ab.setSal(rs.getFloat(8));
                        
                        	list.add(ab);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

    
      public static List<AccountantBeans> getRecordsByDob(String dob){
		List<AccountantBeans> list=new ArrayList<AccountantBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from accountant where adob='"+dob+"'");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			AccountantBeans ab=new AccountantBeans();
			ab.setId(rs.getInt(1));
                        ab.setUname(rs.getString(2));
                        ab.setPass(rs.getString(3));
                        ab.setName(rs.getString(4));
                        ab.setDob(rs.getString(5));
                        ab.setSex(rs.getString(6));
                        ab.setQul(rs.getString(7));
                        ab.setSal(rs.getFloat(8));
                        
                        	list.add(ab);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

 public static List<AccountantBeans> getRecordsBySalary(float salary){
		List<AccountantBeans> list=new ArrayList<AccountantBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from accountant where asalary='"+salary+"'");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			AccountantBeans ab=new AccountantBeans();
			ab.setId(rs.getInt(1));
                        ab.setUname(rs.getString(2));
                        ab.setPass(rs.getString(3));
                        ab.setName(rs.getString(4));
                        ab.setDob(rs.getString(5));
                        ab.setSex(rs.getString(6));
                        ab.setQul(rs.getString(7));
                        ab.setSal(rs.getFloat(8));
                        
                        	list.add(ab);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}



}
