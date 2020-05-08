package com.phy.test;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="Test1",urlPatterns= {"/Test1"},
	initParams= {@WebInitParam(name="name",value="PPP"),@WebInitParam(name="age",value="24")})
public class Test implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println(arg0.getInitParameter("name"));
		System.out.println(arg0.getServletName());
		System.out.println(arg0.getServletContext());
		Enumeration<String> params=arg0.getInitParameterNames();
		while (params.hasMoreElements()) {
			String string = arg0.getInitParameter(params.nextElement());
			System.out.println(string);
		}
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
