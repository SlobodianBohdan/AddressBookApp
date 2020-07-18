<%@ page import="com.softserve.itacademy.Record" %><%--
  Created by IntelliJ IDEA.
  User: slobo
  Date: 5/24/2020
  Time: 8:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show info Record!</title>
</head>
<body>
<%@include file="header.html"%>
<br><br>
    <%
        Record record = (Record) request.getAttribute("record");
    %>
    <p>Id: <%=record.getId()%></p>
    <p>First name: <%=record.getFirstName()%></p>
    <p>Last name: <%=record.getLastName()%></p>
    <p>Address: <%=record.getAddress()%></p>

</body>
</html>
