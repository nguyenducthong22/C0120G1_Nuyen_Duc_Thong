<%--@elvariable id="message" type="java"--%>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/14/2020
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<h1>Email Validate</h1>

<h3 style="color:red">${message}</h3>



<form action="validate" method="post">

    <input type="text" name="email"><br>

    <input type="submit" value="Validate">

</form>