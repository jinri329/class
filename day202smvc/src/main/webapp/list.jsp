<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>加载数据的页面</title>
</head>
<body>
	<h3>用于加载数据的页面</h3>
	<table width="780px">
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${list}" var="s">
			<tr>
				<td>${s.id }</td>
				<td>${s.name }</td>
				<td>${s.age }</td>
				<td>${s.sex}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>