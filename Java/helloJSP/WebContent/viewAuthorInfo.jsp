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
    String user = "webdb";
    String pass = "0707";
    
    String sql1 = "insert into author values(?, ?, ?)";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String author_id = request.getParameter("author_id");
	String author_name = request.getParameter("author_name");
	String author_desc = request.getParameter("author_desc");
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pass);
		
		pstmt = conn.prepareStatement(sql1);
		
		pstmt.setInt(1, Integer.parseInt(author_id));
		pstmt.setString(2, author_name);
		pstmt.setString(3, author_desc);
		
		pstmt.executeUpdate();
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}catch(Exception e){
		e.printStackTrace();
		}
	}
%>
</body>
</html>