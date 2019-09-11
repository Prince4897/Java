package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ForwardController")
public class ForwardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
//    public ForwardController() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pass=request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<body><b>Welcome to ForwardController Second Servlet</b>");
		out.println("<b>User Name is: "+ un+"</b>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br></body>");
		RequestDispatcher dis=request.getRequestDispatcher("/TestController");
		dis.forward(request,response);
//		doGet(request, response);
	}

}
