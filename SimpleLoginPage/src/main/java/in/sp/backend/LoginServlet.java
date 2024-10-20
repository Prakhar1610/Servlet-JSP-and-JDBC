package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginForm")
public class LoginServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
        resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		//retrieving values from login.jsp
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		try 
		{
			//Loading and Registering the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplelogin" , "root" , "mysql@123");
			
			//Creating statement
			PreparedStatement ps = con.prepareStatement("select * from List where email=? and password=?");
			ps.setString(1 , myemail);
			ps.setString(2 , mypass);
			
			//Executing the SQL statement
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				HttpSession session = req.getSession();//creating a new session
				session.setAttribute("session_name" , rs.getString("name"));
				RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
				rd.include(req, resp);
			}
			else
			{
				//resp.setContentType("text/html");
				out.print("<h3 style='color:red'>Email id and Password didn't matched</h3>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}
		} 

		catch(Exception e)
		{
			e.printStackTrace();
			
			//resp.setContentType("text/html");
			out.print("<h3 style='color:red'>"+e.getMessage()+"</h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}
		
	}
}
