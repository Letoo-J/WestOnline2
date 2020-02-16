package com.mine.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String filename = "愤怒的小鸟.jpg";
	    //设置文件MIME类型  
		response.setContentType(getServletContext().getMimeType(filename));  
		//设置Content-Disposition  
		response.setHeader("Content-Disposition", "attachment;filename="+new String( filename.getBytes("gb2312"), "ISO8859-1" ));


	    //获取要下载的文件绝对路径，我的文件都放到WebRoot/download目录下
		ServletContext context=this.getServletContext();
		String fullFileName=context.getRealPath("2016050457073129.jpg");

		//输入流为项目文件，输出流指向浏览器
		InputStream is=new FileInputStream(fullFileName);
		ServletOutputStream os =response.getOutputStream();

		/*
		 * 设置缓冲区
		* is.read(b)当文件读完时返回-1
	    */
		int len=-1;
		byte[] b=new byte[1024];
		while((len=is.read(b))!=-1){
			os.write(b,0,len);
		}
		//关闭流
		is.close();
		os.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
