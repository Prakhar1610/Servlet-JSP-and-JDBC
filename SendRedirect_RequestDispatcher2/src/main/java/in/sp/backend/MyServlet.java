package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		
		if(myemail.equals("prakhar@gmail.com") && mypass.equals("prakhar123"))
		{
			req.setAttribute("name_key", "Prakhar Singh");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);//forwards request within application
		}
		else
		{
			resp.setContentType("text/html");//this helps in showing the content of index.html
			out.println("<h3 style = 'color:red'>Email id and Password didn't matched</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			//rd.forward(req, resp);
			rd.include(req, resp);//include both index.html & out.print but this will print source code of index.html 
			                      //instead of it's content
		}
	}
}
