<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.mine.bean.Assess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--【使用jstl】引入标签库taglib，prefix:前缀，一般用“c”来区分此标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- jquery文件 -->
<script type="text/javascript"  src="http://code.jquery.com/jquery-3.4.1.min.js" ></script>

<!DOCTYPE html>

<!-- 显示考核列表，并进行删除、查看作业列表操作。
	 点击具体考核名称，可以进入此考核的详情页，进行考核修改 -->
<html>
<head>
	<meta charset="UTF-8">
	<title>考核管理首页</title>
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
			<td><a href="${pageContext.request.contextPath }/admin/assess_managment">【默认】考核管理</a></td>
		</tr>
		<tr>
			<td><a href="${pageContext.request.contextPath }/admin_assess/assess_release.jsp">考核发布</a></td>
		</tr>
	</table>
	<br/> 
	
	${delete_msg}</br>
	<hr/>
	<h1 style="background-color:DarkTurquoise ;font-size:24px;">考  核  列  表</h1>
	<hr/>
	<a>[根据标识码]查询考核</a>  
	<table border="1" cellpadding="10">
		<tr>
			<th>考核标识码</th>
        	<th>考核名称</th>
        	<th>上传时间</th>
        	<th>截止时间</th>
        	<th>操作</th>
		</tr>
		<c:forEach items="${assess_list}" var="as">
			<tr>
					<td>${as.idenCode}</td>
					<td>
						<a href="${pageContext.request.contextPath }/admin/get_assess?idenCode=${as.idenCode}">${as.name}</a>
					</td>
					<td>${as.DateToString(as.getshowDate())}</td>
					<td>${as.DateToString(as.getDeadline())}</td>
					<td>
						<a href="${pageContext.request.contextPath }/admin/assignmentlist?idenCode=${as.idenCode}">作业查看</a>
						<a href="${pageContext.request.contextPath }/admin/assess_delete?idenCode=${as.idenCode}">删除</a>
					</td>
			</tr>
		</c:forEach>
	</table>
	</br>

</body>
</html>