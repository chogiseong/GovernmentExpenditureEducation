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
	    
	    String sql = "select * from LoginMember";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type = "text/css">
		body{
		    background-color: ghostwhite;
		    font-family: "Arial";
		    font-size:15px;
		    color:gray;
		}
		table{
			width="800";
			padding:10px;
		    margin:0 auto;
			border:15px solid gray;
			border-radius:5px;
			background-color:ghostwhite;
		    float:none;
		    margin:5px;
		}
	</style>
</head>
<body>
<table border="1">
<tr>
<th>회원번호</th>
<th>회원아이디</th>
<th>회원비밀번호</th>
<th>회원이름</th>
<th>회원생년월일</th>
<th>회원성별</th>
<th>회원이메일</th>
<th>회원전화번호</th>
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
			out.print("<td>"+rs.getString("ID")+"</td>");
			out.print("<td>"+rs.getString("PW")+"</td>");
			out.print("<td>"+rs.getString("NAME")+"</td>");
			out.print("<td>"+rs.getString("BIRTH")+"</td>");
			out.print("<td>"+rs.getString("Gender")+"</td>");
			out.print("<td>"+rs.getString("EMAIL")+"</td>");
			out.print("<td>"+rs.getString("PHONENUMBER")+"</td>");
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