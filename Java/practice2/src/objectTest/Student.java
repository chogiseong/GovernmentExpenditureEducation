package objectTest;

public class Student {
	public static void main(String[] args) {
		Student_info st = new Student_info();
		st.kor = 20;
		st.eng = 30;
		st.math = 50;
		st.getTotal();
		System.out.println(st.getAverage());
		}
	}
class Student_info{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (int)(getTotal()/3f * 10 + 0.5)/10f;
		}
	}
/*
�ν��Ͻ�����
���ν��Ͻ��� �������� �������, �ν��Ͻ����� �ٸ��� ���尡��
�ν��Ͻ� ���� ��, ��������.�ν��Ͻ����������� ����
�ν��Ͻ��� ������ �� �����ǰ�, ���������� ���� �� ������Ŀ���Ϳ� ���� �ڵ����Ŵ�

Ŭ��������
���� Ŭ������ ��� �ν��Ͻ����� �����ϴ� ����
�ν��Ͻ� �������� Ŭ�����̸�.Ŭ�������������� ����
Ŭ������ �ε��� �� �����ǰ� ���α׷��� ����� �� �Ҹ�

��������
�޼��峻�� ����Ǹ�, �޼����� ����� �Բ� �Ҹ�
���ǹ�, �ݺ����� �� ���� ����� ���������� 
*/
