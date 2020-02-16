////不用的
//package com.mine.controller;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.mine.service.AssignmentService;
//
///**
// * Servlet implementation class SubmitServlet
// */
//@WebServlet("/submit_do")
//public class SubmitServlet extends HttpServlet {
//	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	
//	
//	//用doPost来处理作业提交
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8"); //设置编码格式
//		String sid = request.getParameter("sid");
//		String sname = request.getParameter("sname");
//		String idenCode = request.getParameter("idenCode");
//		String document = request.getParameter("document");
//		
//		if(sid.isEmpty()) { 
//			request.setAttribute("msg", "<font color='red'>学号不可为空！</font>"); //设置提示。
//			request.getRequestDispatcher("/submit/submit.jsp").forward(request, response);
//		}else if(sname.isEmpty()) {
//			request.setAttribute("msg", "<font color='red'>姓名不可为空！</font>"); //设置提示。
//			request.getRequestDispatcher("/submit/submit.jsp").forward(request, response);
//		}else if(idenCode.isEmpty()){
//			request.setAttribute("msg", "<font color='red'>考核选项不可为空！</font>"); //设置提示。
//			request.getRequestDispatcher("/submit/submit.jsp").forward(request, response);
//		}else if(document.isEmpty()) {
//			request.setAttribute("msg", "<font color='red'>提交文件不可为空！</font>"); //设置提示。
//			request.getRequestDispatcher("/submit/submit.jsp").forward(request, response);
//		}
//		
//		AssignmentService service = new AssignmentService();
//		int isSuccess = service.submitAssignment(sid, sname, idenCode, document);
//		if(isSuccess!=0) {
//			request.setAttribute("msg", "<font color='green'>提交成功！</font>"); //设置提示。
//			request.getRequestDispatcher("/submit/submit.jsp").forward(request, response);
//		}else {
//			request.setAttribute("msg", "<font color='red'>提交失败（一股神秘力量吞噬了你的作业！）</font>");
//			request.getRequestDispatcher("/submit/submit.jsp").forward(request, response);
//		}
//	}
//
//}
