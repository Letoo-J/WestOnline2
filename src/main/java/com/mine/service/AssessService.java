package com.mine.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mine.bean.Assess;
import com.mine.mapper.AdminMapper;
import com.mine.mapper.AssessMapper;

public class AssessService {
	
	static AssessMapper mapper;
	static {  //得到mapper!!!!!!
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		mapper = ac.getBean(AssessMapper.class);
		//之后用mapper调用接口的方法即可。
	}
	
	//1.得到所有考核（列表）--->显示在页面：
	public List<Assess> getAllAssesses(){
		return mapper.getAllAssesses();
	}
	
	//2.【向数据库的考核表插入一条信息】考核发布：
	public int assessRelease(String name, String content, String idenCode, String deadline) {
		if(mapper.isExistAssess(idenCode)!= null) {   //该考核已经存在
			return 0;
		}
		//该考核还未存在！继续执行
		
		//得到发布时间Date
		Date showDate = new Date();    
		Timestamp timeStamp1 = new Timestamp(showDate.getTime());
		
		//得到截止时间Date：【String-->Date类型】
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");    // 这里填写的是想要进行转换的时间格式
		Date deadline2 = null;
		try{
			deadline2 = format.parse(deadline);
		}catch(Exception e){
			e.printStackTrace();
		}
		Timestamp timeStamp2 = new Timestamp(deadline2.getTime());
		
		//设置“考核”属性
		Assess as = new Assess();
		as.setName(name);
		as.setContent(content);
		as.setshowDate(timeStamp1);
		as.setidenCode(idenCode);
		as.setDeadline(timeStamp2);
		
		return mapper.insertSelective(as);  //可以直接修改数据库
	}
	
	//3.删除对应标识码的考核
	public int assessDelete(String idenCode) {
		return mapper.assessDelete(idenCode);
	}
	
	//4.检验考核标识码是否已经存在
	public boolean isExistIdenCode(String idenCode) {
		if(mapper.isExistAssess(idenCode) != null) {   //考核存在
			return true;
		}else {  //考核不存在
			return false;
		}
	}
	
	//5.根据考核标识码idenCode得到此考核记录
	public Assess selectAssess(String idenCode) {
		return mapper.selectAssess(idenCode);
	}
	
	//6.修改更新考核
	public boolean updateAssess(Assess as) {
		if(mapper.updateAssess(as) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	//7.模糊查询考核
	public List<Assess> FuzzySearchAS(String data){
		return mapper.FuzzySearchAS(data);
	}
}
