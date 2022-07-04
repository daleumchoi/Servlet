package com.daleum.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daleum.common.MysqlService;

@WebServlet("/db/test02/insert")
public class ServletDBTest02InsertController extends HttpServlet{
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "insert into `favorites`\r\n"
				+ "(`name`, `url`, `createdAt`, `updatedAt`)\r\n"
				+ "value\r\n"
				+ "('" + name + "', '" + url + "', now(), now());";
	
		mysqlService.update(query);
		
		response.sendRedirect("/db/test02.jsp");
	}

}
