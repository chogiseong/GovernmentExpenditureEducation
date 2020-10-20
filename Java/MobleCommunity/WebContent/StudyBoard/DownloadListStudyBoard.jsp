<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="Moble.*" %>

<%@ page import= "java.net.URLEncoder"%>

<%@ page import="java.util.List" %>   
    
<%
DAO dao = new DAOImpl();
String study_choice = request.getParameter("study_choice");
String study_search = request.getParameter("study_search");

List<StudyBoardVO> list = dao.getListStudyBoard(study_choice, study_search);
%>
    
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title> 모블 소원수리 게시판(사용자) </title>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <link href="../CSS/WishBoard.css" rel="stylesheet" type="text/css" />
</head>

<body>
  <!-- ****** 네비게이션 바 메뉴 ****** -->
  <div class="wrap">
    <header class="app-header">
      <!-- div태그를 써서 작성하여도 되지만 헤더를 이용하여 좀더 세세히 나눔 -->
      <h1 class="brand">
        <a href="http://www.saramin.co.kr/zf_user/company-info/view/csn/1198632756/company_nm/(%EC%A3%BC)%EB%AA%A8%EB%B8%94/"
          target="_blank">
          <span class="logo-name">모블</span>
          <!-- <SPAN>태그 인태그를 사용해서 위드나 헤이드 태그를 사용 DIV와의 차이 /
                    CSS로 모블 글씨의 변화를 주고자 함-->
        </a>
      </h1>
      <ul class="nav">
        <li class="nav-item">
          <a class="nav-link" href="../StudyBoard/WriteStudyBoard.jsp" target="_self"> 학습자료 게시판</a></li>
        <li class="nav-item">
          <a class="nav-link" href="../StudyBoard/WriteStudyBoard.jsp" target="_self"> 출결 게시판</a> </li>
        <li class="nav-item">
          <a class="nav-link" href="#goodStudenSt" target="_self"> 자유 게시판</a> </li>
        <li class="nav-item">
          <a class="nav-link nav-right" href="../WishBoard/WriteWishBoard.jsp" target="_self"> 소원수리 게시판</a> </li>
      </ul>
      <button type="button" class="button is-open">
        <img src="../images/navigation-button.gif" alt="메뉴 열기">
      </button>
    </header>

    <!-- ************ 게시판 내용  ************ -->
    <main class="board-main">
      <!-- ******   타이틀 부분  ****** -->
      <div class="boardtitle">
        <p class="boardfont">모블 학습자료 게시판</p>
      </div>

      <div class="container_board">
        <!-- ****** 게시판 검색 ****** -->
        <form method="post" action="FindWishBoard.jsp">
          <div class="inp_text">
            <!-- 옵션 선택 -->
            <select class="select_search" name="wish_choice">
              <option value="wish_title">제목</option>
              <option value="student_name">이름</option>
              <option value="wish_date">날짜</option>
            </select>

            <label for="loginId" class="screen_out"></label>
            <!-- 검색 텍스트 입력-->
            <input type="text" id="search" name="Wisch_search" placeholder="Search">

            <!-- 검색 버튼 선택 -->
            <input type="submit" value="검색" id="BtnSearch" />
          </div>
        </form>


        <!-- ****** 게시판 컬럼 ****** -->
        <form method="post" name="moveChoice">
          <table class="table_board" style="border:1px solid #dddddd">
            <thead>
              <tr>
                <th class="tableCulrom1" style="border:1px solid #dddddd">No</th>
                <th class="tableCulrom2" style="border:1px solid #dddddd">제 목</th>
                <th class="tableCulrom3" style="border:1px solid #dddddd">내 용</th>
                <th class="tableCulrom4" style="border:1px solid #dddddd">파일명</th>
                <th class="tableCulrom5" style="border:1px solid #dddddd">날 짜</th>
              </tr>
            </thead>

            <tbody>
              <% 
                    int i= 0;
                    for(StudyBoardVO vo : list) {
                 %>
              <tr>
                <td class="tableContent1" style="border:1px solid #dddddd"><%=++i%></td>
                <td class="tableContent2" style="border:1px solid #dddddd"><%=vo.getStudyTitle() %></td>
                <td class="tableContent3" style="text-align : left; border:1px solid #dddddd"><%=vo.getStudyContent() %>
                </td>
                <td class="tableContent4" style="border:1px solid #dddddd">
                <a href="DownloadStudyBoard.jsp?filename=<%=URLEncoder.encode(vo.getFile(),"utf-8") %>">
                <img src="../images/파일이미지.png" width="30px" height="30px" id = "<%=vo.getFile()%>" name ="filename">
                </a><%=vo.getFile() %></td>
                <td class="tableContent5" style="border:1px solid #dddddd"><%=vo.getReg_date() %></td>
              </tr>
              <%
                    }
                 %>
            </tbody>
          </table>

          <!-- ****** 글 작성 버튼 ****** -->
          <div class="post_button">
            <input type="button" onClick="MoveSubmit(2)" class="btn-delete" value="글  쓰기" />
          </div>

          <!-- ****** 원하는 submit 페이지로 이동 ****** -->
          <script>
            function MoveSubmit(index) {
              var flag = false;
              // 뒤 가는 버튼 
              if (index == 1) {
                document.moveChoice.action = 'WriteWishBoard.jsp';
              }

              // checkbox가 눌렸는지 확인
              if (index == 2) {
                // 배열 형태로 담아짐
                var values = document.getElementsByName("DeleteCheck");
                var count = 0;

                for (var i = 0; i < values.length; i++) {
                  if (values[i].checked) {
                    count++;
                  }
                }
                if (count < 1) {
                  alert("1개 이상 선택해주세요.");
                } else {
                  alert(count + "개를 선택하였습니다.");
                  document.moveChoice.action = 'DeleteWishBoard.jsp';
                }
              }
              document.moveChoice.submit();
            }
          </script>
        </form><input type="submit" value="다운" name = "<%%> ">파일 다운받기</a>


        <!-- ****** 글 리스트 갯수  ****** -->
        <div class="Num_board">
          <ul class="ul_board">
            <li class="li_board"><a href="#">[ 1 ]</a></li>
            <li class="li_board"><a href="#">[ 2 ]</a></li>
            <li class="li_board"><a href="#">[ 3 ]</a></li>
          </ul>
        </div>
      </div>
    </main>

    <!-- ****** 하단 부 디자인 ****** -->
    <div class="boxColor">
      <p>""</p>

    </div>

</body>

</html>
