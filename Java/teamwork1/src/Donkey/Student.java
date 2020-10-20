/////////////////////////////////////////////////////////////�л� �������� ������ �����ϴ� ���
//����, ��� ���⼺
//��� , ���� ���ȣ �ȴ���

package Donkey;

public class Student implements Comparable<Student> { //�л��� ������ �����ϴ� Ŭ����
	private String[] subject = {"Java", "DB", "�����", "ICT", "��Ʈ��ũ"}; //�����̸��� ���⼭ �ٲٸ� ��� ������ �ݿ���
	private int[] subjectScore = new int[5]; //�� ������ ����
	private int total = 0; //�л��� ����
	private float avg = 0; //�л��� ���
	
	private String name = new String(); //�л��� �̸�
	private String num = new String(); //�л��� �й�
	
	public Student() {}
	
//////////////////////////////////////////////�л��� �� ����� ������ ���� ������ ����, ȣ���ϴ� �޼ҵ��
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

////////////////////////////////////////////////////////////�л��� ���� �� ����� ȣ���ϴ� �޼ҵ��
	public int getTotal() {
		total = getSubject1() + getSubject2() + getSubject3() + getSubject4() + getSubject5();
		return total;
	}
	public float getAvg() {
		return this.avg = total / 5.f;
	}

////////////////////////////////////////////////////////////�л��� �̸�, �й��� ����, ȣ���ϴ� �޼ҵ��
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

////////////////////////////////////////////////////////////�л��� ��� ������ ȣ���ϴ� �޼ҵ�
	public String toString() {
		return " �̸� : " + getName() + " / �й� : " + getNum()
				+ " / " + getSubjectName1() + " ���� : " + getSubject1()
				+ " / " + getSubjectName2() + " ���� : " + getSubject2()
				+ " / " + getSubjectName3() + " ���� : " + getSubject3()
				+ " / " + getSubjectName4() + " ���� : " + getSubject4()
				+ " / " + getSubjectName5() + " ���� : " + getSubject5()
				+ " / ���� ���� : " + getTotal() + " / ���� ��� : " + getAvg() + "\n";
	}

////////////////////////////////////////////////////////////Comparable.compareTo �߻�޼ҵ�, �̰� �� Ŭ������ ó�� ������ �� implements Comparable<Student>�� �߰��ߴµ� 
////////////////////////////////////////////////////////////compareTo�� �߻�޼ҵ�� ����Ǿ��־ ���⼭ �� �����ؾ� ��. �̴� ���θ޼ҵ� �Ʒ��κп� Descend���� ����. ���� ���� ����
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

