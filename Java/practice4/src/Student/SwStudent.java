package Student;

class SwStudent extends Student {
	int java;
	
	SwStudent(){
		super();
	}
	
	void setter(int java) {
		this.java = java;
	}
	
	int getter() {
		java = (65);
		return java;
	}
	
	void TotalAverage() {
		score_all = score_kor + score_eng + score_mat + java;
		score_avg = score_all/4;
		return;
	}
	
	@Override //오버로딩은 같은 메서드지만 매개변수의 갯수나 종류가 다른것이고 //오버라이딩은 자손클래스가 부모클래스로부터 메소드를 갖고오는것.	
	public String toString() {
		return super.get2();
	}
}