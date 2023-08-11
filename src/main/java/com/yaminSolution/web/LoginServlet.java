package com.yaminSolution.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/onLogin")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object userPassword;
	private Object userEmail;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    } // TODO Auto-generated constructor stub
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		jakarta.servlet.RequestDispatcher rds = request.getRequestDispatcher("header.jsp");
		
		String userEmail = request.getParameter("userEmail");
		String userPassword =request.getParameter("userPassword");
		String rememberOn = request.getParameter("rememberOn");
		
		System.out.println("userEmail :: "+userEmail);
		System.out.println("userPassword:: "+userPassword);

		
		if(userEmail ==null || userEmail.equals("") || userPassword ==null || userPassword.equals("")) {
			System.out.print("<h2>Login failed due to invalid email and password!<h2>");
			 out.print("<h2>Login failed due to invalid email and password!</h2>");
			 rds.include(request, response);
	} else {
		if(userEmail.equals("admin@yamin.com") && userPassword.equals("admin@123!")) {
			rds.include(request, response);
			out.print("Login Successfull!");
		}else {
			 rds.include(request, response);
			out.print("<h2>Login unSuccessfull!</h2>");
	
		}
		
	}
		out.close();
	}
	}	
	
