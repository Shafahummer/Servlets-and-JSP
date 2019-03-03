package com.shait;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {

		
	
		String n = null,e=null,p=null;
		Cookie cookies[]=req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("name"))
				n=c.getValue();
			if(c.getName().equals("email"))
				e=c.getValue();
			if(c.getName().equals("pass"))
				p=c.getValue();
		}
		
		
		PrintWriter out=res.getWriter();
		if(n.equals("shafah")&&e.equals("sha@gmail.com")&&p.equals("12345"))
			out.println("Login Success");
		else
			out.println("Login fails");

		
	}
	

}
