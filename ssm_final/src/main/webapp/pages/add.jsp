<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <h1>新增页面</h1>
  <form action="${pageContext.request.contextPath}/student/add" method="post">
      <input type="text" name="id" hidden>
    学生姓名：<input type="text" name="name" ><br/>
    学生性别：<input type="text" name="sexStr" ><br/>
    学生年龄：<input type="text" name="age" ><br/>
    学生地址：<input type="text" name="address" ><br/>
    <button type="submit">新增</button>
  </form>
</body>
</html>
