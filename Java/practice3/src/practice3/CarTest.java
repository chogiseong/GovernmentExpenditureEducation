package practice3;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car(); //CarŬ������ �������� car1�� ����� new Car(); �޼���, �������� �ּҰ��� ����Ѵ�.
		Car car2 = new Car("����", "red",3); //������ ���ÿ� �������ִ� ����� ����.
		
		System.out.println(car1.getInfo());
		System.out.println(car2.getInfo());
		
		NewCar nc1 = new NewCar(); //������ ��� ���, �޼ҵ� ��밡��
		nc1.sunRoof = true;
		System.out.println(nc1.getInfo());
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(nc1);
	}

}