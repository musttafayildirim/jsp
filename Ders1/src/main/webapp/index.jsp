<%@ page import="java.io.Writer" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%= new java.util.Date()%>
<h1><%= "Hello World!" %>
</h1>
<br/>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>