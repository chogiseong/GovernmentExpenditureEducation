package Student;

class HwStudent extends Student {
	int circuit;
	
	HwStudent(){
		super();
	}
	
	void setter(int circuit) {
		this.circuit = circuit;
	}

	int getter() {
		circuit = (50);
		return circuit;
	}
	
	@Override
	int calcTotal() {
		total = super.TotalAverage(score_kor, score_eng, score_mat)+circuit;
		
	}
	
	@Override //오버로딩은 같은 메서드지만 매개변수의 갯수나 종류가 다른것이고 //오버라이딩은 자손클래스가 부모클래스로부터 메소드를 갖고오는것.	
	public String toString() {
		return super.get2();
	}
}
