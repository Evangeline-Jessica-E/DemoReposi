package myservletproject.servlets;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/home")
public class AppHome  extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		res.getWriter().println("Welcome Home");
		//req.getRequestDispatcher("logout").include(req,res);
		req.getRequestDispatcher("logout").forward(req,res);
	}
}
