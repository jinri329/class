<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品信息</title>
<script src="/day204/js/jquery-2.1.0.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		$("#username").blur(function () {
			var $sp1=$("#sp1");
			/*
			模拟这里是注册用户
				在这里发起请求，问这个用户名是否重复
				是否可以注册
				4种请求模式
				只有ajax不会有页面刷新感
				将data改成我们的json格式而不是键值对形式
				但是java接收不了参数了
				*/
				$.ajax({
					type:"post",
					url:"/day204/checkData.action",
					contentType: "application/json;charset=utf-8",
					data:JSON.stringify({'username':$(this).val()}),
					success:function(msg){
						console.log(msg);
						$sp1.text(msg.data);
					}
				})
		})
	})
</script>
</head>
<body> 
	<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
	<!-- <form id="itemForm" action="" method="post" enctype="multipart/form-data"> 
	
	${pageContext.request.contextPath } 
	 这是获取项目名称 就是人为修改了项目 也能获取到正确的项目名称
	-->
	<form id="itemForm" 	action="${pageContext.request.contextPath }/updateitem.action" method="post" enctype="multipart/form-data">
		<input type="hidden" name="id" value="${item.id }" /> 修改商品信息：
		<table width="100%" border=1>
			<tr>
				<td>商品名称</td>
				<td><input id="username" type="text" name="name" value="${item.name }" />
					<span id="sp1"></span>
				</td>
			</tr>
			<tr>
				<td>商品价格</td>
				<td><input type="text" name="price" value="${item.price }" /></td>
			</tr>
			<%-- 			 --%>
			<tr>
				<td>商品生产日期</td>
				<td><input type="text" name="createtime"
					value="<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>" /></td>
			</tr>

			<tr>
				<td>商品图片</td>
				<td>
					<c:if test="${item.pic !=null}">
						<img src="${item.pic}" width=100 height=100/>
						<br/>
					</c:if>
					<input type="file"  name="picFile"/> 
				</td>
			</tr>

			<tr>
				<td>商品简介</td>
				<td><textarea rows="3" cols="30" name="detail">${item.detail }</textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
				</td>
			</tr>
		</table>

	</form>
</body>

</html>