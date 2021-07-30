<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.sks.dao.UserDao"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="obj" class="com.sks.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<% 

int i = UserDao.register(obj);
if(i>0){
	out.print("User registered successfully.");
}
%>

</body>
</html>