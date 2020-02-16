<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--【使用jstl】引入标签库taglib，prefix:前缀，一般用“c”来区分此标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 最新的jquery本地文件 -->
<!-- jquery文件 -->
<script type="text/javascript"  src="http://code.jquery.com/jquery-3.4.1.min.js" ></script>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	${msg}<br/>
<%-- 	<% --%>
<!-- 		//显示提示信息！ -->
<!-- 		if(request.getAttribute("msg")!=null){ -->
<!-- 			out.println(request.getAttribute("msg")+"<br/>"); -->
<!-- 		} -->
<!-- 	%> -->

	【登录】
	<hr/>
	<!-- action后面表示提交要的地址，把以下数据提交到此地址。method表示请求方式 -->
	<%-- <%=request.getContextPath()%>相当于${pageContext.request.contextPath} --%>
	<form action="<%=request.getContextPath()%>/login_do" method="post"> 
		管理员名：<input type="text" name="adminName" /><br/> <!-- type：类型，name：参数名  -->
		密码：        <input type="password" name="password" /><br/>
		<input type="submit" value="登录" />  <!-- 提交按钮 -->
	</form>
	
</body>
</html>