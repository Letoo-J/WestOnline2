package com.mine.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.service.AssignmentService;

/**
 * Servlet implementation class DeleteAssignmentServlet
 */
@WebServlet("/admin/delete_Assignment")
public class DeleteAssignmentServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	//用doPost处理删除某一条作业信息：
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer subId = (Integer)request.getAttribute("subId"); //得到要删除的作业id
		AssignmentService service = new AssignmentService();
		boolean isSuccess = service.deleteAssinment(subId);
		
		if(isSuccess) {   //删除成功
			PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+true+"}");
        	writer.flush();
		}else {  //删除失败
			PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+false+"}");
            writer.flush();
		}
		
	}

}
