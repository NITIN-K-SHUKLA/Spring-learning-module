package com.servletcontext.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletContextParam
 */
public class servletContextParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletContextParam() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	super.init(config);
    	config.getServletContext();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h1> The values are </h1>");
		ServletContext sc = request.getServletContext();
		
		printWriter.print("<h2> The DB IP param is" + sc.getInitParameter("db-ip") + "</h2>");
		printWriter.print("<h2> The DB PORT param is" + sc.getInitParameter("db-port") + "</h2>");

		Enumeration<String> enumeration = sc.getInitParameterNames();
		while(enumeration.hasMoreElements()){

			String param = enumeration.nextElement();
			printWriter.print("<h3> Value : " + sc.getInitParameter(param) + "</h3>");
		}
		sc.setAttribute("happy", "Nitin Kumar Shukla");
		printWriter.print("<h1> Value3 : " + sc.getAttribute("happy") + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
