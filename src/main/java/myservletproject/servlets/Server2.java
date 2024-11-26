package myservletproject.servlets;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Server2")
public class Server2 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		Long num=(Long)req.getAttribute("num");
		String mail=(String)req.getAttribute("mail");
		res.getWriter().println(num + " " + mail);
	}
}
