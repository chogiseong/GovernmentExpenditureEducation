<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="viewAuthorInfo.jsp" method="post">
<table>
<tr>
	<td>저자명</td>
	<td><input type="text" name="author_name" size="20"></td>
</tr>
<tr>
	<td>저자번호</td>
	<td><input type="text" name="author_id" size="20"></td>
</tr>
<tr>
	<td>설명</td>
	<td><input type="text" name="author_desc" size="20"></td>
</tr>
<tr>
	<td><input type="submit" name="전송"></td>
	<td><input type="reset" name="초기화"></td>
</tr>
</table>
</form>
</body>
</html>