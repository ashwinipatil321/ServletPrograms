package com.bridgeit.Controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Model.LoginBean;

@SuppressWarnings("serial")
public class ControllerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");  
		String name=request.getParameter("name");  
		String password=request.getParameter("password");  

		LoginBean bean=new LoginBean();  
		bean.setUserName(name);  
		bean.setPassword(password);  
		request.setAttribute("bean",bean);  

		boolean status=bean.validate();  

		if(status){  
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("LoginSuccess.jsp");  
			requestDispatcher.forward(request, response);  
		}  
		else{  
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("Loginerror.jsp");  
			requestDispatcher.forward(request, response);  
		}  
	}
}  
