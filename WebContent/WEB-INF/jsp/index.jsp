<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面显示</title>
</head>
<body>
	
	<center>
		<table width="80%" bgcolor="#FF00FF" border="0" cellspacing="1"  > 
			<tr bgcolor="#FFFFFF">
				<th>姓名</th>
				<th>姓别</th>
				<th>年龄</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${Emplist}" var="s" >
				<tr bgcolor="#FFFFFF" >
					<td>${s.ename }</td>
					<td>${s.sex }</td>
					<td>${s.age }</td>
					<td>
						<a href="show?eid=${s.eid }" >修改</a>
						<a href="delete?eid=${s.eid }" >删除</a>
					</td>
				</tr>
			</c:forEach>
			
			
		</table>
		
		
	</center>
	
</body>
</html>