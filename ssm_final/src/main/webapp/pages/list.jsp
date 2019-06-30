<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script src="/js/jquery-2.2.3.min.js"></script>

<body>
<h1>学生信息列表</h1>
<a href="${pageContext.request.contextPath}/pages/add.jsp">新增</a>
&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
<button onclick="del()">批量删除</button>

<table border="1" cellspacing="0">

    <tr>
        <th></th>
        <th>学生id</th>
        <th>学生名称</th>
        <th>学生性别</th>
        <th>学生年龄</th>
        <th>居住地址</th>
        <th>操作</th>
    </tr>
    <%-- items:容器对象
         var:容器中元素的临时变量
         varStatus:循环状态对象
         index:容器中元素的索引，从0开始
         count:循环次数，从1开始--%>
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td><input type="checkbox" name="ids" value="${student.id}"></td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <c:if test="${student.sex == 0}">
                <td>男</td>
            </c:if>
            <c:if test="${student.sex == 1}">
                <td>女</td>
            </c:if>
            <td>${student.age}</td>
            <td>${student.address}</td>
            <td>
                <a href="/student/listOne?id=${student.id}">修改</a>
                &nbsp;&nbsp;
                <a href="/student/delOne?id=${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
<script>
    function del() {
        var array = new Array();
        var elements = document.getElementsByName("ids");
        for (i = 0 ; i < elements.length; i++){
            if(elements[i].checked){
                array.push(elements[i].value);
            }
        }
        if (confirm("您确认要删除吗？")) {
            location.href = "${pageContext.request.contextPath}/student/delSel?ids="+array;
        }

    }
</script>
</html>
