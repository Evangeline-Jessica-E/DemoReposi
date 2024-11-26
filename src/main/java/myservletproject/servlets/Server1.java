package myservletproject.servlets;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Server1")
public class Server1 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		long contact=Long.parseLong(req.getParameter("mob_no"));
		String email=req.getParameter("mail_id");
		req.setAttribute("num", contact);
		req.setAttribute("mail", email);
		RequestDispatcher rd=req.getRequestDispatcher("Server2");
		rd.forward(req, res);
	}
}
