package com.bridgeit8;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			 response.setContentType("text/html;charset=UTF-8");
		        PrintWriter printWriter = response.getWriter();
		        
			//getting value submitted in form from HTML file
		        String userName = request.getParameter("userName");
		        
		        //creating a new hidden form field
		        printWriter.println("<form action='SecondServlet'>");
		        printWriter.println("<input type='hidden' name='userName' value='"+userName+"'>");
		        printWriter.println("<input type='submit' value='submit' >");
		        printWriter.println("</form>");

		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}


