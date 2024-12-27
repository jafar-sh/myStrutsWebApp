<%--
  Created by IntelliJ IDEA.
  User: Js-dev
  Date: 12/18/2024
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Check...</title>
    <%@taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
    <%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
    <%@ taglib prefix="logical" uri="http://jakarta.apache.org/struts/tags-logic" %>
</head>
<body>
<%--<h1>--%>
<%--    <logic:equal value="true" name="isValid">--%>
<%--        <%="به سایت خود خوش امدید"+request.getAttribute("userName")+"کاربر گرامی"%>--%>
<%--    </logic:equal>--%>
<%-- <logical:notEqual value="true" name="isValid">--%>
<%--     <%="شما اجازه ورود به سایت را ندارید"+request.getAttribute("userName")+"کاربر گرامی"%>--%>
<%-- </logical:notEqual>--%>
<%--</h1>--%>
<html:errors bundle="myMessages"/>
<h1>
    <%= request.getAttribute("userName")%>
        <logic:equal value="true" name="isValid">
            <bean:message bundle="myMessages" key="welcome.message"/>
        </logic:equal>
<%--    <logic:notEqual value="true" name="isValid">--%>
<%--        <bean:message bundle="myMessages" key="noAccess.message"/>--%>
<%--    </logic:notEqual>--%>

</h1>
</body>
</html>
