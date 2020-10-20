<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@page import = "emaillist.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String first_name = request.getParameter("fn");
	String last_name = request.getParameter("ln");
	String email = request.getParameter("email");
	
	emaillistVO vo = new emaillistVO(first_name, last_name, email);
	
	emaillistDAO dao = new emaillistDAOlmpl();
	dao.insert(vo);
	
	response.sendRedirect("list.jsp");
%>
</body>
</html>