package com.ust.demo5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet5
 */
@WebServlet("/servlet5")
public class servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    /*public servlet5() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
	Cookie[] cookies = request.getCookies();
	for(int i =0;i < cookies.length;i++) {
		Cookie c = cookies[i];
		String name=c.getName();
		String value=c.getValue();
		out.println(name+"="+value);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);*/
	
	String name=request.getParameter("cookieName");
	if(name !=null && name.length()>0) {
		String value = request.getParameter("cookieValue");
		Cookie c = new Cookie(name,value);
		response.addCookie(c);
	}
	}
}
