

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid=request.getParameter("uid");
		String pass=request.getParameter("pass");
		
	if(uid.matches("[0-9]+") && pass.matches("[a-zA-Z]+")) {
	if(uid.equals("518") && pass.equals("test")) {
		request.setAttribute("name", uid);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
		//response.sendRedirect("welcome.jsp");
	}else {
		
	request.setAttribute("error", "Invalid credentials");
	request.getRequestDispatcher("login.jsp").forward(request, response);
	}
		}else {
			request.setAttribute("error", "User id and password not in specified format");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
	}
}
