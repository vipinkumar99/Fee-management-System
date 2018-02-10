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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vipin
 */
public class ViewStudentName {
    
    public static List<StudentBeans> getRecordsByName(String name){
		List<StudentBeans> list=new ArrayList<StudentBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where sname='"+name+"' limit 1 ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			StudentBeans sb=new StudentBeans();
			sb.setId(rs.getInt(1));
                        sb.setName(rs.getString(2));
                        sb.setEmail(rs.getString(3));
                        sb.setSex(rs.getString(4));
                        sb.setCourse(rs.getString(5));
                         sb.setFee(rs.getFloat(6));
                       sb.setFeepaid(rs.getFloat(7));
                        sb.setMobile(rs.getString(8));
                        sb.setDuefee(rs.getFloat(9));
                        
                        	list.add(sb);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

    public static List<StudentBeans> getAllRecordsByName(String name){
		List<StudentBeans> list=new ArrayList<StudentBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where sname='"+name+"'");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			StudentBeans sb=new StudentBeans();
			sb.setId(rs.getInt(1));
                        sb.setName(rs.getString(2));
                        sb.setEmail(rs.getString(3));
                        sb.setSex(rs.getString(4));
                        sb.setCourse(rs.getString(5));
                         sb.setFee(rs.getFloat(6));
                       sb.setFeepaid(rs.getFloat(7));
                        sb.setMobile(rs.getString(8));
                        sb.setDuefee(rs.getFloat(9));
                        
                        	list.add(sb);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}


    public static List<StudentBeans> getAllRecordsByCourse(String course){
		List<StudentBeans> list=new ArrayList<StudentBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where scourse='"+course+"'");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			StudentBeans sb=new StudentBeans();
			sb.setId(rs.getInt(1));
                        sb.setName(rs.getString(2));
                        sb.setEmail(rs.getString(3));
                        sb.setSex(rs.getString(4));
                        sb.setCourse(rs.getString(5));
                         sb.setFee(rs.getFloat(6));
                       sb.setFeepaid(rs.getFloat(7));
                        sb.setMobile(rs.getString(8));
                        sb.setDuefee(rs.getFloat(9));
                        
                        	list.add(sb);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

  public static List<StudentBeans> getAllRecordsByEmail(String email){
		List<StudentBeans> list=new ArrayList<StudentBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where semail='"+email+"'");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			StudentBeans sb=new StudentBeans();
			sb.setId(rs.getInt(1));
                        sb.setName(rs.getString(2));
                        sb.setEmail(rs.getString(3));
                        sb.setSex(rs.getString(4));
                        sb.setCourse(rs.getString(5));
                         sb.setFee(rs.getFloat(6));
                       sb.setFeepaid(rs.getFloat(7));
                        sb.setMobile(rs.getString(8));
                        sb.setDuefee(rs.getFloat(9));
                        
                        	list.add(sb);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

    public static List<StudentBeans> getRecordsByDuefee(){
		List<StudentBeans> list=new ArrayList<StudentBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select registerno,sname,sfee,spaid,sdue from student where sdue>200");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			StudentBeans sb=new StudentBeans();
			sb.setId(rs.getInt(1));
                        sb.setName(rs.getString(2));
                        sb.setFee(rs.getFloat(3));
                        sb.setFeepaid(rs.getFloat(4));
                        sb.setDuefee(rs.getFloat(5));
                        
                        	list.add(sb);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

    
    
      public static List<StudentBeans> getRecordsByRegister(int id){
		List<StudentBeans> list=new ArrayList<StudentBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where registerno='"+id+"' ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			StudentBeans sb=new StudentBeans();
			sb.setId(rs.getInt(1));
                        sb.setName(rs.getString(2));
                        sb.setEmail(rs.getString(3));
                        sb.setSex(rs.getString(4));
                        sb.setCourse(rs.getString(5));
                         sb.setFee(rs.getFloat(6));
                       sb.setFeepaid(rs.getFloat(7));
                        sb.setMobile(rs.getString(8));
                        sb.setDuefee(rs.getFloat(9));
                        
                        	list.add(sb);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}

 
      public static List<StudentBeans> getRecordsByStart(String start){
		List<StudentBeans> list=new ArrayList<StudentBeans>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where sname like '"+start+"%' ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			StudentBeans sb=new StudentBeans();
			sb.setId(rs.getInt(1));
                        sb.setName(rs.getString(2));
                        sb.setEmail(rs.getString(3));
                        sb.setSex(rs.getString(4));
                        sb.setCourse(rs.getString(5));
                         sb.setFee(rs.getFloat(6));
                       sb.setFeepaid(rs.getFloat(7));
                        sb.setMobile(rs.getString(8));
                        sb.setDuefee(rs.getFloat(9));
                        
                        	list.add(sb);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;

    
}
}
