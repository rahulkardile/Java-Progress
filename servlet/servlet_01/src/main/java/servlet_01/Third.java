package servlet_01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(("/third"))
public class Third extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.print("Processing The Third Servlet...");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Post method");
		
		String username = req.getParameter("username");
		Date date = new Date();

		System.out.println(username);
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.write("<h1>Form Submition done!</h1>");
		writer.write("<h1>welcome %s </h1>".formatted(username));
		writer.write("<h1> current date %s </h1>".formatted(date));		
		resp.setStatus(301);
	}
	
	
	
	
}
