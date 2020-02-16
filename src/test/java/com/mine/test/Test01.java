package com.mine.test;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test01 {
	public static void main(String[] args) {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		SqlSessionFactoryBean bean = ac.getBean(SqlSessionFactoryBean.class);	
		System.out.println(bean);
	}
}

