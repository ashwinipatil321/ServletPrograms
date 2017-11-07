package com.bridgeit16;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


public class MyFilter implements Filter {

    

	public void destroy() {
		System.out.println("filter destroyed");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	      System.out.println("do filter!!! by annotations " );  
	         
	       chain.doFilter(request,response); 
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter initilized");
	}

}