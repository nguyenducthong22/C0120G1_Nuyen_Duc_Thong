<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/5/2020
  Time: 2:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    float firstOpera = 1234567891;

    try {
        firstOpera = Float.parseFloat(request.getParameter("firstOpera"));
    } catch (Exception e) {
        out.print(" invalid ");
    }

    float secondOpera = 1234567892;
    try {
        secondOpera = Float.parseFloat(request.getParameter("secondOpera"));
    } catch (Exception e) {
        out.print(" invalid ");
    }

    String opera = request.getParameter("opera");
    float result = 0;

    if (opera.equals("+")) {
        result = firstOpera + secondOpera;
    } else if (opera.equals("-")) {
        result = firstOpera - secondOpera;
    } else if (opera.equals("*")) {
        result = firstOpera * secondOpera;
    } else if (opera.equals("/") && secondOpera != 0) {
        result = firstOpera / secondOpera;
    } else if (opera.equals("/")) {
        out.print(" invalid ");
    }
%>
<h2>
    <%
        if (opera.equals("/") && secondOpera == 0) {
        } else if (firstOpera == 1234567891 || secondOpera == 1234567892) {
        } else {
            out.print(firstOpera + " " + opera + " " + secondOpera + " = " + result);
        }
    %>
</h2>
</body>
</html>
