package com.bridgeit9;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings({ "unused", "serial" })
public class servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			 String userName = request.getParameter("userName");
		        String password = request.getParameter("password");
		        
		        if(password.equals("1234"))
		        {
		            //creating a session
		            HttpSession session = request.getSession();
		            session.setAttribute("user", userName);
		            response.sendRedirect("Servlet2");
		        } 
		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}




