package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pass=request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(un.equals("Prince")&&pass.equals("hey")) {
		out.println("<body><b>Welcome you have passed the test</b>");
		out.println("<b>User Name is: "+ un+"</b>");
		out.println("<br></body>");
//		RequestDispatcher dis=request.getRequestDispatcher("/TestController");
//		dis.forward(request,response);
		}
		else
		{
			out.println("<body><b>Welcome you have failed the test</b>");
			out.println("<br></body>");
		}
	}

}
