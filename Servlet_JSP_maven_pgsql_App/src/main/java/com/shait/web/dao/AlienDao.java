package com.shait.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.shait.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid){
		
		Alien a =new Alien();
	
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","tiger");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from alien where aid=" + aid);
			if(rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setCourse(rs.getString("course"));
				
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		return a;
	}

}
