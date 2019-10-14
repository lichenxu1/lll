<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/index_work.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery-1.8.2.min.js">
</script>
</head>
<body>

<table>
	<tr>
	<td>编号</td>
	<td>商品名称</td>
	<td>商品价格</td>
	<td>已售百分比</td>
	</tr>
	<c:forEach items="${list}" var="e">
	<tr>
	<td>${e.id}</td>
	<td>${e.name}</td>
	<td>${e.price}</td>
	<td>${e.sal}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>