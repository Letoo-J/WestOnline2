package com.mine.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.service.AssignmentService;

/**
 * Servlet implementation class DeleteAssignmentListServlet
 */
@WebServlet("/admin/delete_AssignmentList")
public class DeleteAssignmentListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	//用doPost处理选择删去的作业信息：
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Integer> subId_list = (List<Integer>)request.getAttribute("subId_list"); //得到要删除的作业id_List
		AssignmentService service = new AssignmentService();
		boolean isSuccess = service.deleteAssinmentList(subId_list);
		
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
