package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {
	
	String query="select * from userid where uname=? and password=?";
	
	public boolean checkUserId(String uname,String password)
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","tiger");
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();
			
			if(rs.next())
				return true;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return false;
	}

}
