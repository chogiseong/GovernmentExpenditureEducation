package objectTest;

public class Car {
	public static void main(String[] args) {
		Car_info car = new Car_info();
		Car_info car2 = new Car_info("����", "red", 3);
		//car.gearType = "����";
		//car.color = "������";
		//car.door = 4;
		System.out.println(car.getInfo());
		System.out.println(car2.getInfo());
	}

}
class Car_info{
	String gearType;
	String color;
	int door;
	
	Car_info(){
		gearType = "�ڵ�";
		color = "white";
		door = 4;
	}
	
	Car_info(String gearType, String color, int door){
		this.gearType = gearType;
		this.color = color;
		this.door = door;
	}
	
	String getInfo() {
		return "����"+gearType+"������"+color+"���� ����"+door;
	}
}