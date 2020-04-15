<jsp:useBean id="id" scope="request" type=""/>
<jsp:useBean id="contactNumber" scope="request" type=""/>
<%--@elvariable id="name" type=""--%>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/15/2020
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infor</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <td>Name :</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>ID :</td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>Contact Number :</td>
        <td>${contactNumber}</td>
    </tr>
</table>
</body>
</html>