package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/ServletConfig")
public class ServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		javax.servlet.ServletConfig scg=getServletConfig();
		javax.servlet.ServletContext sc=getServletContext();
		out.println(scg.getInitParameter("email"));
		out.println("</br>");
		out.println(sc.getInitParameter("userName"));
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}



}
