/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.57
 * Generated at: 2020-07-28 04:32:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.StudyBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Moble.*;
import java.util.List;

public final class StudyBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("Moble");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");

	DAO dao = new DAOImpl();
	String Study_Choice = request.getParameter("Study_Choice");
	String Study_Search = request.getParameter("Study_Search");
	
	System.out.println(Study_Choice);
	System.out.println(Study_Search);
	
	List<StudyBoardVO> list = dao.getListStudyBoard(Study_Choice, Study_Search);
	System.out.println(list.toString());

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title> 모블 소원수리 게시판(사용자) </title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <link href=\"../CSS/StudyBoard.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <!-- ****** 네비게이션 바 메뉴 ****** -->\r\n");
      out.write("  <div class=\"wrap\">\r\n");
      out.write("    <header class=\"app-header\">\r\n");
      out.write("      <!-- div태그를 써서 작성하여도 되지만 헤더를 이용하여 좀더 세세히 나눔 -->\r\n");
      out.write("      <h1 class=\"brand\">\r\n");
      out.write("        <a href=\"http://www.saramin.co.kr/zf_user/company-info/view/csn/1198632756/company_nm/(%EC%A3%BC)%EB%AA%A8%EB%B8%94/\"\r\n");
      out.write("          target=\"_blank\">\r\n");
      out.write("          <span class=\"logo-name\">모블</span>\r\n");
      out.write("          <!-- <SPAN>태그 인태그를 사용해서 위드나 헤이드 태그를 사용 DIV와의 차이 /\r\n");
      out.write("                    CSS로 모블 글씨의 변화를 주고자 함-->\r\n");
      out.write("        </a>\r\n");
      out.write("      </h1>\r\n");
      out.write("      <ul class=\"nav\">\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"../StudyBoard/WriteStudyBoard.jsp\" target=\"_self\"> 학습자료 게시판</a></li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"../StudyBoard/WriteStudyBoard.jsp\" target=\"_self\"> 출결 게시판</a> </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"#goodStudenSt\" target=\"_self\"> 자유 게시판</a> </li>\r\n");
      out.write("        <li class=\"nav-item\">\r\n");
      out.write("          <a class=\"nav-link nav-right\" href=\"../WishBoard/WriteWishBoard.jsp\" target=\"_self\"> 소원수리 게시판</a> </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <button type=\"button\" class=\"button is-open\">\r\n");
      out.write("        <img src=\"../images/navigation-button.gif\" alt=\"메뉴 열기\">\r\n");
      out.write("      </button>\r\n");
      out.write("     \r\n");
      out.write("    </header>\r\n");
      out.write("\r\n");
      out.write("    <!-- ************ 게시판 내용  ************ -->\r\n");
      out.write("    <main class=\"board-main\">\r\n");
      out.write("      <!-- ******   타이틀 부분  ****** -->\r\n");
      out.write("      <div class=\"boardtitle\">\r\n");
      out.write("        <p class=\"boardfont\">모블 학습자료 게시판</p>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"container_board\">\r\n");
      out.write("        <!-- ****** 게시판 검색 ****** -->\r\n");
      out.write("        <form method=\"post\" action=\"WriteStudyBoard.jsp\">\r\n");
      out.write("          <div class=\"inp_text\">\r\n");
      out.write("            <!-- 옵션 선택 -->\r\n");
      out.write("            <select class=\"select_search\" name=\"wish_choice\">\r\n");
      out.write("              <option value=\"wish_title\">제목</option>\r\n");
      out.write("              <option value=\"student_name\">이름</option>\r\n");
      out.write("              <option value=\"wish_date\">날짜</option>\r\n");
      out.write("            </select>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"loginId\" class=\"screen_out\"></label>\r\n");
      out.write("            <!-- 검색 텍스트 입력-->\r\n");
      out.write("            <input type=\"text\" id=\"search\" name=\"Wish_search\" placeholder=\"Search\">\r\n");
      out.write("\r\n");
      out.write("            <!-- 검색 버튼 선택 -->\r\n");
      out.write("            <input type=\"submit\" value=\"검색\" id=\"BtnSearch\" />\r\n");
      out.write("          </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- ****** 게시판 컬럼 ****** -->\r\n");
      out.write("        <form method=\"post\" name=\"moveChoice\">\r\n");
      out.write("          <table class=\"table_board\" style=\"border:1px solid #dddddd\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th class=\"tableCulrom1\" style=\"border:1px solid #dddddd\">No</th>\r\n");
      out.write("                <th class=\"tableCulrom2\" style=\"border:1px solid #dddddd\">제 목</th>\r\n");
      out.write("                <th class=\"tableCulrom3\" style=\"border:1px solid #dddddd\">내 용</th>\r\n");
      out.write("                <th class=\"tableCulrom4\" style=\"border:1px solid #dddddd\">파일명</th>\r\n");
      out.write("                <th class=\"tableCulrom5\" style=\"border:1px solid #dddddd\">날 짜</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("\r\n");
      out.write("            <tbody>\r\n");
      out.write("\t\t\t\t\t\t\t");
 
								int i= 1;
								for(StudyBoardVO vo : list) {			
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tableContent1\">");
      out.print(++i);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tableContent2\">");
      out.print(vo.getFileNo());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tableContent3\">");
      out.print(vo.getStudyTitle());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tableContent4\">");
      out.print(vo.getStudyContent());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tableContent5\">");
      out.print(vo.getFile());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"tableContent6\">");
      out.print(vo.getReg_date());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("\r\n");
      out.write("          <!-- ****** 글 작성 버튼 ****** -->\r\n");
      out.write("          <div class=\"post_button\">\r\n");
      out.write("            <input type=\"button\" onClick=\"MoveSubmit(1)\" class=\"btn-write\" value=\"글  쓰기\" />\r\n");
      out.write("            <input type=\"button\" onClick=\"MoveSubmit(2)\" class=\"btn-delete\" value=\"글  삭제\" />\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <!-- ****** 원하는 submit 페이지로 이동 ****** -->\r\n");
      out.write("          <script>\r\n");
      out.write("            function MoveSubmit(index) {\r\n");
      out.write("              var flag = false;\r\n");
      out.write("              // 뒤 가는 버튼 \r\n");
      out.write("              if (index == 1) {\r\n");
      out.write("                document.moveChoice.action = 'WriteStudyBoard.jsp';\r\n");
      out.write("              }\r\n");
      out.write("\r\n");
      out.write("              // checkbox가 눌렸는지 확인\r\n");
      out.write("              if (index == 2) {\r\n");
      out.write("                // 배열 형태로 담아짐\r\n");
      out.write("                var values = document.getElementsByName(\"DeleteCheck\");\r\n");
      out.write("                var count = 0;\r\n");
      out.write("\r\n");
      out.write("                for (var i = 0; i < values.length; i++) {\r\n");
      out.write("                  if (values[i].checked) {\r\n");
      out.write("                    count++;\r\n");
      out.write("                  }\r\n");
      out.write("                }\r\n");
      out.write("                if (count < 1) {\r\n");
      out.write("                  alert(\"1개 이상 선택해주세요.\");\r\n");
      out.write("                } else {\r\n");
      out.write("                  alert(count + \"개를 선택하였습니다.\");\r\n");
      out.write("                  document.moveChoice.action = 'DeleteWishBoard.jsp';\r\n");
      out.write("                }\r\n");
      out.write("              }\r\n");
      out.write("              document.moveChoice.submit();\r\n");
      out.write("            }\r\n");
      out.write("          </script>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- ****** 글 리스트 갯수  ****** -->\r\n");
      out.write("        <div class=\"Num_board\">\r\n");
      out.write("          <ul class=\"ul_board\">\r\n");
      out.write("            <li class=\"li_board\"><a href=\"#\">[ 1 ]</a></li>\r\n");
      out.write("            <li class=\"li_board\"><a href=\"#\">[ 2 ]</a></li>\r\n");
      out.write("            <li class=\"li_board\"><a href=\"#\">[ 3 ]</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("    <!-- ****** 하단 부 디자인 ****** -->\r\n");
      out.write("    <div class=\"boxColor\">\r\n");
      out.write("      <p>\"\"</p>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}