package com.mine.service;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mine.bean.Assignmentlist;
import com.mine.mapper.AssignmentlistMapper;

public class AssignmentService {
    
    
    // 上传配置
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
    
	static AssignmentlistMapper mapper;
	static {  //得到mapper!!!!!!
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		mapper = ac.getBean(AssignmentlistMapper.class);
		//之后用mapper调用接口的方法即可。
	}
	
	//得到所有提交的作业（列表）--->显示在页面：
	public List<Assignmentlist> getAllAssignment(){
		return mapper.getAllAssignment();
	}
	
	//得到对应标识码的提交作业：
	public List<Assignmentlist> getTheAssignment(String idenCode) {
		return mapper.getTheAssignment(idenCode);
	}
	
	//更新某个作业的考核状态：
	public void updateReview(Assignmentlist ag ,String review) {
		mapper.updateReview(ag, review);
	}
	
	
	//提交作业：
	public int submitAssignment(HttpServletRequest request,String sid,String sname,String idenCode,String uploadPath) {
		
		// 配置上传参数
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        // 设置临时存储目录
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
 
        ServletFileUpload upload = new ServletFileUpload(factory);
         
        // 设置最大文件上传值
        upload.setFileSizeMax(MAX_FILE_SIZE);
         
        // 设置最大请求值 (包含文件和表单数据)
        upload.setSizeMax(MAX_REQUEST_SIZE);
        
        // 中文处理
        upload.setHeaderEncoding("UTF-8"); 

        // 构造临时路径来存储上传的文件
        // 这个路径相对当前应用的目录
        
       
         
        // 如果目录不存在则创建
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
 
        try {
        	 @SuppressWarnings("unchecked")
           List<FileItem> formItems = upload.parseRequest(request);
           
 
            if (formItems != null && formItems.size() > 0) {
                // 迭代表单数据
                for (FileItem item : formItems) {
                    // 处理不在表单中的字段
                    if (!item.isFormField()) {
                        String fileName = new File(item.getName()).getName();
                        String filePath = uploadPath + File.separator + fileName;
                 
                        File storeFile = new File(filePath);
                        item.write(storeFile);
                        // 在控制台输出文件的上传路径
                        System.out.println("filePath:"+filePath);
                        System.out.println("filename:"+fileName);
                        System.out.println("uploadPath:"+uploadPath);
                        Assignmentlist ag = new Assignmentlist();
                		//得到提交时间Date
                		Date subDate = new Date();    
                		Timestamp timeStamp = new Timestamp(subDate.getTime());
                		
                		ag.setSid(sid);
                		ag.setSname(sname);
                		ag.setsubDate(timeStamp);
                		ag.setidenCode(idenCode);
                		ag.setDocument(fileName);
                		
                		return mapper.insertSelective(ag);
                    }
                }
            }
        } catch (Exception ex) {
//   
            return 0;
        }
		return 0;
     
		
	}

	
	


}
