<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@page import = "Login.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String Login_ID = request.getParameter("ID");
	String Login_PW = request.getParameter("PW");
	String Login_NAME = request.getParameter("NAME");
	String Login_BIRTH = request.getParameter("BIRTH");
	String Login_GENDER = request.getParameter("GENDER");
	String Login_EMAIL = request.getParameter("EMAIL");
	String Login_PHONENUMBER = request.getParameter("PHONENUMBER");
	
	emaillistVO vo = new emaillistVO(first_name, last_name, email);
	
	MobleCommunityDAO dao = new MobleCommunityDAOImpl();
	dao.insert(vo);
	
	response.sendRedirect("list.jsp");
%>
</body>
</html>