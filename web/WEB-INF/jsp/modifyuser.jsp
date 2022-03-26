<%--
  Created by IntelliJ IDEA.
  User: 17449
  Date: 2022/3/26
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ModifyUser</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>修改用户</small>
            </h1>
        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/modifyuser" method="post">
      用户昵称：<input type="text" name="userName"><br><br><br>
      英文名：  <input type="text" name="userCode"><br><br><br>
      密码：    <input type="password" name="userPassword"><br><br><br>
    <input type="submit" value="修改">
    <input type="reset" value="重置">
</form>

</div>
</body>
</html>
