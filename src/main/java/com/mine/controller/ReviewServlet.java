package com.mine.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.bean.Assignmentlist;
import com.mine.service.AssignmentService;

/**
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/admin/review_do")
public class ReviewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	//用doPost进行作业评审（修改）：
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer subId = (Integer)request.getAttribute("subId");
		String review = request.getParameter("review");
		
		AssignmentService service = new AssignmentService();
		//修改审核状态:	               
		service.updateReview(subId, review); 
		
		//request.setAttribute("idenCode", idenCode);
		//request.getRequestDispatcher("/admin_assess/assignmentlist.jsp").forward(request, response);
	}

}
