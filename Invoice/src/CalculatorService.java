import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorService")
public class CalculatorService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		String prod=request.getParameter("pname");
		int quan=Integer.parseInt(request.getParameter("qty"));
		PrintWriter out=response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/Table1");
		int c = 0,sum=0;
		if(prod.equals("Soap"))
		{
			c=1;
		}
		else if(prod.equals("Deo"))
		{
			c=2;
		}
		else if(prod.equals("Maggie"))
		{
			c=3;
		}
		else
		{
			response.sendRedirect("Table1.html");
		}
		switch(c)
		{
		case 1:
			sum=quan*25;
			out.print("Your total is: "+sum);
			break;
		case 2:
			sum=quan*250;
			out.print("Your total is: "+sum);
			break;
		case 3:
			sum=quan*10;
			out.print("Your total is: "+sum);
			break;
		}
	}

}
