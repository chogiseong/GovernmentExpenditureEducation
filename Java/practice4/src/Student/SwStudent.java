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
	
	@Override //�����ε��� ���� �޼������� �Ű������� ������ ������ �ٸ����̰� //�������̵��� �ڼ�Ŭ������ �θ�Ŭ�����κ��� �޼ҵ带 ������°�.	
	public String toString() {
		return super.get2();
	}
}