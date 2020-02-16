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

import com.mine.bean.Assignmentlist;
import com.mine.service.AssignmentService;

/**
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/review_do")
public class ReviewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	//用doPost进行评审（修改）
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //设置编码格式
		//Assignmentlist ag = (Assignmentlist) request.getAttribute("assignmentlist");
		//System.out.println("修改的作业："+ag);
		
		String sid = request.getParameter("sid");
		String str_subDate = request.getParameter("subDate");
		String idenCode = request.getParameter("idenCode");
		String review = request.getParameter("review");
		
		AssignmentService service = new AssignmentService();
		//修改审核状态
		Assignmentlist ag = new Assignmentlist();
		
		//字符串转化为Date类型:
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");    // 这里填写的是想要进行转换的时间格式
		Date subDate = null;
		try{
			subDate = format.parse(str_subDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		ag.setSid(sid);
		ag.setsubDate(subDate);
		service.updateReview(ag, review); 
		
		request.setAttribute("idenCode", idenCode);
		request.getRequestDispatcher("/admin/assignmentlist").forward(request, response);
	}

}
