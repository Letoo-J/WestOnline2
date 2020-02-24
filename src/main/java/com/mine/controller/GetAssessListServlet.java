package com.mine.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.codec.json.Jackson2JsonDecoder;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.mine.bean.Assess;
import com.mine.service.AssessService;

/**
 * Servlet implementation class GetAssessListServlet
 */
@WebServlet("/get_AssessList")
public class GetAssessListServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	//响应ajax请求，得到考核列表以显示在下拉菜单栏。
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); //设置编码格式
		List<Assess> list=new AssessService().getAllAssesses();
		
		//向submit.jsp传递考核list，并且转化为JSON。
		response.setContentType("text/html; charset=UTF-8");
		String json = JSON.toJSONString(list); 
		response.getWriter().print(json);
		
		//以下也可以：
		//JSONArray array = JSON.parseArray(JSON.toJSONString(list));
		//response.getWriter().print(array);
	}

}
