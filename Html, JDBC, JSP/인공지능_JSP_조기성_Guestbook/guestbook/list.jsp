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
	    
	    String sql = "select * from guestbook";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="insert.jsp" method="">
	<table width="800" border="1">
		<th>Guest LogIn</th>
		<tr>
			<td>이름:</td>
			<td><input type="text" name="name" value=""></td>
			<td>비밀번호:</td>
			<td><input type="password" name="password" value=""></td>
		</tr>
		<tr>
			<td colspan = "4"><input type="text" name="content" value=""></td>
		</tr>
		<tr>
			<td colspan = "2"><input type="submit" value="등록"></td>
			<td colspan = "2"><a href="deleteform.jsp">삭제하기</a></td>
		</tr>
		
	</table>
	<br>
	
	<br>
</form>


<table width="800" border="1">
<th>Guest List</th>
<tr>
<th>게스트번호</th>
<th>이름</th>
<th>비밀번호</th>
<th>컨텐츠</th>
<th>날짜</th>
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
			out.print("<td>"+rs.getString("name")+"</td>");
			out.print("<td>"+rs.getString("password")+"</td>");
			out.print("<td>"+rs.getString("content")+"</td>");
			out.print("<td>"+rs.getString("reg_date")+"</td>");
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