package com.bridgeit2;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("jsp/txt");
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		if(userPass.equals("servlet"))
		{
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("WelcomeServlet");
			requestDispatcher.forward(request, response);
		}
		else
		{
			pw.println("Sorry Wrong password....");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/index2.html");  
			requestDispatcher.include(request,response);  
		}
	}
}