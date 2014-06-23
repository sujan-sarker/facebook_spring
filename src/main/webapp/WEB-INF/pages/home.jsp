<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setLocale value="en"/>
<fmt:setBundle basename="messages"/>

<html>

<head>

    <title>Food Management System</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">

</head>

<body>

<div id="table">

    <h1 style="text-align:center;">Welcome</h1>

    <table align="right">
        <tr>
                    <td>You are Logged In as User :</td>
                    <td><b>${verifiedUser.firstName}</b></td>
        </tr>
        <tr>
            <td>
                <a href="/logout">Logout</a>
            </td>
        </tr>
    </table>
    </br></br>

    <%--<h1 style="text-align:center;">Meal List of This Week</h1>

    <table border="1" align="center" class="table1">
        <tr>
            <td>Day</td>
            <td>Breakfast</td>
            <td>Lunch</td>
        </tr>
        <c:forEach var="meal" items="${mealList}">
            <tr>
                <td>
                    <c:out value="${meal.getDayName()}"/>
                </td>
                <td>
                    <p align="left"><c:out value="${meal.getBreakfastItem()}"/></p>
                    <c:if test="${verifiedUser.getUserType() == 1}">
                        <c:url value="edit_menu.html" var="displayURL">
                            <c:param name="dayId" value="${meal.getDayId()}"/>
                            <c:param name="mealType" value="breakfast"/>
                        </c:url>
                        <p align="right"><a href='<c:out value="${displayURL}" />'>
                            Edit
                        </a></p>
                    </c:if>
                </td>

                <td>
                    <p align="left"><c:out value="${meal.getLunchItem()}"/></p>
                    <c:if test="${verifiedUser.getUserType() == 1}">
                        <c:url value="edit_menu.html" var="displayURL">
                            <c:param name="dayId" value="${meal.getDayId()}"/>
                            <c:param name="mealType" value="lunch"/>
                        </c:url>
                        <p align="right"><a href='<c:out value="${displayURL}" />'>
                            Edit
                        </a></p>
                    </c:if>
                </td>
            </tr>

        </c:forEach>
    </table>--%>

    <%--<c:if test="${verifiedUser.getUserType() == 0 }">
        <p align="right"><a href="current_day.html">
            view Today's List
        </a></p>
    </c:if>
--%>
</div>

</body>

</html>