<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Declaration Tag - Bildiri Etiketi</title>
</head>
<body>
<h1>Bildiri Etiketi</h1>

<%!
    public int tarih = 2021;
    public String adim = "Mustafa";
    public String soyadim = "YILDIRIM";
%>

<%
    out.println(tarih);
%>
<br>
<%
    out.println(adim);
    out.print(soyadim);
%>

</body>
</html>