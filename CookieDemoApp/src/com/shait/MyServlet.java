package com.shait;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		
	
	
		
		Cookie cookie1=new Cookie("name",name);
		Cookie cookie2=new Cookie("email", email);
		Cookie cookie3=new Cookie("pass", pass);
		
		res.addCookie(cookie1);
		res.addCookie(cookie2);
		res.addCookie(cookie3);
		
		res.sendRedirect("sec");
		
		
		
		
				
	}

}
