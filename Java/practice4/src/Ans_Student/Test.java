package Ans_Student;

public class Test {
	
	public static void main(String[] args) {
		HwStudent std1 = new HwStudent("È«±æµ¿", "123456");
		std1.setScore(2, 7, 9);
		std1.setCircuit(5);
		
		System.out.println(std1.name + "ÇÐ»ýÀÇ Æò±ÕÀº " + std1.calcAvg());
	}

}
