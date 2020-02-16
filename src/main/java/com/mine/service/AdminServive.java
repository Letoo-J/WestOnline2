package com.mine.service;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mine.bean.Admin;
import com.mine.mapper.AdminMapper;

public class AdminServive {
	
	static AdminMapper mapper;
	static {  //得到mapper!!!!!!
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		mapper = ac.getBean(AdminMapper.class);
		//之后用mapper调用接口的方法即可。
	}
	
	//处理登入
	public Admin login(String adminName , String password) {
		//Admin ad = new Admin(adminName , password);
		//Admin admin = mapper.selectAdminByAP(ad);
		
		Admin admin = mapper.selectAdminByAP(adminName , password);
		return admin;
		
	}

}
