package Student;

public class StudentMain {
	public static void main(String[] args) {
		Student std = new Student();
		HwStudent hw = new HwStudent();
		SwStudent sw = new SwStudent();
		std.test();
		System.out.println(std.get1());
		System.out.println(" ");
		hw.TotalAverage();
		System.out.println("circuit ȸ���̷� ������ : " + hw.getter());
		System.out.println(" ");
		System.out.println(hw.toString());
		System.out.println(" ");
		sw.TotalAverage();
		System.out.println("java ȸ���̷� ������ : " + sw.getter());
		System.out.println(" ");
		System.out.println(sw.toString());
	}

}
