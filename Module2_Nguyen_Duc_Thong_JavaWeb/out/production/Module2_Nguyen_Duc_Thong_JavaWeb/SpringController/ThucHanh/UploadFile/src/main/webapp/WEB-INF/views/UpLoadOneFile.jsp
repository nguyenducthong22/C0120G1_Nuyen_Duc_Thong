<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 4/15/2020
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Upload Multi File</title>

</head>

<body>

<jsp:include page="menu.jsp"/>

<h3>Upload Multiple File:</h3>

<!-- MyUploadForm -->

<%--@elvariable id="myUploadForm" type=""--%>
<form:form modelAttribute="myUploadForm" method="POST" action="" enctype="multipart/form-data">

    Description:

    <br>

    <form:input path="description" style="width:300px;"/>

    <br/><br/>

    File to upload (1): <form:input path="fileDatas1" type="file"/><br />

    File to upload (2): <form:input path="fileDatas2" type="file"/><br />

    File to upload (3): <form:input path="fileDatas3" type="file"/><br />

    File to upload (4): <form:input path="fileDatas4" type="file"/><br />

    File to upload (5): <form:input path="fileDatas5" type="file"/><br />

    <input type="submit" value="Upload">

</form:form>

</body>

</html>