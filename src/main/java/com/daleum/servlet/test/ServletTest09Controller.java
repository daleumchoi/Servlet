package com.daleum.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class ServletTest09Controller extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String selfIntroduction = request.getParameter("selfIntroduction");
		
		out.println("<html> <head> <title>입사지원</title> </head>");
		out.println("<body>");
		out.println("<h2>" + name + "님 지원이 완료 되었습니다.</h2> <hr>");
		out.println("<p>지원내용</p> <br>" + selfIntroduction);
		out.println("</body> </html>");
	}
}
