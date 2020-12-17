package com.nishant.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int k = (int) req.getAttribute("k"); //To get the data that we've sent in request object.
		
		int s =k;
		k= k*k;
		
		PrintWriter out = res.getWriter();
		out.println("The sum is: "+s); 
		out.println("The square of sum of numbers is "+k);
		
		
	}
}
