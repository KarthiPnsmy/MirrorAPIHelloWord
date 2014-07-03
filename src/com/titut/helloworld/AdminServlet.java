package com.titut.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminServlet extends HttpServlet{
	
	@Override
	  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException   {
		
		try{
		req.getRequestDispatcher("/index2.jsp").forward(req, res);
		}catch(Exception e){
			 PrintWriter out = res.getWriter();
			 out.println("Hello, world!");
		}

	}


}
