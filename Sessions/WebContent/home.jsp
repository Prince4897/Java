<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Keep the page running for 30 Seconds...
<br>Try reloading the page
<br>You will get redirection to home page..
<br>
<%
if(session!=null)
{
	if(session.getAttribute("user")!=null)
	{
		String name=(String) session.getAttribute("user");
		out.print("Hello, "+name+ " Welcome to your Profile Page.");
	}
	else
	{
		response.sendRedirect("Login.html");
	}
}
%>
<br>
<br>
<form action="LogoutController" method="post">
<input type="submit" value="Logout">
</form>
</body>
</html>