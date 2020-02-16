<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--【使用jstl】引入标签库taglib，prefix:前缀，一般用“c”来区分此标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- jquery文件 -->
<!-- 可以： "http://code.jquery.com/jquery-3.4.1.min.js" -->
<%-- 不行： ${pageContext.request.contextPath }/META-INF/resources/webjars/jquery/3.4.1/dist/jquery.min.js --%>
<script type="text/javascript"  src="http://code.jquery.com/jquery-3.4.1.min.js" ></script>

<script type="text/javascript">
//【ajax】异步请求：
	$(function(){  //$( function(){} )：当整个网页加载完成后会去执行的函数。
		//alert("xxx设置弹窗");    //可进行检测是否调用此函数
		//input[name='idenCode']：组件选择器，选择idenCode组件。并且执行verifyUsername函数
		$("input[name='idenCode']").blur(verifyIdenCode);
	});
	
	function verifyIdenCode(){
		//$("input[name='idenCode']").val()
		$.ajax({  
			//encodeURI:对整个url进行编码(若url里面有中文。。)
			//url:要进行请求的资源的地址，用绝对路径.（此处见AjaxServlet.java）
			url:encodeURI("${pageContext.request.contextPath }/verifyIdenCode"),
			type:"post",  //请求的方法
			data:{        //数据：也是一个js对象（里面有键值对）
				idenCode:$("input[name='idenCode']").val() //取得"idenCode"组件的值。
			},
			cache:false, //去除缓存
			dataType:"json",  //指定响应得到的数据类型：【msg必须严格为一个json数据！】
			success:function(msg){  //发起这个ajax请求后成功得到响应（响应内容为msg!）之后,去调用此函数进行处理
				//$("#msg").append(msg); //把服务端（AjaxServlet）响应的数据（“xxx”）放到页面【<div id="msg"></div>】处。
				if(msg.isExist){
					$("#judge").html("<font color='red'>考核标识码已存在，请重新设置！</font>");
				}else{
					$("#judge").html("<font color='green'> √ </font>");
				}
			}
		});
	}
</script>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>考核发布</title>
	<style type="text/css">
		*{
			font-size: 18px;
			font-family:arial;
			text-align:center;
		}
	</style>
</head>

<body>
	<table border="1" cellpadding="10">
		<tr>
			<th>侧栏:管理员操作</th>
		</tr>
		<tr>
			<td><a href="<%=request.getContextPath() %>/admin/assess_managment">【默认】考核管理</a></td>
		</tr>
		<tr>
			<td><a href="<%=request.getContextPath() %>/admin_assess/assess_release.jsp">考核发布</a></td>
		</tr>
	</table>
	<br/>
	
	<!-- 显示提示信息 -->
	${msg}<br/>
	<hr/>
	<h1 style="background-color:Salmon ; font-size:24px;">考  核  发  布</h1>
	<hr/>
	
	<form action="${pageContext.request.contextPath }/release_do" method="post">
		考核名称：<input type="text" name="name" /><br/> 
		考核内容(选填)：<input type="text" name="content" /><br/>
		考核标识码：<input type="text" name="idenCode" /> <div id="judge"></div> <br/>
		截止时间：<input type="text" name="deadline" /><br/>
		<input type="submit" value="发布" />
	</form>
	</br>
	<a href="<%=request.getContextPath() %>/admin/assess_managment">返回管理考核首页</a>
	
</body>


</html>