<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
 body {background-color: #ff7f50;}
</style>
<div>
<body>
	<center>
		<h2>
			<%
            out.println("Login Successfully....");
			String email = (String)session.getAttribute("dataEmailId");
			out.println("Hellow-->"+email);
            %>
		</h2>
		 <a href="login.jsp">Logout</a>
	</center>
</body>
</html>