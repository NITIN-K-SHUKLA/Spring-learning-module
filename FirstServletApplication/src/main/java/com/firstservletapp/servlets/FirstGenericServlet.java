package com.firstservletapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstGenericServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printwriter = res.getWriter();
		printwriter.print("<h1>Hello Nitin Kumar Shukla your first generic servlet ready</h1>");
		
	}

}
