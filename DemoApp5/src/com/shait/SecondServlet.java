package com.shait;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String n= (String) req.getAttribute("na");
		String e=(String)req.getAttribute("em");
		String p=(String)req.getAttribute("pa");
		
		PrintWriter out=res.getWriter();
		out.println(n);
		out.println(e);
		out.println(p);
		
		
	}
	

}
