package practice3;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car(); //Car클래스의 참조변수 car1을 만들고 new Car(); 메서드, 변수등의 주소값을 사용한다.
		Car car2 = new Car("수동", "red",3); //생성과 동시에 지정해주는 방법이 편함.
		
		System.out.println(car1.getInfo());
		System.out.println(car2.getInfo());
		
		NewCar nc1 = new NewCar(); //조상의 모든 멤버, 메소드 사용가능
		nc1.sunRoof = true;
		System.out.println(nc1.getInfo());
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(nc1);
	}

}