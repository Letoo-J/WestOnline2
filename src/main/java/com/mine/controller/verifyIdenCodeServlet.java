package com.mine.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.service.AssessService;

/**
 * Servlet implementation class verifyIdenCodeServlet
 */
@WebServlet("/verifyIdenCode")
public class verifyIdenCodeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	//用doPost来处理idenCode的检验（异步）
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //设置编码格式
		//System.out.println("verifyIdenCode~~~~\n");
		String idenCode = request.getParameter("idenCode");
		//System.out.println("idenCode:"+idenCode);
		
		AssessService service = new AssessService();
		boolean isExist = service.isExistIdenCode(idenCode);
		response.getWriter().append("{\"isExist\":"+isExist+"}");
	}

}
