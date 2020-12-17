package com.nishant.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet { //a simple class must extend HttpServlet to act as servlet
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { //method name always "service"
		//doGet and doPost can also be used to restrict values to show or not show in url
		//but above both will be called via service method only!!
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		req.setAttribute("k", k); //we are sending data to square servlet by putting it in request object
		
		RequestDispatcher rd = req.getRequestDispatcher("sq"); //to call other servlet
		rd.forward(req, res);
		
		/*
		 * PrintWriter out = res.getWriter(); //this is used to print result in browser.
		 * out.println("The result is: "+k); // ``
		 */	
		}

}
