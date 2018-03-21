<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<form action="${pageContext.request.contextPath }/updateEmp" method="get">
			
			<input type="hidden" value="${Emp.eid }" name="eid" id="eid" /><br><br>
		姓名：<input type="text" value="${Emp.ename }" name="ename"  id="ename" ><br><br>
		性别：<input type="text" value="${Emp.sex }" name="sex"  id="sex" ><br><br>
		年龄：<input type="text" value="${Emp.age }" name="age"  id="age" ><br><br>
		<input type="submit" value="确认修改" >
	</form>
	</center>
</body>
</html>