<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="Moble.*"%>

<%
	request.setCharacterEncoding("utf-8");
	String studyTitle = (String)request.getParameter("studyTitle");
	
	String studyContent = (String)request.getParameter("studyContent");
	out.print(studyTitle);
	out.print(studyContent);
	
    // 파일이 저장되는 경로
    String path = request.getSession().getServletContext().getRealPath("Download");

    int size = 1024 * 1024 * 100; // 저장가능한 파일 크기
    String file = ""; // 업로드 한 파일의 이름(이름이 변경될수 있다)
    String originalFile = ""; // 이름이 변경되기 전 실제 파일 이름

    // 실제로 파일 업로드하는 과정
    try{
        MultipartRequest multi = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());

        Enumeration files = multi.getFileNames();
        String str = (String)files.nextElement(); // 파일 이름을 받아와 string으로 저장

        file = multi.getFilesystemName(str); // 업로드 된 파일 이름 가져옴
        originalFile = multi.getOriginalFileName(str); // 원래의 파일이름 가져옴

    } catch (Exception e) {
        e.printStackTrace();
    }

	MultipartRequest multi =null;
	String uploadPath = request.getRealPath("Download");
	int maxSize =1024 *1024 *10;// 한번에 올릴 수 있는 파일 용량 : 10M로 제
	
	try{
        // request,파일저장경로,용량,인코딩타입,중복파일명에 대한 기본 정책
        multi =new MultipartRequest(request,uploadPath,maxSize,"utf-8",new DefaultFileRenamePolicy());
         
        String title = multi.getParameter("Title");

        String content = multi.getParameter("Content");

        String file = multi.getParameter("File");
        
        StudyBoardVO vo = new StudyBoardVO(title, content, file);
	
	 	DAO dao = new DAOImpl();
	 	dao.insertStudyBoard(vo);
	    
	    response.sendRedirect("StudyBoard.jsp");
	}catch(Exception e){
        
        e.printStackTrace();
    }
    
    //<!-- 제목, 내용, 파일이름  sql 입력 -->
    
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    file upload success
</body>
</html>