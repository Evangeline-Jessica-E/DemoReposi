package myservletproject.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Student")
public class StudentDetail extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		int Id=Integer.parseInt(req.getParameter("s_id"));
		String Name=req.getParameter("s_name");
		String Email=req.getParameter("s_email");
		long Contact=Long.parseLong(req.getParameter("s_mobno"));
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school?user=root&password=root");
			String queryString ="insert into student value(?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(queryString);
			pst.setInt(1,Id);
			pst.setString(2, Name);
			pst.setString(3, Email);
			pst.setLong(4, Contact);
			int a= pst.executeUpdate();
			con.close();
			res.getWriter().println(a + "row added");
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
