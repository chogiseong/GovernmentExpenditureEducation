package practice3;

class Car {
	String gearType; //�Ӽ��� ���� ����� �޼���
	String color;
	int door;
	
	Car(){ //�⺻������ �⺻�� ��������
		gearType = "auto";
		color = "white";
		door = 4;
		//this("auto", "white", 4); //�����ڿ��� �����ڸ� ȣ�� �� this ���
	}
	
	void setColor(String color) {
			this.color = color;
		}
	
	void setDoor(int door) {
			this.door = door;
		}
		
	Car(String gearType, String color, int door){//������ �ʱ�ȭ ���ִ� ���� ���޹޾� �ʱ�ȭ������
		this.gearType = gearType;
		this.color = color;
		this.door = door;
	}
	
	String getInfo() { //��Ʈ�� �������ִ� �޼���
		return gearType+","+color+"������"+door;
		
		
		}
	

}
class NewCar extends Car{//Car�� ��ӹ��� NewCar.

	boolean sunRoof;
	
	NewCar(){
		super();
	}
	
	NewCar(boolean sunRoof){
		this();
		this.sunRoof = sunRoof;
	}
	
	@Override //�����ε��� ���� �޼������� �Ű������� ������ ������ �ٸ����̰� //�������̵��� �ڼ�Ŭ������ �θ�Ŭ�����κ��� �޼ҵ带 ������°�.	
	public String toString() {
		String str = "";
		if(sunRoof) str = "����������";
		return super.toString() + str;
	}
	
	String getInfo() {
		String str = "";
		if(sunRoof) str = "���������";
		return super.getInfo() + str;
	}
	
}
