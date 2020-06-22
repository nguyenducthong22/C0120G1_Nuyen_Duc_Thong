<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/5/2020
  Time: 9:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% float rate = Float.parseFloat(request.getParameter("rate"));
    float usd = Float.parseFloat(request.getParameter("usd"));

    float vnd = rate * usd;
%>
<h1> Convert</h1>
<h2>Rate =<%= rate %>
</h2>
<h2>Rate =<%= usd %>
</h2>
<h2>Rate =<%= vnd %>
</h2>
</body>
</html>
