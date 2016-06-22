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
            background-color: #c683cc;
            width: 100%;
            padding: 10px;
            border: 1px;
            font-size: 32px;
            margin: 3px;
        }
    </style>
</head>
<body>
<c:forEach var="i" begin="1" end="5">
    <form action="MyServlet" method="get">
        <button class="btn" name="jsp" value="index2">This is index ${number2}</button>
    </form>
</c:forEach>
${number2}
<% String s = (String) request.getSession().getAttribute("number2");%>
<%=s%>
</body>
</html>