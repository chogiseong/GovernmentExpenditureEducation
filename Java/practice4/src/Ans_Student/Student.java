package Ans_Student;

public class Student {
	String name;
	String id;
	
	private int kor;
	private int eng;
	private int math;
	
	protected int total;
	protected float avg;
	
	Student(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	void  setKor(int kor) {
		this.kor = kor;
	}
	int getKor() {
		return kor;
	}
	void  setEng(int eng) {
		this.eng = eng;
	}
	int getEng() {
		return eng;
	}
	void  setMath(int math) {
		this.math = math;
	}
	int getMath() {
		return math;
	}
	
	void setScore(int kor, int math, int eng) {
		setKor(kor);
		setMath(math);
		setEng(eng);
	}
	
	int calcTotal() {
		total = kor +eng + math;
		return total;
	}
	float calcAvg() {
		
		if(total == 0) total = calcTotal();
		
		avg = (float)(total) / 3f;
		return avg;
	}
}
