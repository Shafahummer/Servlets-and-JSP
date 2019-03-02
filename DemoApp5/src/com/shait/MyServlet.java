package com.shait;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		
		//PrintWriter out=res.getWriter();
	//	out.println(name);
		//out.println(email);
		//out.println(pass);
		req.setAttribute("na",name);
		req.setAttribute("em",email);
		req.setAttribute("pa",pass);
		
		RequestDispatcher rd=req.getRequestDispatcher("sec");
		rd.forward(req, res);
				
	}

}
