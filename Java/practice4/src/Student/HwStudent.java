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
	
	@Override //�����ε��� ���� �޼������� �Ű������� ������ ������ �ٸ����̰� //�������̵��� �ڼ�Ŭ������ �θ�Ŭ�����κ��� �޼ҵ带 ������°�.	
	public String toString() {
		return super.get2();
	}
}
