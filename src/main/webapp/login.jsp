
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
    <title>ورود به سیستم</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 20px;
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(135deg, #ffffff, #87cefa);
        }
        .container {
            width: 100%;
            max-width: 400px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }
        .container h2 {
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
        .btn {
            padding: 10px 20px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #218838;
        }
        .link {
            margin-top: 15px;
            display: block;
            color: #007bff;
            text-decoration: none;
        }
        .link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<div class="container" id="loginPage">
    <h2>ورود به حساب</h2>

    <html:form action="login.do" method="post" styleId="formLogin">
    <div class="form-group">
        <label >نام کاربری</label>
            <html:text property="userName"/>
    </div>
    <div class="form-group">
        <label >رمز عبور</label>
            <html:password property="userPassword"/>
    </div>
    <button type="button" class="btn" onclick="mySender()">ورود</button>
    <html:hidden property="methodName" styleId="methodName"/>
    </html:form>
<script type="text/javascript">
    function mySender() {
        debugger
        document.getElementById("methodName").value="checkLogin";
        document.getElementById("formLogin").submit();

    }
</script>

</body>
</html>
