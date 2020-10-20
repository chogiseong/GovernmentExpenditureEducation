package practice3;

class Car {
	String gearType; //속성은 변수 기능은 메서드
	String color;
	int door;
	
	Car(){ //기본생성자 기본값 지정가능
		gearType = "auto";
		color = "white";
		door = 4;
		//this("auto", "white", 4); //생성자에서 생성자를 호출 시 this 사용
	}
	
	void setColor(String color) {
			this.color = color;
		}
	
	void setDoor(int door) {
			this.door = door;
		}
		
	Car(String gearType, String color, int door){//생성자 초기화 해주는 값을 전달받아 초기화시켜줌
		this.gearType = gearType;
		this.color = color;
		this.door = door;
	}
	
	String getInfo() { //스트링 전달해주는 메서드
		return gearType+","+color+"문개수"+door;
		
		
		}
	

}
class NewCar extends Car{//Car를 상속받은 NewCar.

	boolean sunRoof;
	
	NewCar(){
		super();
	}
	
	NewCar(boolean sunRoof){
		this();
		this.sunRoof = sunRoof;
	}
	
	@Override //오버로딩은 같은 메서드지만 매개변수의 갯수나 종류가 다른것이고 //오버라이딩은 자손클래스가 부모클래스로부터 메소드를 갖고오는것.	
	public String toString() {
		String str = "";
		if(sunRoof) str = "선루프있음";
		return super.toString() + str;
	}
	
	String getInfo() {
		String str = "";
		if(sunRoof) str = "썬루프있음";
		return super.getInfo() + str;
	}
	
}
