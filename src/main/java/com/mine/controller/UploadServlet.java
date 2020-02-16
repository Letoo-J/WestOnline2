package com.mine.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

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
    private static final String UPLOAD_DIRECTORY = "file";
 
    // 上传配置
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
 
    /**
     * 上传数据及保存文件
     */
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        // 检测是否为多媒体上传
    	request.setCharacterEncoding("utf-8"); //设置编码格式
		String sid = request.getParameter("sid");
		String sname = request.getParameter("sname");
		String idenCode = request.getParameter("idenCode");
//		String document = request.getParameter("document");

    	

    	
    	
        if (!ServletFileUpload.isMultipartContent(request)) {
            // 如果不是则停止
            PrintWriter writer = response.getWriter();
            writer.println("Error: 表单必须包含 enctype=multipart/form-data");
            writer.flush();
            return;
        }
        //获取文件存储路径
        String uploadPath = getServletContext().getRealPath("/")  + UPLOAD_DIRECTORY;
        AssignmentService ser=new AssignmentService();
        
        if(ser.submitAssignment(request,sid, sname, idenCode, uploadPath)==1) {
        	PrintWriter writer = response.getWriter();
        	writer.println("1");
            writer.flush();
        	return;
        }else {
        	PrintWriter writer = response.getWriter();
        	writer.println("0");
            writer.flush();
        	return;
        	}     
    }
}
