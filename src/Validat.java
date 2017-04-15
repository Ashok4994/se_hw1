

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validat
 */
@WebServlet("/Validat")
public class Validat extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String f_name= request.getParameter("fname");
         String l_name=request.getParameter("lname");
         String email=request.getParameter("eid");
         String uid=request.getParameter("uid");
         String passwd=request.getParameter("pwd");
         final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        		             + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

 
         if(uid.matches("[0-9]+") && passwd.matches("[a-zA-Z]+") && email.matches(EMAIL_PATTERN)) {
          	
        	 RequestDispatcher rd=request.getRequestDispatcher("/success.jsp");
        	 request.setAttribute("fn", f_name);
        	 request.setAttribute("lnam",l_name);
        	 rd.forward(request,response);
          	
          }
          else {
        	  request.setAttribute("error", "Invalid email id or userid  or password.They should be in specified format.");
          
          request.getRequestDispatcher("register.jsp").forward(request, response);
          }
		
	}

	

}
