package com.mine.test;

//import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.UUID;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mine.bean.Admin;
import com.mine.bean.Assess;
import com.mine.bean.Assignmentlist;
import com.mine.mapper.AdminMapper;
import com.mine.mapper.AssessMapper;
import com.mine.mapper.AssignmentlistMapper;

public class MapperTest {

	@Test
	public void Test1() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态代理开发】参数：spring配置文件中mapper的bean的id值
		AdminMapper mapper = (AdminMapper) ac.getBean("adminMapper"); 
		//AdminMapper mapper = ac.getBean(AdminMapper.class);
		
		Admin ad = mapper.selectAdminByID(1);
		System.out.println(ad);
	}
	
	@Test
	public void Test2() {  
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AdminMapper mapper = ac.getBean(AdminMapper.class);
		
		Admin ad = mapper.selectAdminByID(1);
		System.out.println(ad);
	}
	
//	@Test
//	public void Test3() throws Exception {
//		//从官网【运行MyBatis Generator--使用java】复制
//		List<String> warnings = new ArrayList<String>();
//		boolean overwrite = true;
//		File configFile = new File("src/main/resources/generatorConfig.xml");
//		ConfigurationParser cp = new ConfigurationParser(warnings);
//		Configuration config = cp.parseConfiguration(configFile);
//		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//		myBatisGenerator.generate(null);
//	}
	
	@Test
	public void Test4() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AdminMapper mapper = ac.getBean(AdminMapper.class);
		
		String name="Adam000";  //目前大小学不分。
		List<Admin> list = mapper.isExistAdmin(name);
		if(list.isEmpty()) {
			System.out.println("管理员不存在!");
		}
		else {
			for (Admin a : list) {
				System.out.println(a);
			}
		}
	}
	
	@Test
	public void Test5() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AdminMapper mapper = ac.getBean(AdminMapper.class);
		
		Admin ad = new Admin("aaa" , "123");
		
		Admin admin = mapper.selectAdminByAP2(ad);
		if(admin == null) {
			System.out.println("kong!");
		}
		
	}
	
	@Test
	public void Test6() {  //【考核发布】 
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AssessMapper mapper = ac.getBean(AssessMapper.class);
		
		//设置截止时间：
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");    // 这里填写的是想要进行转换的时间格式
		String str_deadline = "2020-03-15 10:11:12";         // 时间字符串
		Date deadline = null;
		try{
			deadline = format.parse(str_deadline);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(deadline);
		
		//得到发布时间
		Date showDate = new Date();    
		Timestamp timeStamp = new Timestamp(showDate.getTime());
		
		//设置“考核”属性
		Assess as = new Assess();
		as.setName("概率论网课");
		as.setContent("喵喵喵？？？？？？");
		as.setshowDate(showDate);
		as.setidenCode("ddd");
		as.setDeadline(deadline);
		
		 //可以直接修改数据库
		System.out.println(mapper.insertSelective(as));
	}
	
//	@Test
//	public void Test7() {
//		//字符串转化为Date类型:
//		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");    // 这里填写的是想要进行转换的时间格式
//		String str1 = "2016-12-11 17:17:10";         // 时间字符串
//
//		Date date1 = null;
//		try{
//			date1 = format1.parse(str1);
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		System.out.println(date1);
//		
//		
//		//Date类型转化为字符串
//		DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");    // 这里填写的是想要进行转换的时间格式
//		Date date2 = new Date();      // 获取当前时间
//		String str2 = format2.format(date2);
//		System.out.println(str2);
//	}
	
	@Test
	public void Test8() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AssignmentlistMapper mapper = ac.getBean(AssignmentlistMapper.class);
		
		
		//得到提交时间
		Date subDate = new Date();    
		Timestamp timeStamp = new Timestamp(subDate.getTime());
		
		//设置“作业”属性
		Assignmentlist ag = new Assignmentlist();
		ag.setSid("031801320");
		ag.setSname("OOR!");
		ag.setsubDate(timeStamp);
		ag.setidenCode("bbb");
		ag.setDocument("333");
		
		mapper.insertSelective(ag); //可以直接修改数据库
	}
	
	
	@Test
	public void Test9() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AssessMapper mapper = ac.getBean(AssessMapper.class);
		
		System.out.println(mapper.isExistAssess("ggg"));
	}
	
	@Test
	public void Test10() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AssignmentlistMapper mapper = ac.getBean(AssignmentlistMapper.class);
		
		List<Assignmentlist> list = mapper.getTheAssignment("ccc");
		for (Assignmentlist ag : list) {
			System.out.println(ag);
		}
	}
	
	@Test
	public void Test11() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AssignmentlistMapper mapper = ac.getBean(AssignmentlistMapper.class);
		
		Assignmentlist ag = new Assignmentlist();
		
		//得到提交时间Date
		Date subDate = new Date();    
		Timestamp timeStamp = new Timestamp(subDate.getTime());
		
		ag.setSid("221801431");
		ag.setSname("cxx");
		ag.setsubDate(timeStamp);
		ag.setidenCode("ccc");
		ag.setDocument("武松而后你们");
		
		mapper.myInsertTest(ag);
		//System.out.println(mapper.myInsertTest(ag));
		System.out.println(ag.getSubId());  //得到主键
	}
	
	
//	@Test
//    public void test12(){
//        //准备工作
//        List<User> list = new ArrayList<User>();
//        User user1 = new User();
//        user1.setName("zhangsan");
//        user1.setAge(14);
//        User user2 = new User();
//        user2.setName("lisi");
//        user2.setAge(24);
//        list.add(user1);
//        list.add(user2);
//
//        //转换为Json字符串
//        String string = JSON.toJSONString(list);
//        System.out.println("String为："+string+",其类型为："+string.getClass());
//        //转换为JSONArray
//        JSONArray array = JSON.parseArray(JSON.toJSONString(list));
//        System.out.println("JSONArray为："+array+",其类型为："+array.getClass());
//
//    }
	
	@Test
	public void Test13() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AssessMapper mapper = ac.getBean(AssessMapper.class);
		
		//得到提交时间Date
		Date date1 = new Date();
		Date date2 = new Date();
		Timestamp timeStamp1 = new Timestamp(date1.getTime());
		Timestamp timeStamp2 = new Timestamp(date2.getTime());
		Assess as = new Assess();
		as.setidenCode("rrr");
		as.setshowDate(timeStamp1);
		as.setName("新概念英语da!");
		as.setContent("wryyyyyyyyyy~~~~~");
		as.setDeadline(timeStamp2);
		
		System.out.println("update返回 :"+mapper.updateAssess(as));
	}

	
	@Test
	public void Test14() {
		//读取spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//【动态扫描开发】参数：spring配置文件中bean的value所对应包，其下的接口类
		AssignmentlistMapper mapper = ac.getBean(AssignmentlistMapper.class);
		
		List<Integer> list = new ArrayList<Integer>() ;
		Collections.addAll(list, 31, 33, 34);
		
		
		System.out.println(mapper.deleteByPrimaryKeyList(list));
	}
	
	
	@Test
	public void Test15() {
		//生成随机考核标识码：
		//法一：
		for(int i=0;i<20;i++) {
			String ss = new Base64().encode((UUID.randomUUID().toString()).getBytes()).toString();
			ss = ss.replace("[B@", "");
			System.out.println(ss);
		}
		
		//法二：根据时间戳！不精确 ：此处生成一样的号码！
		for(int i=0;i<20;i++) {
			long iden = new Date().getTime();
			String idenCode = Integer.toHexString((int)iden);
			System.out.println(idenCode);
		}
	}
	
}
