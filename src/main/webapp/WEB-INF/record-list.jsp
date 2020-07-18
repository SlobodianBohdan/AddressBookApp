<%@ page import="com.softserve.itacademy.Record" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: slobo
  Date: 5/23/2020
  Time: 10:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all records!</title>
</head>
<body>
<%@include file="header.html"%>
<p>Sort by:
    <a href="/records/list?sort=ASC">ascending</a> |
    <a href="/records/list?sort=DESC">descending</a>
</p>
<br><br>
<table border="1">
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
        <th colspan="3">Operations</th>
    </tr>
    
    <%
        for (Record record: (List<Record>)request.getAttribute("records")) {

    %>
    <tr>
        <td><%=record.getId()%></td>
        <td><%=record.getFirstName()%></td>
        <td><%=record.getLastName()%></td>
        <td><%=record.getAddress()%></td>
        <td>
            <a href="/records/read?firstName=<%=record.getFirstName()%>&lastName=<%=record.getLastName()%>">Read</a>
        </td>
        <td>
            <a href="/records/update?firstName=<%=record.getFirstName()%>&lastName=<%=record.getLastName()%>">Update</a>
        </td>
        <td>
            <a href="/records/delete?firstName=<%=record.getFirstName()%>&lastName=<%=record.getLastName()%>">Delete</a>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
