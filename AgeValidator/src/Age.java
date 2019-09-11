

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Age")
public class Age extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String uname=request.getParameter("name");
		int uage=Integer.parseInt(request.getParameter("age"));
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/city");
		if(uage>=18)
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
