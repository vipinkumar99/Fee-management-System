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

/**
 *
 * @author vipin
 */
public class AddAccountantDB {
    
      public static int addAccountant(AccountantBeans ab){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("insert into accountant(auname,apassword,aname,adob,asex,aqul,asalary) values(?,?,?,?,?,?,?)");
			ps.setString(1,ab.getUname());
                        ps.setString(2,ab.getPass());
                        ps.setString(3,ab.getName());
                        ps.setString(4,ab.getDob());
                        ps.setString(5,ab.getSex());
			ps.setString(6,ab.getQul());
			ps.setFloat(7,ab.getSal());
                        status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
