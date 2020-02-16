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

import com.mine.bean.Assess;
import com.mine.service.AssessService;


/**
 * Servlet implementation class AssessUpdateServlet
 */
@WebServlet("/admin/assess_update")
public class AssessUpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	//鐢╠oPost鏉ヤ慨鏀硅�冩牳淇℃伅
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //璁剧疆缂栫爜鏍煎紡
		System.out.println("hhhhh\n");
		String idenCode = request.getParameter("idenCode");
		String showDate = request.getParameter("showDate");
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		String deadline = request.getParameter("deadline");
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");    // 杩欓噷濉啓鐨勬槸鎯宠杩涜杞崲鐨勬椂闂存牸寮�
		Date deadline2 = null;
		Date showDate2 = null;
		try{
			if(deadline != null) {
				deadline2 = format.parse(deadline);
			}
			showDate2 = format.parse(showDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		Assess as = new Assess();
		as.setidenCode(idenCode);
		as.setshowDate(showDate2);
		as.setName(name);
		as.setContent(content);
		as.setDeadline(deadline2);
		
		AssessService service = new AssessService();
		boolean isSuccess = service.updateAssess(as);
		System.out.println(isSuccess);
		response.getWriter().append("{\"isSuccess\":"+isSuccess+"}");
		
		if(isSuccess) {
			request.setAttribute("assess", as);
			//request.getRequestDispatcher("/admin_assess/assess_check_update.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/admin/get_assess?idenCode="+idenCode).forward(request, response);
		}

	}

}
