<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/day204/js/jquery-2.1.0.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		var ids = [];
		$("#btn").click(function() {
			$.each($(".del"),function(i,n){
				var checked = $(n).prop("checked");
				if(checked){
					ids.push($(n).val());
				}
			})
			$.ajax({
					type:"post",
					contentType: "application/json;charset=utf-8",
					url:"/day204/delAll.action",
					data:JSON.stringify([{"id":1},{"id":3}]),
					success:function(msg){
						console.log(msg);
						$sp1.text(msg.data);
					}
				})
		})
	})
</script>

<title>查询商品列表</title>
</head>
<body>
	<button id="btn">点击我删除选中商品</button>
	<form
		action="${pageContext.request.contextPath }/item/queryitem.action"
		method="post">
		查询条件：
		<table width="100%" border=1>
			<tr>
				<td><input type="submit" value="查询" /></td>
			</tr>
		</table>
		商品列表：
		<table width="100%" border=1>
			<tr>
				<td>选中删除</td>
				<td>商品名称</td>
				<td>商品价格</td>
				<td>生产日期</td>
				<td>商品描述</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${itemList }" var="item">
				<tr>
					<td class="ids">
					<input type="checkbox"  class="del"  name="id"  value="${item.id }"/>
						</td>
					<td>${item.name }</td>
					<td>${item.price }</td>
					<td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
					<td>${item.detail }</td>
					<td><a href="/day204/showUpdate.action?id=${item.id }">修改</a></td>

				</tr>
			</c:forEach>

		</table>
	</form>
</body>

</html>