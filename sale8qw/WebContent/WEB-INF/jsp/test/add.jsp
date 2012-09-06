<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:url var="form" value="/person/add.do">
</c:url>
<form action="${form}" method ="post">
<table>
<tr>
<td>name</td>
<td><input type="text" name="name" id="name" > </td>
</tr>

<tr>
<td>age</td>
<td><input type="text" name="age" id="age" > </td>
</tr>
<tr>
<td>password</td>
<td><input type="text" name="password" id="password" > </td>
</tr>
<tr>
<td>sex</td>
<td><input type="text" name="sex" id="sex" > </td>
</tr>
<tr>
<td><input type="reset" name="reset" ></td>
<td><input type="submit" name="submit"> </td>
</tr>
</table>

</form>
</body>
</html>