package Donkey;

public class Subject { //�л��� �� ���� ���� ������ �����ϴ� Ŭ����
	private int sco;
	private String subjectName;
	
	Subject(String subjectName) {
		this.subjectName = subjectName;
	};
	
//////////////////////////////////////////////���� ���� ������ ����, ȣ���ϴ� �޼ҵ��
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
