<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	MultipartRequest multi =null;
	String uploadPath = request.getRealPath("Download");
	int maxSize =1024 *1024 *10;// 한번에 올릴 수 있는 파일 용량 : 10M로 제
	
	try{
        // request,파일저장경로,용량,인코딩타입,중복파일명에 대한 기본 정책
        multi =new MultipartRequest(request,uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
         
        // form내의 input name="name" 인 녀석 value를 가져옴
        String title = multi.getParameter("Title");
        // name="subject" 인 녀석 value를 가져옴
        String content = multi.getParameter("Content");
        
	}catch(Exception e){
        
        e.printStackTrace();
    }
	
	%>
</body>
</html>