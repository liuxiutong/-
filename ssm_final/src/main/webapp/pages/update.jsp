<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <h1>修改页面</h1>
  <form action="${pageContext.request.contextPath}/student/updateById" method="post">
      <input name="id" type="text" value="${stu.id}" hidden>
    学生姓名：<input type="text" value="${stu.name}" name="name" ><br/>
      <c:if test="${stu.sex == 0}">
    学生性别：<input type="text" value="男" name="sexStr" ><br/>
      </c:if>
      <c:if test="${stu.sex == 1}">
          学生性别：<input type="text" value="女" name="sexStr" ><br/>
      </c:if>
    学生年龄：<input type="text" value="${stu.age}" name="age" ><br/>
    学生地址：<input type="text" value="${stu.address}" name="address"><br/>
    <button type="submit">修改</button>
  </form>
</body>
</html>
