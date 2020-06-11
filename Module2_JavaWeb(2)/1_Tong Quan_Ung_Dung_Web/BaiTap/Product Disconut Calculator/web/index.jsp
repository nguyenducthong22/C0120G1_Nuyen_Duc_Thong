<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/3/2020
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h2> Product Discounts  Calculator </h2>
  <form action ="/calculator" method ="post" >
    Name product   :<input type ="text" name="name" /> </br>
    List Price     :<input type ="text" name="price" /> </br>
    Disconut Price :<input type ="text" name="discount" /> </br>
  <input type = "submit" id = "submit" value = "Disconut Calculator"/>
  </form>
  </body>
</html>
