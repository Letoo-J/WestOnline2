package com.mine.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.mine.bean.Assess;
import com.mine.service.AssessService;

/**
 * Servlet implementation class FuzzySearchAS
 */
@WebServlet("/FuzzySearchAS")
public class FuzzySearchAsServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//模糊查询考核(根据考核名称和考核内容)：
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String data = request.getParameter("data");
		AssessService service = new AssessService();
		List<Assess> list = service.FuzzySearchAS(data);
		
		response.setContentType("text/html; charset=UTF-8");
		String json = JSON.toJSONString(list); 
		response.getWriter().print(json);
	}

}
