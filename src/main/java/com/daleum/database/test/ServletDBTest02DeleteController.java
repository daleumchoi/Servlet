package com.daleum.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daleum.common.MysqlService;

@WebServlet("/db/test02/delete")
public class ServletDBTest02DeleteController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "delete from `favorites` where `id` = " + id + ";";
	
		mysqlService.update(query);
		
		try {
			response.sendRedirect("/db/test02.jsp");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
