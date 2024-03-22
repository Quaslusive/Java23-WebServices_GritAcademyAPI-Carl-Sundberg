<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Grit Academy Portal</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<div class="top-titel fadeInAnimation" >
    <h1>Welcome to Grit Academy Portal version!</h1>
</div>
<main>

    <div style="text-align: center;">
        <form action="${pageContext.request.contextPath}/login">
            <input type="submit" value="login"> <br>
        </form>
        <img src="${pageContext.request.contextPath}/assets/statue-bust-with-sunglasses-vaporwave.png" alt="coolGuy">
    </div>
    <div style="text-align: center;">
    <a href= "http://localhost:8080/" class="button"> home </a><br>
    <a href= "http://localhost:8080/login" class="button"> login </a><br>
        <p>test1</p>
    </div>
</main>
    <%@include file="Fragments/Footer.jsp" %>
</body>
</html>