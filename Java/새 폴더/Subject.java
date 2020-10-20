package Donkey;

public class Subject { //학생의 각 과목에 대한 성적을 저장하는 클래스
	private int sco;
	private String subjectName;
	
	Subject(String subjectName) {
		this.subjectName = subjectName;
	};
	
//////////////////////////////////////////////과목에 대한 정보를 저장, 호출하는 메소드들
	public String getSubName() {
		return this.subjectName;
	}
	public int getSco() {
		return this.sco;
	}
	public void setSco(int sco) {
		this.sco = sco;
	}
}
