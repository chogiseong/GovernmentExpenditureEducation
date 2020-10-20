package emaillist;

import java.util.List;

public class emaillist {

	public static void main(String[] args) {
		printemaillists();
//		insertemaillist("정종욱", "뛰어난 AI 개발자");
//		updateemaillist(4L, "정종욱", "매우 뛰어난 AI 개발자(데이터 변경)");
//		deleteemaillist(4L);
		findemaillistById(3L);
		findemaillistById(4L);
		findemaillistById(5L);
	}
	
	private static void findemaillistById(Long no) {
		emaillistDAO dao = new emaillistDAOlmpl();
		emaillistVO emaillistVO = dao.get(no);
		
		if (emaillistVO == null) {
			System.out.println("작가를 찾지 못했습니다.");
		} else {
			System.out.printf("작가 %s를 찾았습니다.%n", emaillistVO);
		}
	}
	
	private static void deleteemaillist(Long no) {
		emaillistDAO dao = new emaillistDAOlmpl();
		boolean success = dao.delete(no);
		
		if (success) {
			System.out.printf("작가 %d를 삭제하였습니다.%n", no);
		} else {
			System.out.printf("작가 %d를 삭제하지 못했습니다.%n", no);
		}
		printemaillists();
	}
	
	private static void updateemaillist(Long no, String first_name, String last_name, String email) {
		emaillistDAO dao = new emaillistDAOlmpl();
		emaillistVO emaillistVO = new emaillistVO(no, first_name, last_name, email);
		
		boolean success = dao.update(emaillistVO);
		
		if (success) {
			System.out.printf("저자 %s를 갱신하였습니다.%n", emaillistVO);
		} else {
			System.out.printf("저자 %s를 갱신하지 못했습니다.%n", emaillistVO);
		}
		printemaillists();
	}
	
	private static void insertemaillist(String first_name, String last_name, String email) {
		emaillistDAO dao = new emaillistDAOlmpl();
		emaillistVO emaillistVO = new emaillistVO(null, first_name, last_name, email);
		
		boolean success = dao.insert(emaillistVO);
		
		if (success) {
			System.out.printf("저자 %s를 추가했습니다.%n", 
					emaillistVO);
		} else {
			System.out.printf("저자 %s를 추가하지 못했습니다.%n", 
					emaillistVO);
		}
		
		printemaillists();
	}
	
	private static void printemaillists() {
		emaillistDAO dao = new emaillistDAOlmpl();
		List<emaillistVO> list = dao.getList();
		
		System.out.println("===== 저자 목록 =====");
		for (emaillistVO emaillistVO: list) {
			System.out.println(emaillistVO);
		}
	}

}
