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
    
    String sql = "select book_id, title, pubs, pub_data, author_id from book";
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
<th>책번호</th>
<th>책이름</th>
<th>출판사</th>
<th>출판날짜</th>
<th>저자</th>
</tr>
<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pass);
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getInt("book_id")+"</td>");
			out.print("<td>"+rs.getString("title")+"</td>");
			out.print("<td>"+rs.getString("pubs")+"</td>");
			out.print("<td>"+rs.getString("pub_data")+"</td>");
			out.print("<td>"+rs.getString("author_id")+"</td>");
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