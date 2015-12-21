<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/userbanlists/query" method="get">
		輸入帳號<input type="text" name="queryId"><br>
		<input type="submit" value="送出">
	</form>
	
	他的黑名單:
	<table>
		<c:forEach items="${someOne}" var="temp">
			<tr>
				<td>${temp.userByUserAId.name}</td>
				<td>${temp.userByUserBId.name}</td>
			</tr>
		</c:forEach>
	</table>


</body>
</html>