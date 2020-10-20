/////////////////////////////////////////////////////////////학생 개개인의 정보를 저장하는 기능
//총점, 평균 조기성
//등수 , 정렬 김상호 안덕우

package Donkey;

public class Student implements Comparable<Student> { //학생의 정보를 저장하는 클래스
	private String[] subject = {"Java", "DB", "모바일", "ICT", "네트워크"}; //과목이름을 여기서 바꾸면 모든 곳에서 반영됨
	private int[] subjectScore = new int[5]; //각 과목의 성적
	private int total = 0; //학생의 총점
	private float avg = 0; //학생의 평균
	
	private String name = new String(); //학생의 이름
	private String num = new String(); //학생의 학번
	
	public Student() {}
	
//////////////////////////////////////////////학생의 각 과목과 점수에 대한 정보를 저장, 호출하는 메소드들
	public int getSubject1() {
		return subjectScore[0];
	}
	public String getSubjectName1() {
		return subject[0];
	}
	public void setSubject1(int subject1) {
		this.subjectScore[0] = subject1;
	}
	public int getSubject2() {
		return subjectScore[1];
	}
	public String getSubjectName2() {
		return subject[1];
	}
	public void setSubject2(int subject2) {
		this.subjectScore[1] = subject2;
	}
	public int getSubject3() {
		return subjectScore[2];
	}
	public String getSubjectName3() {
		return subject[2];
	}
	public void setSubject3(int subject3) {
		this.subjectScore[2] = subject3;
	}
	public int getSubject4() {
		return subjectScore[3];
	}
	public String getSubjectName4() {
		return subject[3];
	}
	public void setSubject4(int subject4) {
		this.subjectScore[3] = subject4;
	}
	public int getSubject5() {
		return subjectScore[4];
	}
	public String getSubjectName5() {
		return subject[4];
	}
	public void setSubject5(int subject5) {
		this.subjectScore[4] = subject5;
	}

////////////////////////////////////////////////////////////학생의 총점 및 평균을 호출하는 메소드들
	public int getTotal() {
		total = getSubject1() + getSubject2() + getSubject3() + getSubject4() + getSubject5();
		return total;
	}
	public float getAvg() {
		return this.avg = total / 5.f;
	}

////////////////////////////////////////////////////////////학생의 이름, 학번을 저장, 호출하는 메소드들
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

////////////////////////////////////////////////////////////학생의 모든 정보를 호출하는 메소드
	public String toString() {
		return " 이름 : " + getName() + " / 학번 : " + getNum()
				+ " / " + getSubjectName1() + " 점수 : " + getSubject1()
				+ " / " + getSubjectName2() + " 점수 : " + getSubject2()
				+ " / " + getSubjectName3() + " 점수 : " + getSubject3()
				+ " / " + getSubjectName4() + " 점수 : " + getSubject4()
				+ " / " + getSubjectName5() + " 점수 : " + getSubject5()
				+ " / 과목 총점 : " + getTotal() + " / 과목 평균 : " + getAvg() + "\n";
	}

////////////////////////////////////////////////////////////Comparable.compareTo 추상메소드, 이건 이 클래스를 처음 선언할 때 implements Comparable<Student>를 추가했는데 
////////////////////////////////////////////////////////////compareTo가 추상메소드로 선언되어있어서 여기서 꼭 구현해야 함. 이는 메인메소드 아래부분에 Descend에서 사용됨. 같이 보면 좋음
	public int compareTo(Student o1) {
		if (this.getAvg() > o1.getAvg()) {
			return 1;
		}
		else if (getAvg() == o1.getAvg()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}

