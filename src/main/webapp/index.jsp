<%@page import="com.mine.bean.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--【使用jstl】引入标签库taglib，prefix:前缀，一般用“c”来区分此标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 最新的jquery本地文件 -->
<script type="text/javascript"  src="webjars/jquery/3.4.1/dist/jquery.min.js"  charset="UTF-8"/></script>

<!DOCTYPE html>
<html
<head>
<meta charset="UTF-8">
<title>作业提交系统</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty admin}">
			管理员请登入进行考核管理！<br/> <!-- 换行 -->
			<hr/> <!-- 下划线 --> 
			<!-- 客户端路径都使用：【绝对路径】！！！！！！！！！！！ -->
			<!-- 【相当于"${pageContext.request.contextPath }/login.jsp" 】-->
			<a href="${pageContext.request.contextPath }/login.jsp">登入</a>
			<br/>
		</c:when>
		<c:otherwise>
			【当前登入用户】${admin.adminName}<br/>
			<a href="${pageContext.request.contextPath }/admin_assess/function.jsp">管理员功能选择</a> 
			<br/>
		</c:otherwise>
	</c:choose>

</body>
</html>