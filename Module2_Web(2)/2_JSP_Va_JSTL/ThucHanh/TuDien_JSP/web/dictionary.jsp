<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.SplittableRandom" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/5/2020
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2> Dictionary </h2>
<%! Map<String, String> dictionary = new HashMap<>(); %>
<%
    dictionary.put("one", "một");
    dictionary.put("two", "hai");
    dictionary.put("three", "ba");
    dictionary.put("four", "bốn");
    dictionary.put("five", "năm");
    dictionary.put("hello", "xin chào");

    String search = request.getParameter("text");
    search = search.toLowerCase();
    String result = dictionary.get(search);

    if (result != null) {

        out.print("Word : " + search);
        out.print("<br>");
        out.print("Result : " + result);
    } else {
        out.print("Not found !!!");
    }
%>
<form action="index.jsp">
    <input type="submit" id="submit" value="back to menu search">
</form>

</body>
</html>
