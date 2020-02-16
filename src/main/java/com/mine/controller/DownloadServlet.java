package com.mine.controller;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import sun.jvm.hotspot.tools.SysPropsDumper;

import java.net.URLEncoder;



/**
 * Servlet implementation class DownloadServlet
 */
@WebServlet("/downloadZip")
public class DownloadServlet extends HttpServlet {
	/**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4541729035831587727L;
    
    //获得绝对路径：/D:/eclipse/workspace/项目名称/WebContent/WEB-INF/classes/
    private final static String HOME_PATH = DownloadServlet.class.getResource("/").getPath();
    //获得绝对路径：/D:/eclipse/workspace/项目名称/WebContent/下的其他目录
    private final static String DOWNLOAD_TEMP_FILE = HOME_PATH.subSequence(0, HOME_PATH.indexOf("WEB-INF")) + "file/";
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
		//doPost(request, response);
	}

	//用doPost进行zip文件下载
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String filename = req.getParameter("filename"); // ${ag.document}
        try{
            resp.reset();// 清空输出流
            
            String resultFileName = filename + System.currentTimeMillis() + ".zip";
            resultFileName = URLEncoder.encode(resultFileName,"UTF-8");  
            resp.setCharacterEncoding("UTF-8");  
            resp.setHeader("Content-disposition", "attachment; filename=" + resultFileName);// 设定输出文件头
            resp.setContentType("application/zip");  // 定义输出类型zip
            
            //输入流：本地文件路径
            DataInputStream in = new DataInputStream(
                    new FileInputStream(new File(DOWNLOAD_TEMP_FILE + filename)));  
            //输出流
            OutputStream out = resp.getOutputStream();
            //输出文件
            int bytes = 0;
            byte[] bufferOut = new byte[1024];  
            while ((bytes = in.read(bufferOut)) != -1) {  
                out.write(bufferOut, 0, bytes);  
            }
            out.close();
            in.close();
        } catch(Exception e){
            e.printStackTrace();
            resp.reset();
            try {
                OutputStreamWriter writer = new OutputStreamWriter(resp.getOutputStream(), "UTF-8");  
                String data = DOWNLOAD_TEMP_FILE + filename;
                //System.out.println("down;oad:"+data);
                writer.write(data); 
                writer.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

	}
	
	
}