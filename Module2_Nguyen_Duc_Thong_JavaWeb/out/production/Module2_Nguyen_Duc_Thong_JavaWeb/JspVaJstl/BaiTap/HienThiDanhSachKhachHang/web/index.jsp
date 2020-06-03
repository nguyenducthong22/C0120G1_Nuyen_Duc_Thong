<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/7/2020
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Clients.Clients"%>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
  <title>Danh sach khach hang</title>
  <%
    ArrayList<String[]> listClients=Clients.getClients();
    request.setAttribute("listClients",listClients);
  %>
</head>
<body>
<ul>
</ul><br/>
<table>
  <tr>
    <th>Ten</th>
    <th>Ngay Sinh</th>
    <th>Dia chi</th>
  </tr>
  <c:forEach var="client" items="${listClients}">
    <tr>
      <c:forEach var="props" items="${client}">
        <th>${props}</th>
      </c:forEach>
    </tr>
  </c:forEach>
</table>
</body>
</html>