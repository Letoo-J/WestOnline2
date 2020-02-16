<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 用不聊：enctype="multipart/form-data"的问题！！！ -->
<!--【使用jstl】引入标签库taglib，prefix:前缀，一般用“c”来区分此标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- jquery文件 -->
<script type="text/javascript"  src="http://code.jquery.com/jquery-3.4.1.min.js" ></script>
<script type="text/javascript">
//【ajax】异步请求：
	$(function(){  //$( function(){} )：当整个网页加载完成后会去执行的函数。
		//alert("######设置弹窗");    //可进行检测是否调用此函数
		$.ajax({  
			//encodeURI:对整个url进行编码(若url里面有中文。。)
			//url:要进行请求的资源的地址，用绝对路径.
			url:encodeURI("${pageContext.request.contextPath }/get_AssessList"),
			type:"post",  //请求的方法
			cache:false, //去除缓存
			async:false,  //async:false同步。true异步方式
			data:{},
			dataType:"json",  //指定响应得到的数据类型：【“list”必须严格为一个json数据！】
			success:function(list){  //发起这个ajax请求后成功得到响应（响应内容为msg!）之后,去调用此函数进行处理
				//$("#msg").append(msg); //把服务端（AjaxServlet）响应的数据（“xxx”）追加到页面【<div id="msg"></div>】处。
				$.each(list, function (index, as) {
			        var idenCode = as.idenCode;
			        var name = as.name;
			        var str = "<option value=" + idenCode + ">" + idenCode +": "+ name + "</option>";
			        $("#idenCode").append(str);
			    });
			},
			error : function() {
				alert(".......页面出错了.......");
			}
		});
	});
	
</script>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style type="text/css">
		*{
			font-size: 18px;
			font-family:arial;
			text-align:center;
		}
	</style>
</head>

<body>
	<!-- 显示提示信息 -->
	${msg}<br/>  
	<hr/>
	<h1 style="background-color:Turquoise ; font-size:24px;">作  业  提  交</h1>
	<hr/>
	<a>[根据标识码]查询考核</a>   
	<div id="iddd"></div>
	<form action="${pageContext.request.contextPath }/UploadZip" method="post" enctype="multipart/form-data">
		学    号   ：    <input type="text" name="sid" /><br/>
		姓    名   ：    <input type="text" name="sname" /><br/>
		考核标识码：<select type="text" name="idenCode" id="idenCode" ></select><br/>
		上传文件：    <input type="file" name="uploadFile" /> </br>
		<input type="submit" value="提 交" />
	</form>
	</br>

</body>

</html>