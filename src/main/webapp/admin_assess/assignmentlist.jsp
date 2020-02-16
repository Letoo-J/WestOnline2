<%@page import="com.mine.bean.Assignmentlist"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--【使用jstl】引入标签库taglib，prefix:前缀，一般用“c”来区分此标签库 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- jquery文件 -->
<script type="text/javascript"  src="http://code.jquery.com/jquery-3.4.1.min.js" ></script>
<script type="text/javascript">
function download(aa){
	alert(aa);
    downloadTemplate('${pageContext.request.contextPath }/downloadZip', 'filename', aa);
}

/**
 * 用于下载导入模板时的隐藏form表单的提交，采用post方式提交
 * @param action action映射地址
 * @param type parameter的名称
 * @param value parameter的值，这里为file的filename
 */
function downloadTemplate(action, type, value){
    var form = document.createElement('form');
    document.body.appendChild(form);
    form.style.display = "none";
    form.action = action;
    form.id = 'zip';
    form.method = 'post';
    
    var newElement = document.createElement("input");  
    newElement.setAttribute("type","hidden");  
    newElement.name = type;
    newElement.value = value;
    form.appendChild(newElement); 
    
    form.submit();
}
</script>

<!DOCTYPE html>
<!-- 显示此考核的作业列表 -->
<html>
<head>
<meta charset="UTF-8">
<title>作业提交列表</title>
<style type="text/css">
	*{
		font-size: 18px;
		font-family: arial;
		text-align: center;
	 }
</style>
</head>

<body>
	
	<hr />
	<h1 style="background-color: Gold; font-size: 24px;">作 业 提 交 列 表</h1>
	<hr />
	<a>[根据学号]查询提交作业</a>
	<table border="1" cellpadding="10">
		<tr>
			<th>学号</th>
			<th>学生姓名</th>
			<th>上传时间</th>
			<th>评审状态</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${assignment_list }" var="ag">
			<tr>
				<td>${ag.sid}</td>
				<td>${ag.sname}</td>
				<td>${ag.DateToString(ag.getsubDate())}</td>
				<td>${ag.review}
				<%--"<%=request.getContextPath()%>/review_do?sid=<%ag.getSid()%>&subDate=<%ag.DateToString(ag.getsubDate())%>&idenCode=<%ag.getidenCode()%>" --%>
					<form action="${pageContext.request.contextPath }/review_do?sid=${ag.sid}&subDate=${ag.DateToString(ag.getsubDate())}&idenCode=${ag.idenCode}" method="post">
						<!-- 向/review_do传递属性，在servlet处理 【行不通】-->
						<%-- <%request.setAttribute("assignmentlist",ag);%> --%>
						<select name="review">
							<option value="审核中" selected>审核中</option>
							<option value="通过">通过</option>
							<option value="未通过">未通过</option>
						</select> <input type="submit" value="Submit">
					</form>
				</td>
				<td>
					<button id="download" style="color:blue" onclick="download('${ag.document}');">下载${ag.document}</botton>
<%-- 					<a href="${ag.document}" doweload="${ag.document}.zip">下载</a> --%>
				</td>
			</tr>
		</c:forEach>
	</table>
	</br>
	<a href="<%=request.getContextPath() %>/admin/assess_managment">返回管理考核首页</a>
	
</body>


</html>