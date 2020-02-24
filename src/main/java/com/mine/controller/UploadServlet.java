package com.mine.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.mine.service.AssignmentService;



@WebServlet("/UploadZip")
public class UploadServlet extends HttpServlet {
	
	// 上传文件存储目录
    //private static final String UPLOAD_DIRECTORY = "file";
    /**
            上传数据及保存文件
     */
    //doPost进行学生作业信息及文件的上传：
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        // 检测是否为多媒体上传
    	request.setCharacterEncoding("utf-8"); //设置编码格式
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String idenCode = request.getParameter("idenCode");
		//String document = request.getParameter("document");

        if (!ServletFileUpload.isMultipartContent(request)) {
            // 如果不是则停止
            PrintWriter writer = response.getWriter();
            writer.println("Error: 表单必须包含 enctype=multipart/form-data");
            writer.flush();
            return;
        }
        
        //【获取文件存储路径】
        //String uploadPath = getServletContext().getRealPath("/")  + UPLOAD_DIRECTORY;
        String uploadPath= "F:/assignment_upload/";  //存在此路径！
        AssignmentService service=new AssignmentService();
         
        //作业信息以及文件上传成功
        if(service.submitAssignment(request,sid, sname, idenCode, uploadPath)!=0) {
        	PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+true+"}");
            writer.flush();
        	return;
        }else {  //失败
        	PrintWriter writer = response.getWriter();
        	response.getWriter().append("{\"isSuccese\":"+false+"}");
            writer.flush();
        	return;
        }     
    }
}
