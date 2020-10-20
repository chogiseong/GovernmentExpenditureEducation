package objectTest;

public class Car {
	public static void main(String[] args) {
		Car_info car = new Car_info();
		Car_info car2 = new Car_info("수동", "red", 3);
		//car.gearType = "오토";
		//car.color = "검정색";
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
		gearType = "자동";
		color = "white";
		door = 4;
	}
	
	Car_info(String gearType, String color, int door){
		this.gearType = gearType;
		this.color = color;
		this.door = door;
	}
	
	String getInfo() {
		return "기어는"+gearType+"차색은"+color+"문의 수는"+door;
	}
}