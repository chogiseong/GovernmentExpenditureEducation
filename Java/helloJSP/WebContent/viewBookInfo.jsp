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
    
    String sql = "select * from author a, book b where a.author_id=b.author_id";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="800" border="1">
<tr>
<th>저자</th>
<th>책이름</th>
<th>출판사</th>
</tr>
<%
	request.setCharacterEncoding("utf-8");
	String author_id = request.getParameter("author_id");
	String author_name = request.getParameter("author_name");
	String author_desc = request.getParameter("author_desc");
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pass);
		rs = pstmt.executeQuery();
		while(rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getInt("author_id")+"</td>");
			out.print("<td>"+rs.getString("title")+"</td>");
			out.print("<td>"+rs.getString("pubs")+"</td>");
			out.print("</tr>");
		}
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
</table>
</body>
</html>