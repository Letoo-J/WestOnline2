package com.mine.controller;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.bean.Assess;
import com.mine.service.AssessService;


/**
 * Servlet implementation class AssessUpdateServlet
 */
@WebServlet("/admin/assess_update")
public class AssessUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	//用doPost进行修改后考核信息的提交
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); 
		                       
		String idenCode = request.getParameter("idenCode");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		String deadline = request.getParameter("deadline");
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");  //设置输入时间格式
		Date deadline2 = null;
		try{
			if(deadline != null) {
				deadline2 = format.parse(deadline);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		Assess as = new Assess(name,content,deadline2,idenCode);
		
		
		AssessService service = new AssessService();
		boolean isSuccess = service.updateAssess(as);
		//System.out.println(isSuccess);
		response.getWriter().append("{\"isSuccess\":"+isSuccess+"}");
		
		if(isSuccess) {
			request.setAttribute("idenCode", idenCode);
			request.getRequestDispatcher("/admin/assess_check_update.jsp").forward(request, response);
		}

	}

}
