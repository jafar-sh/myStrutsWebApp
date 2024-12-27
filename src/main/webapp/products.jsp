<%@ taglib prefix="logic" uri="http://jakarta.apache.org/struts/tags-logic" %>
<%--
  Created by IntelliJ IDEA.
  User: Js-dev
  Date: 12/27/2024
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>Products</h1>
<ul>
    <logic:iterate id="product" name="products">
        <li><bean:write name="product"></bean:write></li>
    </logic:iterate>
</ul>

</body>
</html>
