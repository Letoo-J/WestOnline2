package com.mine.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;

import com.mine.service.AssessService;


@WebServlet("/admin/release_do")
public class AssessReleaseServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	//用doPost来发布考核信息：
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //设置编码格式
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		String deadline = request.getParameter("deadline");
		//发布考核时自动生成标识码：前端不需输入。没有进行数据库检测，小概率会重复。。。
		String idenCode = new Base64().encode((UUID.randomUUID().toString()).getBytes()).toString();
		idenCode = idenCode.replace("[B@", "");
		
//		由前端判非空：
//		if(idenCode.isEmpty()) { 
//			request.setAttribute("msg", "<font color='red'>考核标识码不可为空！</font>"); //设置提示。
//			request.getRequestDispatcher("/admin_assess/assess_release.jsp").forward(request, response);
//		}else if(name.isEmpty()) {
//			request.setAttribute("msg", "<font color='red'>考核名称不可为空！</font>"); //设置提示。
//			request.getRequestDispatcher("/admin_assess/assess_release.jsp").forward(request, response);
//		}else if(deadline.isEmpty()){
//			request.setAttribute("msg", "<font color='red'>考核截止时间不可为空！</font>"); //设置提示。
//			request.getRequestDispatcher("/admin_assess/assess_release.jsp").forward(request, response);
//		}
		
		AssessService service = new AssessService();
		int isSuccess = service.assessRelease(name, content, idenCode, deadline);
		if(isSuccess!=0) {  //发布成功
			PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+true+"}");
        	writer.flush();
//			request.setAttribute("msg", "<font color='green'>发布成功！</font>"); //设置提示。
//			request.getRequestDispatcher("/admin_assess/assess_release.jsp").forward(request, response);
		}else {
			PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+false+"}");
            writer.flush();
//			request.setAttribute("msg", "<font color='red'>发布失败，请检查标识码是否重复！</font>");
//			request.getRequestDispatcher("/admin_assess/assess_release.jsp").forward(request, response);
		}
  	}

}
