<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- //////////////////////////////////////////sql추가  
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
//////////////////////////////////////////// --%>

<%
      String Student_name = null;
      if(session.getAttribute("Student_name") != null ){
    	  Student_name = (String) session.getAttribute("Student_name");
      }
      out.print("Student_name");
%>



<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> 모블 소원수리 게시판(사용자) </title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<link href="../CSS/WriteStudyBoard.css" rel="stylesheet" type="text/css"/>
	</head>

    <body>
		<div class="boardtitle">
			<p class="boardfont">학습 자료 게시판 </p>
		</div>
		
        <!-- ****** 네비게이션 바 메뉴 ****** -->
        <div class="wrap">
            <header class="app-header"> <!-- div태그를 써서 작성하여도 되지만 헤더를 이용하여 좀더 세세히 나눔 -->
                <h1 class="brand">
                <a href="http://www.saramin.co.kr/zf_user/company-info/view/csn/1198632756/company_nm/(%EC%A3%BC)%EB%AA%A8%EB%B8%94/" target="_blank"> 
                    <span class="logo-name">Moble</span>
                        <!-- <SPAN>태그 인태그를 사용해서 위드나 헤이드 태그를 사용 DIV와의 차이 /
                        CSS로 모블 글씨의 변화를 주고자 함-->
                </a>
                </h1>
                <ul class="nav">
                    <li class="nav-item">
                        <a class="nav-link" href="../StudyBoard/WriteStudyBoard.jsp" target="_self"> 학습자료 게시판</a></li>
                    <li class="nav-item">
                        <a class="nav-link" href="#gradeInfo" target="_self"> 출결 게시판</a> </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#goodStudenSt" target="_self"> 자유 게시판</a> </li>
                    <li class="nav-item">
                        <a class="nav-link nav-right" href="../WishBoard/WishBoard.jsp" target="_self"> 소원수리 게시판</a> </li>
                </ul>
                <button type="button" class="button is-open">
                    <img src="../images/navigation-button.gif" alt="메뉴 열기">
                </button>
            </header>
            
            
           	<!-- ****** 글 작성 ****** -->
           	<div class="writeFreeBoard-main">
           		<div class="writeBoard">
<!--            			<form method=post id="authForm" action="UploadStudyBoard.jsp" enctype="Multipart/form-data"> -->
					
<!--            				****** 제목, 이름  입력 ****** -->
<!--            				<div class="fieldset_one"> -->
<!-- 							<div class="box_FreeWrite"> -->
<!-- 								<div class="inp_Title"> -->
<!-- 									<span class = "boderTitle"> -->
<!-- 										<label for="writeTitle"> * 제 목 </label> -->
<!-- 									</span> -->
<!-- 										<input type="text" id="writeTitle" name="studyTitle" placeholder="Title"> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 						</div> -->
						
<!-- 						****** 내용 입력  ****** -->
<!-- 						<div class="fieldset_two"> -->
<!-- 							<div class="box_FreeWrite"> -->
<!-- 								<label for="writeContent">* 내 용 : </label> -->
<!-- 								<div class="inp_Content"> -->
<!-- 									<textarea id="writeContent" name="studyContent" cols="10" rows="8"></textarea> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 						</div> -->

<!-- 						****** 파일 입력 ****** -->
<!-- 						<div class="filebox"> -->
<!-- 							<div class="box_FreeWrite"> -->
<!-- 								<label for="ex_file">업로드</label> <input type="file" id="ex_file" name = "file"> </div> -->
<!-- 							</div> -->
<!-- 						</div>		 -->

						
<!-- 						****** 글 작성 버튼  ****** -->
<!-- 						<div class="fieldset_three"> -->
<!-- 							<button type="submit" class="btn_Write" value="file upload">글 작성</button> -->
<!-- 							<button type="button" class="btn_Back" onClick="location.href='StudyBoard.jsp'" >돌아 가기</button> -->
<!-- 						</div> -->
<!--            			</form>	 -->
				<form method="post" action="UploadStudyBoard.jsp" enctype="multipart/form-data">
					<input type="text" id="writeTitle" name="studyTitle" placeholder="Title">
					<textarea id="writeContent" name="studyContent" cols="10" rows="8"></textarea>
					<label for="ex_file">업로드</label> <input type="file" id="ex_file" name = "file">
					<button class="btn_Write" value="file upload">글 작성</button>
		 			<button type="button" class="btn_Back" onClick="location.href='StudyBoard.jsp'" >돌아 가기</button>
				</form>
           			
           		</div>	
           	</div>
		
		<!-- ****** 하단부 디자인  ****** -->
		<div class="boxColor">
			<p>""</p>
		</div>		
    </body>
</html>