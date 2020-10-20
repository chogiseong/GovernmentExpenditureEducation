package 조기성;

public class guestbookVO {
	//	필드
	private Long no;
	private String name;
	private String password;
	private String content;
	private String reg_date;
	
	//	생성자
	public guestbookVO(Long no,String name, String password,String content, String reg_date) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.content = content;
		this.reg_date = reg_date;
	}
	
	public guestbookVO(String name, String password,String content, String reg_date) {
		this.name = name;
		this.password = password;
		this.content = content;
		this.reg_date = reg_date;
	}
	
	public guestbookVO(String name, String password,String content) {
		this.name = name;
		this.password = password;
		this.content = content;
	}
	
	public guestbookVO(Long no, String password) {
		super();
		this.no = no;
		this.password = password;
	}
	
	//	Getters/Setters
	public Long getno() {
		return no;
	}

	public void setno(Long no) {
		this.no = no;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	public String getcontent() {
		return content;
	}

	public void setcontent(String content) {
		this.content = content;
	}
	
	public String getreg_date() {
		return reg_date;
	}

	public void setreg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	//	출력용 오버라이드
	@Override
	public String toString() {
		return "guestbookVO [no =" + no + ", name=" + name + ", password=" + password + ", content=" + content + "]";
	}
}
