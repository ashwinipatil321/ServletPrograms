package com.bridgeit16;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/MyFilter")
public class MyFilter implements Filter {

    public MyFilter() {
    	
    }
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter Initialization....");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		System.out.println("Do Filter by annotation...");
		chain.doFilter(request, response);
	}
	public void destroy() {
		System.out.println("Filter is distroyed....");
	}

}
