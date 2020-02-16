package com.mine.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mine.bean.Admin;
import com.mine.service.AdminServive;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/login_do")  //配置访问路径
//【一般一个请求对应一个servlet】
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	//处理登入请求：用post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  //防止乱码!
		
		String adminName = request.getParameter("adminName");
		String password = request.getParameter("password");
		
		//进行登入验证：
		AdminServive service = new AdminServive();
		Admin ad = service.login(adminName, password);
		
		if(ad!=null) { //登入成功：进入“功能选项”页面-->点击“管理考核”-->考核详情页面【默认：“考核管理”】
			//将登入成功的Admin对象放到session中去
			request.getSession().setAttribute("admin", ad);
			
			//【重定向】跳转到“funtion.jsp页面”,(无传递数据时可用)
			response.sendRedirect(request.getContextPath()+"/admin_assess/function.jsp");
			/*【请求转发】跳转到“funtion.jsp页面”
			request.getRequestDispatcher("/admin_assess/function.jsp").forward(request, response);*/
		
		}else {  //登入失败：跳转到登入页面重新登入
			request.setAttribute("msg", "<font color='red'>登入失败，请重新登入！</font>");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
