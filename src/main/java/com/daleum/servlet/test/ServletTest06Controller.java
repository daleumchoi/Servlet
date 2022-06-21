package com.daleum.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class ServletTest06Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");
		
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		
		int addtion = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		int division = num1 / num2;
		out.println("{\"addtion\":" + addtion + ", \"subtraction\":" + subtraction + ", \"multiplication\":" + multiplication + ",\"division\":" + division + "}");
	}

}
