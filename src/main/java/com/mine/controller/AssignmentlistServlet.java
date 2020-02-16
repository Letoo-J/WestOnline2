package com.mine.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.bean.Assignmentlist;
import com.mine.service.AssignmentService;


@WebServlet("/admin/assignmentlist")
public class AssignmentlistServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	//用doPost来查看此考核下的所有作业，进行显示
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idenCode = request.getParameter("idenCode");
		
		List<Assignmentlist> list = new AssignmentService().getTheAssignment(idenCode);
		request.setAttribute("assignment_list", list);
		request.getRequestDispatcher("/admin_assess/assignmentlist.jsp").forward(request, response);
	}

}
