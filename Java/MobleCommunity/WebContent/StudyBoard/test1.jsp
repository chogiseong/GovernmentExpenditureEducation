<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form method=post action="test22.jsp" enctype="multipart/form-data">
					<input type="text" name="Title" >
					<textarea name="Content"></textarea>
					<label for="ex_file">업로드</label> <input type="file" id="ex_file" name = "file">
					<button class="btn_Write" value="file upload">글 작성</button>
		 			<button type="button" class="btn_Back" onClick="location.href='StudyBoard.jsp'" >돌아 가기</button>
	</form>
</body>
</html>