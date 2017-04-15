package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;



public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         String f_name= request.getParameter("fname");
         String l_name=request.getParameter("lname");
         String email=request.getParameter("eid");
         String uid=request.getParameter("uid");
         String passwd=request.getParameter("pwd");
         
         PrintWriter out = response.getWriter();  
         out.println(f_name);
 
         
        /* if(uid.matches("[0-9]+")) {
         	//System.out.println("Success");
         	response.sendRedirect("success.jsp");
         }
         else {
         	response.sendRedirect("register.jsp");
         }   */
                 
	}

	// passwd.matches("[a-zA-Z]") && 

}
