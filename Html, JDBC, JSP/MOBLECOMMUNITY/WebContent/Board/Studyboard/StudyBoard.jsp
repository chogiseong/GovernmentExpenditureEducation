<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import = "java.sql.Connection" %>
    <%@page import = "java.sql.DriverManager" %>
    <%@page import = "java.sql.PreparedStatement" %>
    <%@page import = "java.sql.ResultSet" %>
    <%@page import = "java.sql.SQLException" %>
    
    <%!
    	Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    String url="jdbc:oracle:thin:@localhost:1521:XE";
	    String user = "Moble";
	    String pass = "123";
	    
	    String sql = "select * from Moble";
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action = "StudyInsert.jsp" method="post" enctype="multipart/form-data">
		file: <input type = "file" name "file"><br>
		<input type = "submit" value="파일 업로드">
	</form>
</body>
</html>