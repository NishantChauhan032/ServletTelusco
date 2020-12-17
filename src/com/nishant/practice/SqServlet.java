package com.nishant.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
//		int k = (int) req.getAttribute("k"); //To get the data that we've sent in request object.
//		int k = Integer.parseInt(req.getParameter("k")); // to get parameter by key-value
		
//		HttpSession session = req.getSession(); // starting the session
//		
////		session.removeAttribute("k"); --to remove data from the session, so in next line,we wont get any data
//		
//		int k = (int)session.getAttribute("k"); // getting value that we assigned in AddServlet in session.

		Cookie cookies[] = req.getCookies(); // getting all trhe cookies..in an array
		
		int k = 0;
		for(Cookie c : cookies) {            // iterating through the cookies
			if(c.getName().equals("k")) {    // finding the cookie containing value of k
				k  = Integer.parseInt(c.getValue());  
			}
		}
		
		int s =k;
		k= k*k;
		
		PrintWriter out = res.getWriter();
		out.println("The sum is: "+s); 
		out.println("The square of sum of numbers is "+k);
		
		
	}
}
