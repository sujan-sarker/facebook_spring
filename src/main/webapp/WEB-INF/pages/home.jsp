<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:setLocale value="en"/>
<fmt:setBundle basename="messages"/>

<html>

<head>

    <title>Food Management System</title>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrap.min.css" />'/>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrap.css" />'/>

</head>

<body>

    <div align="center">
    <h2>welcome</h2>

          <p> User Profile: </br>
              firstname: ${verifiedUser.firstName} </br>
              lastname: ${verifiedUser.lastName} </br>
              dob:      ${verifiedUser.dob} </br>
              email:    ${verifiedUser.email} </br>
          </p>


    <%--friendlist--%>

         <p>
             Friend List: </br>
             <c:forEach var="friend" items="${friendList}">
                 <c:out value="${friend.firstName} ${friend.lastName}"/> </br>
             </c:forEach>
         </p>

    <%--status--%>

    <p>
        Status: </br>
        <c:forEach var="status" items="${statuses}">
            <c:out value="${status.status}"/> </br>
        </c:forEach>
    </p> </br>


    <form action="status" method="post">
        <input type="text" name="status">
        <input type="submit" value="post">
    </form>


    <p><a href="/logout">Logout</a></p>
   </div>
</body>

</html>