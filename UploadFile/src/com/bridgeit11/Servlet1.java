package com.bridgeit11;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@SuppressWarnings("serial")
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter printWriter = response.getWriter();  
		          
		MultipartRequest multipartRequest=new MultipartRequest(request,"/home/bridgeit/fileUpload");  
		printWriter.print("successfully uploaded");
	}

}
