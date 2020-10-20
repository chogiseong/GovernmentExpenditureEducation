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

	String no = request.getParameter("no");
	String password = request.getParameter("password");
	
	guestbookVO vo = new guestbookVO(Long.parseLong(no), password);
	
	guestbookDAO dao = new guestbookDAOImpl();
	
	dao.delete(vo.getno(), vo.getpassword());
	
	response.sendRedirect("list.jsp");
%>
</body>
</html>