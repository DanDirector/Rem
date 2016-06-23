<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Remember</title>
    <style>
        .btn {
            color: #fff;
            background-color: #fb9939;
            width: 100%;
            padding: 10px;
            border: 1px;
            font-size: 32px;
        }
    </style>
</head>
<body>
<form action="MyServlet" method="get">
    <button class="btn" name="jsp" value="index">This is index ${number1}</button>
</form>
<c:forEach items="${bubl}" var="b" >
    ${b}
</c:forEach>
</body>
</html>