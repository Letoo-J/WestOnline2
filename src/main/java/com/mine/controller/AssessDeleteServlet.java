package com.mine.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mine.service.AssessService;
import org.springframework.context.ApplicationContext;


@WebServlet("/admin/assess_delete")
public class AssessDeleteServlet extends HttpServlet {
       
	//用doGet处理考核的删除：
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idenCode = request.getParameter("idenCode");
		
		AssessService service = new AssessService();
		int isSuccess = service.assessDelete(idenCode);
		if(isSuccess != 0) {  //删除成功
			PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+true+"}");
        	writer.flush();
			
			//request.setAttribute("delete_msg", "<font color='green'>删除考核成功！</font>"); //设置提示。
			//request.getRequestDispatcher("/admin/assess_managment").forward(request, response);
		}else {  //未删除
			PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+false+"}");
            writer.flush();
			
			//request.setAttribute("delete_msg", "<font color='red'>删除考核失败！</font>");
			//request.getRequestDispatcher("/admin/assess_managment").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
