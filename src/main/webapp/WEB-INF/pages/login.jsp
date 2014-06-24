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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
    <title>User Login</title>

    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrap.min.css" />'/>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/bootstrap.css" />'/>
</head>
<%----%>
<body>
<%--<div id="login">
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

</div>--%>
<%-- bootwatch_theme_start--%>
<div class="container">
    <div class="jumbotron">

        <form:form class="form-horizontal" action="login" modelAttribute="user" method="post">
            <fieldset>
                <legend>Login</legend>
                <div class="form-group">
                    <label for="email" class="col-lg-2 control-label">Email</label>
                    <div class="col-lg-10">
                        <form:input path="email" id="email" class="form-control"  placeholder="Email" type="text"  />
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword" class="col-lg-2 control-label">Password</label>
                    <div class="col-lg-10">
                        <form:input path="password" class="form-control" id="inputPassword" placeholder="Password" type="password" name="password" />

                    </div>
                </div>

                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </fieldset>
        </form:form>

     </div>
</div>

<%-- bootwatch_theme_end--%>



</body>
</html>