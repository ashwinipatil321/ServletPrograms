package com.bridgelabz.servletprpgramsPractice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class basicSrvlet extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();
		pw.print("<html><body><h1><hellow.../h1></body></html>");
		pw.flush();
		pw.close();
	}

}
