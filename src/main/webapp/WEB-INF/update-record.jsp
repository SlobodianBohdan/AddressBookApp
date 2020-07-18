<%@ page import="com.softserve.itacademy.Record" %><%--
  Created by IntelliJ IDEA.
  User: slobo
  Date: 5/24/2020
  Time: 7:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update existing Record</title>
</head>
<body>
<%@include file="header.html"%>
<br><br>
<form action="/records/update" method="post">
    <%
        Record record = (Record)request.getAttribute("record");
    %>
    <table>
        <tr>
            <td>
                <label for="id">Id: </label>
            </td>
            <td>
                <input type="text" id="id" name="id" value="<%=record.getId()%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for = "firstName">First name: </label>
            </td>
            <td>
                <input type="text" id="firstName" name="firstName" value="<%=record.getFirstName()%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for = "lastName">Last name: </label>
            </td>
            <td>
                <input type="text" id="lastName" name="lastName" value="<%=record.getLastName()%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for = "address">Address: </label>
            </td>
            <td>
                <textarea type="text" id="address" name="address" value="<%=record.getAddress()%>"></textarea>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update">
            </td>
            <td>
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
