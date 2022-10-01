package com.jspservweb.demoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class demoServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");//setting the content type 
		PrintWriter pw = resp.getWriter();
		HttpSession sess =  req.getSession();
		sess.setAttribute("sessVar","Hi I am from user added session variable");
		//pw.write("<html><body><h1> Welcome Message from Normal Servlet");
		req.getRequestDispatcher("/forwarded1.jsp").forward(req, resp);
	}

}
