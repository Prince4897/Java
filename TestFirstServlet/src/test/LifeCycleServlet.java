package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	public void init() throws ServletException
	{super.init();
	System.out.println("Inside init method");
	}
	
	
    public LifeCycleServlet() {
      System.out.println("Creating object of a LifeCycleServlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Lifecycleservlet is called");
		PrintWriter p=response.getWriter();
		response.setContentType("text/html");
		p.print("<b>LifeCycle Servlet get Called..");
		p.println("Refresh the page to check life cycle method");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void destroy()
	{
		super.destroy();
		System.out.println("Destroying...");
	}
	

}
