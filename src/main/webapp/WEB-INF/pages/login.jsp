<%--
  Created by IntelliJ IDEA.
  User: sujan.sarkar
  Date: 5/20/14
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>User Login</title>

    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<%----%>
<body>
<div id="login">
    <h2>Facebook Login</h2>

    <form action="login" method="POST">

        <fieldset>
            <table aling="center">
                <tr>
                    <td>email :</td>
                    <td><input type="text" name="email"/></td>
                </tr>

                <tr>
                    <td>password :</td>
                    <td><input type="password" name="password"/></td>
                </tr>

                <tr>
                    <td><input type="submit" value="login"/></td>
                </tr>
                <tr>
                    <c:if test="${requestScope.message ne null }">
                        <p style="color: red"><c:out value="${requestScope.message}">
                        </c:out></p>
                    </c:if>

                </tr>

            </table>
        </fieldset>

    </form>

</div>
</body>
</html>