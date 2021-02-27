<%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 10.02.2021
  Time: 01:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sunucu Sürümleri</title>
</head>
<body>
Sunucu Sürümü : <%=application.getServerInfo()%>
<br>
Server sürümü <%=application.getMinorVersion()%>
<br>
Server sürümü <%=application.getMajorVersion()%>


</body>
</html>
