<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script src="/js/jquery-2.2.3.min.js"></script>

<body>
  <h1>登陆页面</h1>
  <form action="${pageContext.request.contextPath}/user/loginStu" method="post">
    用户名：<input type="text" name="username"><br/>
    密  码：<input type="text" name="password"><br/>
    <button type="submit">登陆</button>
      ${msg}
  </form>
</body>
</html>
