<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--【使用jstl】引入标签库taglib，prefix:前缀，一般用“c”来区分此标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- jquery文件 -->
<script type="text/javascript"  src="http://code.jquery.com/jquery-3.4.1.min.js" ></script>
<script type="text/javascript">
//【ajax】请求：
// 	$(function(){  //$( function(){} )：当整个网页加载完成后会去执行的函数。
// 		//$("#btn").on('click',update());
// 		$("#btn").blur(update);  //会弹窗好几次，为啥？？哭了
// 		//$("#btn").click(update());
// 	});
	function update(){
		$.ajax({  
			//encodeURI:对整个url进行编码(若url里面有中文。。)
			//url:要进行请求的资源的地址，用绝对路径.
			url:encodeURI("${pageContext.request.contextPath }/admin/assess_update"),
			type:"post",  //请求的方法
			async:false,  //async:false同步。true异步方式
			data:{        //数据：也是一个js对象（里面有键值对）
				idenCode : "${assess.idenCode }",  //需要加“”
				name : document.getElementById("name").value,
				content : document.getElementById("content").value,
				deadline : document.getElementById("deadline").value
			},
			cache:false, //去除缓存
			dataType:"json",  //指定响应得到的数据类型：【msg必须严格为一个json数据！】
			success:function(msg){  //发起这个ajax请求后成功得到响应（响应内容为msg!）之后,去调用此函数进行处理
				if(msg.isSuccess){
					alert("修改成功！");
					$("#judge").html("<font color='green'>修改成功！</font>");
				}else{
					$("#judge").html("<font color='red'>修改失败！</font>");
				}
			},
			error:function(){
				alert("ajax请求成功但是返回值有问题！！！啊");
			}
		});
	}
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
	<div id="judge"></div>
	<hr/>
	<h1 style="background-color:Plum ;font-size:24px;">考  核  详  情</h1>
	<hr/>
	
	<table border="1" cellpadding="10" id="assessTable">
		<tr>
			<th>考核标识码</th>
        	<td>${assess.idenCode }</td>
		</tr>
		<tr>
        	<th>上传时间</th>
        	<td>${assess.DateToString(assess.getshowDate())}</td>
		</tr>
		<tr>
        	<th>考核名称</th>
        	<td>
        		<textarea id="name" cols="20" rows="1">${assess.name}</textarea>
        	</td>
		</tr>
		<tr>
        	<th>考核内容/说明</th>
        	<td>
				<textarea id="content" cols="20" rows="1">${assess.content }</textarea>
			</td>
		</tr>
		<tr>
        	<th>截止时间</th>
        	<td>
        		<textarea id="deadline" cols="20" rows="1">${assess.DateToString(assess.getDeadline())}</textarea>
        	</td>
		</tr>
	</table>
	<div>
		<button id="btn" type="button" onclick="update()">修 改</button>
	</div>
    
	</br></br>

	<a href="<%=request.getContextPath() %>/admin/assess_managment">返回管理考核首页</a>
</body>

</html>