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
인스턴스변수
각인스턴스의 개별적인 저장공간, 인스턴스마다 다른값 저장가능
인스턴스 생성 후, 참조변수.인스턴스변수명으로 접근
인스턴스를 생성할 때 생성되고, 참조변수가 없을 때 가비지커렉터에 의해 자동제거댐

클래스변수
같은 클래스의 모든 인스턴스들이 공유하는 변수
인스턴스 생성없이 클래스이름.클래스변수명으로 접근
클래스가 로딩될 때 생성되고 프로그램이 종료될 때 소멸

지역변수
메서드내에 서언되며, 메서드의 종료와 함께 소멸
조건문, 반복문의 블럭 내에 선언된 지역변수는 
*/
