package Robot;

public class Exercise7_18 {
	//action 메서드
	static void action(Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}
		else if (r instanceof SingRobot) {
			((SingRobot) r).sing();
		}
		else if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}


	public static void main(String[] arg) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
		
	}//main
}

class Robot{}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을그립니다.");
	}
}