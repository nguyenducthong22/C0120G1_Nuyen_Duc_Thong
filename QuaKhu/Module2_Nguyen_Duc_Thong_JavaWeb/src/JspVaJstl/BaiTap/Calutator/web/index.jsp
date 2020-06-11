<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/7/2020
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<h1>Simple calculator</h1>
<form action="/calculate" method="post">
  <div>
    <label>First operand: </label>
    <input type="text" name="f1"/><br/>
    <select name="operator">
      <option>+</option>
      <option>-</option>
      <option>*</option>
      <option>/</option>
    </select><br/>
    <label>Second operand: </label>
    <input type="text" name="f2"/><br/>
    <button>Calculate</button>
  </div>
</form>
</body>
</html>