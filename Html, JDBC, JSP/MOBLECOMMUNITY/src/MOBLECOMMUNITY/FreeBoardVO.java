package MOBLECOMMUNITY;

public class FreeBoardVO {
	//	자유게시판VO
	//	필드
	private Long no;
	private String password;
	private String date;
	
	private String freeTitle; //자유게시판 제목
	private String freeContent; //자유게시판 내용
	
	//자유게시판 기본생성자
	public FreeBoardVO(Long no, String password, String date, String freeTitle, String freeContent) {
		super();
		this.no = no;
		this.password = password;
		this.date = date;
		this.freeTitle = freeTitle;
		this.freeContent = freeContent;
	}
	
	//자유게시판 Insert생성자
	public FreeBoardVO(String freeTitle, String freeContent) {
		this.freeTitle = freeTitle;
		this.freeContent = freeContent;
	}
	
	
	//	Getters/Setters
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//자유게시판 제목 겥셑
	public String getFreeTitle() {
		return freeTitle;
	}

	public void setFreeTitle(String freeTitle) {
		this.freeTitle = freeTitle;
	}
	
	//자유게시판 내용 겥셑
	public String getFreeContent() {
		return freeContent;
	}

	public void setFreeContent(String freeContent) {
		this.freeContent = freeContent;
	}

	//	출력용 오버라이드
	@Override
	public String toString() {
		return "FreeBoardVO [no =" + no + ", password=" + password + "]";
	}
}
