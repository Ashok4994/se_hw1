<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style> body {
    background-color: lightblue;
}</style>
</head>
<body>
<% String s=(String)request.getAttribute("error");
     if(s!=null) {
     out.println(s); }%>
<form action="Login" method="post">
<table>

<tr><td>User ID:</td> <td> <input type="text" name="uid"></td></tr>
<tr><td>Password:</td><td><input type="password" name="pass" ></td></tr>
<tr><td><input type="submit" value="Login" ></td></tr>
</table>

</form>
</body>
</html>