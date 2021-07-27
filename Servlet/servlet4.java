package com.ust.demo4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class servlet4
 */
@WebServlet("/servlet4")
public class servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	public String firstName;
	public String lastName;
	public class HTMLFilter{
		public static String filter(String name) {
			return name;
		}
	}

    /**
     * Default constructor. 
     */
  /*  public servlet4() {
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
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Request Parameters Example</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Request Parameters Example</h3>");
		out.println("parameters in this request:</br>");
		
		if(firstName !=null || lastName != null) {
			out.println("first Name:");
			out.println(" = "+ HTMLFilter.filter(firstName)+"<br>");
			out.println("Last Name:");	
			out.println(" = "+ HTMLFilter.filter(lastName)+"<br>");
		}else {
			out.println(" No parameters,please enter some");
		}
		out.println("<p>");
		out.println("<form action=\" ");
		out.println("Request paramExample\" ");
		out.println("method=POST>");
		out.println("First Name:");
		out.println("<input type=text size=20 name=firstname> ");
		out.println("<br>");
		out.println("Last Name:");
		out.println("<input type=text size=20 name=lasttname> ");
		out.println("<br>");
		out.println("<input type=submit>");

		out.println("</form>");

		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
