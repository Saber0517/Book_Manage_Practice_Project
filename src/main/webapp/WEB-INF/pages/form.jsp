-<%--
  Created by IntelliJ IDEA.
  User: ZHANGJA4
  Date: 8/19/2015
  Time: 10:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form modelAttribute="u" action="regis" method="post">
    uname:<form:input path="uname"></form:input>
    age:<form:input path="age"></form:input>
</form:form>
</body>
</html>
