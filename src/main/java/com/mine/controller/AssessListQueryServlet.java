package com.mine.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.bean.Assess;
import com.mine.service.AssessService;


@WebServlet("/admin/assess_managment")
public class AssessListQueryServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	//用doPost来查询所有考核,再传到考核管理页面显示:
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Assess> list=new AssessService().getAllAssesses();
		request.setAttribute("assess_list", list);
		request.getRequestDispatcher("/admin_assess/assess_managment.jsp").forward(request, response);
	}

}
