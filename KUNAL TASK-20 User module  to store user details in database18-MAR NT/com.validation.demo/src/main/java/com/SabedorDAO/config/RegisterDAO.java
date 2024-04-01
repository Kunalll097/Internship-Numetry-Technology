package com.SabedorDAO.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.sabedor.ic.api.RegisterDTO;

@SuppressWarnings("unused")
public class RegisterDAO {
	
	
	
//    @SuppressWarnings("unused")
	public void RegisterUser(RegisterDTO obj) throws Exception  {
		
    	try
    	{
    	 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stud_db","root","Kunal123");
	     Statement stment = conn.createStatement();

		    String qur = "INSERT INTO registeruser(UserName,UserPass,EmployeeName,Email,Mobile,City,Age) VALUES(?,?,?,?,?,?,?)";
		        
		        PreparedStatement preparedStatement = conn.prepareStatement(qur);
		        preparedStatement.setString(1, obj.getUn());
		        preparedStatement.setString(2, obj.getPs());
		        preparedStatement.setString(3, obj.getEmpname());
		        preparedStatement.setString(4, obj.getEmail());
		        preparedStatement.setString(5, obj.getMobile());
		        preparedStatement.setString(6, obj.getCity());
		        preparedStatement.setInt(7, obj.getAge());
		        int i=preparedStatement.executeUpdate(); 
	     
    	}
    	catch (Exception e) {
			throw e;
		}
    	
	}
	
	
}