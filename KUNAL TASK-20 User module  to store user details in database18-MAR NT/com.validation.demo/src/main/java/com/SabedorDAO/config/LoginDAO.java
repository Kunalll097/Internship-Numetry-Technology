package com.SabedorDAO.config;
import java.sql.*;

import com.sabedor.ic.api.RegisterDTO;
import com.sabedor.ic.api.loginDTO;

@SuppressWarnings("unused")
public class LoginDAO {
	
	
        @SuppressWarnings("unused")
		public boolean CheckLogin(loginDTO obj) throws Exception  {
		
    	try
    	{
    	 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stud_db","root","Kunal123");
	     Statement stment = conn.createStatement();

		    String qur = "SELECT * FROM registeruser WHERE UserName=? and UserPass=?";
		        
		        PreparedStatement preparedStatement = conn.prepareStatement(qur);
		        preparedStatement.setString(1, obj.getUn());
		        preparedStatement.setString(2, obj.getPs());
		       
		        ResultSet Rs =preparedStatement.executeQuery(); 
		        
		        if(Rs.next()==false)
		        	return false;
		        else
		        	return true;
	     
    	}
    	catch (Exception e) {
			throw e;
		}
    	
	}
	

}