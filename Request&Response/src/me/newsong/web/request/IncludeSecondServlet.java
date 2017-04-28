package me.newsong.web.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IncludeSecondServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("IncludeSecondServlet");
		String hehe = (String) request.getAttribute("hehe");
		System.out.println(hehe);
		response.getWriter().println("Visiting IncludeSecondServlet...");
	}

}
