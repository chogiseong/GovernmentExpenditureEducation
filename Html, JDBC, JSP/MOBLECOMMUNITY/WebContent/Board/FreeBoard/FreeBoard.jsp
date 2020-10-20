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

	<form action="FreeInsert.jsp" method="">
		<input type="text" name="title" value="">
		<input type="text" name="content" value="">
		<input type="submit" value="게시하기">
	</form>
	
	<table width="800" border="1">
	<th>자유게시판</th>
	<tr>
	<th>아이디</th>
	<th>비밀번호</th>
	<th>제목</th>
	<th>내용</th>
	</tr>
		<%
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pass);
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					out.print("<tr>");
					out.print("<td>"+rs.getInt("no")+"</td>");
					out.print("<td>"+rs.getString("password")+"</td>");
					out.print("<td>"+rs.getString("freeTitle")+"</td>");
					out.print("<td>"+rs.getString("freeContent")+"</td>");
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