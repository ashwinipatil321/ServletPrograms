package com.bridgeit9;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")
public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();
	        String user = (String)session.getAttribute("user");
	        out.println("Hello "+user);
		    }  
		      
	}


