package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		System.out.println("post method called");
		PrintWriter out = res.getWriter();
		res.setContentType("Text/HTML");
		String s=req.getParameter("name");
		out.println("<HTML>");
		out.println("<Head>");
		out.println("<Title>");
		out.println("Welcome");
		out.println("</Title>");
		out.println("</Head>");
		out.println("<Body>");
		out.println("Welcome "+s);
		//String s1=req.getParameter("n1");
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n2"));
		out.println("</br>"+"Result "+(a+b)+"</h3>");
		out.println("</Body>");
		out.println("</HTML>");
		
	}
	
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
//	{
//		System.out.println("get method called");
//		PrintWriter out = res.getWriter();
//		out.println("Working");
//	}
	
	
}
