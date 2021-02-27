<%--
  Created by IntelliJ IDEA.
  User: dell2
  Date: 10.02.2021
  Time: 00:49
  To change this template use File | Settings | File Templates.
--%>

<%-- Direktifler --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.*" %>

<%-- Session--%>
<%@page session="true"%>


<%@taglib prefix="ddd" tagdir="" uri=""%>

<html>
<head>
    <title>Emir Etiketi</title>

</head>
<body>

<%out.print("Zaman: ");%>
<%= new Date()%>

<%
    String ortamNesnesi = request.getParameter("kullaniciAdi");
    System.out.println("Kullanıcı Adı: " + session.getId());
%>


<%@include file="ExpressionTag_IfadeEtiketi.jsp"%>
</body>
</html>
