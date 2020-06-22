<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 6/5/2020
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <style type="text/css">
    input,select{
    border:1px solid #ccc;
    height :30px;
    style="font-size: 20px;
    }
  </style>

  <form action="calculator.jsp" method="get">
  <h1>Calculator</h1></br>

  <label>First Operand  : </label><br/>
  <input type="text" name="firstOpera" ><br/>

   <label>Operator      : </label><br/>
  <select style="color: red" name="opera"><br/>
                  <option> + </option>
                  <option> - </option>
                  <option> * </option>
                  <option> / </option>
                  </select><br/>

   <label>Second Operand :</label><br/>
  <input type="text" name="secondOpera" ></br>

  <input type="submit" id="submit" value="calculator" style="color: cadetblue" />
  </form>

  </body>
</html>
