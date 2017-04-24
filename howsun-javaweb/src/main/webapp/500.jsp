<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="width: 400px;margin-left: auto;margin-right: auto;margin-top: 100px;color: red;">
	<h1>服务端内部错误！</h1>
	<img alt="" src="/images/notfound.png">
	
	<%
	Throwable exception = (Throwable) request.getAttribute("javax.servlet.error.exception");
	out.print(exception.getMessage());
	%>
</div>
</body>
</html>