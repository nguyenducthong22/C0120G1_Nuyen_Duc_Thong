<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/11/2020
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
    input,select{
        width: 200px;
        height: 28px;
        margin-top: 10px;
    }
</style>
<h2> Calculator </h2>
<form action="calculator" method="post">
    <label>
        <input type="text" name="opera1" value="">
        <select class="btn btn-primary" name="opera">
            <option style="color: red">Addition(+)</option>
            <option  style="color: yellow">Subtraction(-)</option>
            <option style="color: blue">Multiplication(*)</option>
            <option style="color: rosybrown">Division(/)</option>
        </select>
        <input type="text" name="opera2" value="">
    </label>
    <input type="submit" value="Calculator">
    <h3 style="color: black">${result}</h3>
</form>
<h3 style="color: red">${massage}</h3>


</body>
</html>
