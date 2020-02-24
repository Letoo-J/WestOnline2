package com.mine.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.bean.Assess;
import com.mine.service.AssessService;

/**
 * Servlet implementation class getAssessServlet
 */
@WebServlet("/get_assess")
public class getAssessServlet extends HttpServlet {
	
	//用doGet来查询点击的考核,再传到考核详情页面操作:
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idenCode = request.getParameter("idenCode");
		AssessService service = new AssessService();
		Assess as = service.selectAssess(idenCode);  //根据标识码找到该考核记录
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
    	response.getWriter().append("{\"as\":"+as+"}");
        writer.flush();
        
		//request.setAttribute("assess", as);
		//request.getRequestDispatcher("/admin_assess/assess_check_update.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
