package com.neu.ser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class a
 */
@WebServlet("/a")
public class a extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		File client = new File("D:/client_ip.log");
		FileOutputStream fo = new FileOutputStream(client);
		String IP = request.getRemoteAddr();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date date =new Date();
		String date1 = f.format(date);
		String a =date1 +" "+IP;
		fo.write(a.getBytes());
		fo.flush();
		fo.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
