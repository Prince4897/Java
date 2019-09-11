

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class city
 */
@WebServlet("/city")
public class city extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		String addrs=request.getParameter("addr");
//		PrintWriter out=response.getWriter();
//		RequestDispatcher rd=request.getRequestDispatcher("/success.html");
//		if(addrs.equals("delhi"))
//		{
//			rd.forward(request, response);
//		}
//		else
//		{
//			out.println("Enter valid data");
//			response.sendRedirect("login.html");
//		}
		//doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String addrs=request.getParameter("addr");
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/success.html");
		if(addrs.equals("delhi"))
		{
			rd.forward(request, response);
		}
		else
		{
			out.println("Enter valid data");
			response.sendRedirect("login.html");
		}
	}

}
