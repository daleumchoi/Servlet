package com.daleum.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class ServletTest03Controller extends HttpServlet{

	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/html");
	
	Date now = new Date();
	
	SimpleDateFormat fomatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	String dateString = fomatter.format(now);
	
	PrintWriter out = response.getWriter();

	out.println("<html> <head> <title>뉴스 기사 출력</title> <head>");
	out.println("<body> <h1>[단독] 고양이가 야옹해</h1>");
	out.println("기사 입력시간 : " + dateString + "<hr>");
	out.println("끝</body> </html>");
	}
}
