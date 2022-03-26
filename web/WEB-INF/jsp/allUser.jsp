<%--
  Created by IntelliJ IDEA.
  User: 17449
  Date: 2022/3/24
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AllUsers</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th>用户编号</th>
                <th>英文昵称</th>
                <th>用户名字</th>
                <th>用户性别</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="user" items="${requestScope.get('list')}">
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getUserCode()}</td>
                    <td>${user.getUserName()}</td>
                    <td>${user.getGender()}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a href="${pageContext.request.contextPath}/goadduser">添加用户</a>
        </div>

        <div class="col-md-4 column">
            <a href="${pageContext.request.contextPath}/godeluser">删除用户</a>
        </div>

        <div class="col-md-4 column">
            <a href="${pageContext.request.contextPath}/gomodifyuser">修改用户</a>
        </div>

    </div>
</div>
</body>
</html>
