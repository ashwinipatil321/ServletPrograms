package com.bridgeit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServerResponseRefresh")
public class ServerResponseRefresh extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setIntHeader("Refresh", 1);

		// Set response content type
		response.setContentType("text/html");

		// Get current time
		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);

		if(calendar.get(Calendar.AM_PM) == 0)
			am_pm = "AM";
		else
			am_pm = "PM";

		String CT = hour+":"+ minute +":"+ second +" "+ am_pm;

		PrintWriter printWriter = response.getWriter();
		String title = "Auto Refresh ";

		String docType =
				"<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

		printWriter.println(docType +
				"<html>\n" +
				"<head><title>" + title + "</title></head>\n"+
				"<body bgcolor = \"lavender\">\n" +
				"<h1 align = \"center\">" + title + "</h1>\n" +
				"<p>Current Time is: " + CT + "</p>\n"
				);

	}	
}





