<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
h1{
    color: green;
}
</style>
</head>
<body>
<% String s=(String)request.getAttribute("fn");
  String s1=(String)request.getAttribute("lnam");
 %>
 
Hi.You are successfully registered with first name<h1><%=s%></h1> and last name <h1><%=s1%></h1>

</body>
</html>