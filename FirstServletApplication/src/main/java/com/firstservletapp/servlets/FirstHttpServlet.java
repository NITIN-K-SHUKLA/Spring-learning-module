package com.firstservletapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstHttpServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 616376248890832682L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printwriter = res.getWriter();
		printwriter.print("<h1>Hello Nitin Kumar Shukla your first HTTP servlet ready</h1>");
		
	}
}
