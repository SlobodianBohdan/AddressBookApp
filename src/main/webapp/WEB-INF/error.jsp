<%@ page import="com.softserve.itacademy.Record" %>
<%--
  Created by IntelliJ IDEA.
  User: slobo
  Date: 5/24/2020
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
    <body>
    <%@include file="header.html" %>
    <br><br>
    <%
        Record record = (Record) request.getAttribute("record");
    %>
    <p>Person with Name: <%=record.getFirstName()%> <%=record.getLastName()%> not found in Address Book!</p>

    </body>
</html>
