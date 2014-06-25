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
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/style.css" />'/>
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
<div class="container1">
    <div class="jumbotron">

        <form:form class="form-horizontal" action="registration" modelAttribute="user"  method="post">
            <fieldset>
                <legend>Registration</legend>
                <div class="form-group">
                    <label for="firstName" class="col-lg-2 control-label">First Name</label>
                    <div class="col-lg-10">
                        <form:input path="firstName"  id="firstName" class="form-control"  placeholder="First Name" type="text"  />
                        <form:errors class="err_msg" path="firstName" ></form:errors>
                    </div>
                </div>


                <div class="form-group">
                    <label for="lastName" class="col-lg-2 control-label">Last Name</label>
                    <div class="col-lg-10">
                        <form:input path="lastName"  id="lastName" class="form-control"  placeholder="Last Name" type="text"  />
                        <form:errors class="err_msg" path="lastName" ></form:errors>
                    </div>
                </div>



                <div class="form-group">
                    <label for="email" class="col-lg-2 control-label">Email</label>
                    <div class="col-lg-10">
                        <form:input path="email"  id="email" class="form-control"  placeholder="Email" type="text"  />
                        <form:errors class="err_msg" path="email" ></form:errors>
                    </div>
                </div>


                <div class="form-group">
                    <label for="dob" class="col-lg-2 control-label">Date of Birth</label>
                    <div class="col-lg-10">
                        <form:input path="dob"  id="dob" class="form-control"  placeholder="Date of birth" type="text"  />
                        <form:errors class="err_msg" path="dob" ></form:errors>
                    </div>
                </div>

                <div class="form-group">
                    <label for="password" class="col-lg-2 control-label">Password</label>
                    <div class="col-lg-10">
                        <form:input path="password"  id="password" class="form-control"  placeholder="Password" type="text"  />
                        <form:errors class="err_msg" path="password" ></form:errors>
                    </div>
                </div>



                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                        <button type="submit" class="btn btn-primary" name="submit" value="submit">Submit</button>

                    </div>
                </div>
            </fieldset>
        </form:form>

    </div>
</div>

<%-- bootwatch_theme_end--%>



</body>
</html>