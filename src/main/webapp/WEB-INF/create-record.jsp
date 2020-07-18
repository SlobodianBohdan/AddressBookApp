<%--
  Created by IntelliJ IDEA.
  User: slobo
  Date: 5/23/2020
  Time: 11:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new record!</title>
</head>
<body>
<%@include file="header.html"%>
<br><br>
<form action="/records/create" method="post">
    <table>
        <tr>
            <td>
                <label for = "firstName">First Name:</label>
            </td>
            <td>
                <input type="text" id="firstName" name="firstName">
            </td>
        </tr>
        <tr>
            <td>
                <label for = "lastName">Last Name:</label>
            </td>
            <td>
                <input type="text" id="lastName" name="lastName">
            </td>
        </tr>
        <tr>
            <td>
                <label for = "address">Address:</label>
            </td>
            <td>
                <textarea id="address" name="address"></textarea>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Create">
            </td>
            <td>
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
