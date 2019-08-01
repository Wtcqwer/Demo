package com.neu.ser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neu.entity.shangpin;

/**
 * Servlet implementation class qServlet
 */
@WebServlet("/qServlet")
public class qServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name  = request.getParameter("name");
		String password  =request.getParameter("password");
		/*if("admin1".equals(name) && "123".equals(password)){
			Cookie cookie = new Cookie("name",name);
			response.addCookie(cookie);
		}*/
		if(name.startsWith("neu") && password.endsWith("it")) {
			request.getRequestDispatcher("/adr.jsp").forward(request, response);
		}	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
