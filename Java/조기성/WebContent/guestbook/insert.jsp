<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@page import = "조기성.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String content = request.getParameter("content");
	String reg_date = request.getParameter("reg_date");
	
	guestbookVO vo = new guestbookVO(name, password, content, reg_date);
	
	guestbookDAO dao = new guestbookDAOImpl();
	dao.insert(vo);
	
	response.sendRedirect("list.jsp");
%>
</body>
</html>