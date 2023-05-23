package com.firstservletapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

//	ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
//		this.config = config;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter printwriter = res.getWriter();
		printwriter.print("<h1>Hello Nitin Kumar Shukla</h1>");
	}

}
