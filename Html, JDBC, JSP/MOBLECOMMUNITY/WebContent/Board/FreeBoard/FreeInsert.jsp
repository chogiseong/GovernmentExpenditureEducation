<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@page import = "MOBLECOMMUNITY.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String freeTitle = request.getParameter("freeTitle");
	String freeContent = request.getParameter("freeContent");
	
	FreeBoardVO vo = new FreeBoardVO(freeTitle, freeContent);
	
	MobleCommunityDAO dao = new MobleCommunityDAOImpl();
	dao.freeInsert(vo);
	
	response.sendRedirect("FreeBoard.jsp");
%>
</body>
</html>