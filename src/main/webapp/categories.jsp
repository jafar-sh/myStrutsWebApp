<%@ taglib prefix="logic" uri="http://jakarta.apache.org/struts/tags-logic" %>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%--
  Created by IntelliJ IDEA.
  User: Js-dev
  Date: 12/27/2024
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>کتگوری ها</title>
</head>
<body>
<h1>کتگوری</h1>
<ul>
    <logic:iterate name="categories" id="category">
        <li><a href="/showProducts.do?category=Diary/>"><bean:write name="category"/></a> </li>
    </logic:iterate>
</ul>
</body>
</html>
