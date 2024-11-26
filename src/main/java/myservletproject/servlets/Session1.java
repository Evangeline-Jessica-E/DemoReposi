package myservletproject.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Session1")
public class Session1 extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("mail");
		String password=req.getParameter("pwd");
		if(email.equals("jesh411me@gmail.com") && password.equals("jessi411"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("key1",email);
			resp.sendRedirect("Session2");
		}
		else
		{
			resp.getWriter().println("Invalid User");
		}
	}
}

