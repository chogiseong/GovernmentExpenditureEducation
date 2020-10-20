package emaillist;

public class emaillistVO {
	//	필드
	private Long no;
	private String first_name;
	private String last_name;
	private String email;
	
	//	생성자
	public emaillistVO(Long no,String first_name, String last_name,String email) {
		super();
		this.no = no;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	public emaillistVO(String first_name, String last_name,String email) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	//	Getters/Setters
	public Long getno() {
		return no;
	}

	public void setno(Long no) {
		this.no = no;
	}

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getlast_name() {
		return last_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	//	출력용 오버라이드
	@Override
	public String toString() {
		return "emaillistVO [no =" + no + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email + "]";
	}
}
