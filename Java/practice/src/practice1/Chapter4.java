package practice1;
/*
import java.util.Scanner;

public class Chapter4 {
	
	public static void main(String[] args) {
		func4_9();
		
	}

	//하나의 정수를 입력받아 짝수, 홀수를 출력
	static void func4_1() {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}
	
	static void func4_2() {
		String strGrade = "";

		System.out.println("점수를 입력하세요");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number >= 90) {
			strGrade = "A";
		} else if (number >= 80) {
			strGrade = "B";
		} else if (number >= 70) {
			strGrade = "C";
		} else if (number >= 60) {
			strGrade = "D";
		} else {
			strGrade = "F";
		}

		System.out.println("당신의 학점은 " + strGrade + "입니다.");
		
	}
	
	static void func4_3() {
		String strGrade = "";

		System.out.println("점수를 입력하세요");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number >= 0 && number <= 100) {
			if (number >= 90) {
				strGrade = "A";
			} else if (number >= 80) {
				strGrade = "B";
			} else if (number >= 70) {
				strGrade = "C";
			} else if (number >= 60) {
				strGrade = "D";
			} else {
				strGrade = "F";
			}

			System.out.println("당신의 학점은 " + strGrade + "입니다.");
		}else {
			System.out.println("잘못된 입력입니다");
		}
	}
	
	// 두개의 정수와  연산자를 선택받아서 사칙연산을 수행
	static void func4_4() {
		int num1, num2, result;
		char op; // +, -, *, /
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력 ");
		num1 = sc.nextInt();
		
		System.out.println("두번째 수 입력 ");
		num2 = sc.nextInt();
		
		
		System.out.println("+, -, *, / 중 하나를 입력하세요 ");
		String str_op = sc.next();
		op = str_op.charAt(0);
		
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			return;
		}

		System.out.println("연산결과 " + result);

	}
	
	//1부터 10사이의 정수를 램덤하게 출력
	static void func4_5() {
		
		int number = (int)(Math.random()*6) + 1;
		System.out.println(number);
		
	}
	
	//구구단 5 단 출력
	static void func4_6() {
		
		for(int j = 2 ; j < 10 ; j++) {
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println( j + "*" + i + "= " + (j*i));
			}
			System.out.println();
		}
	}
	
	//func4_4()를 q가 입력되기 전까지 반복, q가 입력 되면 종료, while문 사용
	static void func4_7() {
		
		char ch = 1;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while(ch != 'q') {
			func4_4();
			System.out.println("종료를 원하시면 q를 누르세요");
		 
			str = sc.next();
			ch = str.charAt(0);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	
	//func4_4()를 q가 입력되기 전까지 반복, q가 입력 되면 종료, do-while문 사용
	static void func4_8() {
		
	}
	
	//1부터 하나씩 증가시킨 정수의 합이 100보다 커질 때의 합과 정수값은?
	static void func4_9() {
		int sum = 0;
		int i   = 0;

		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}
	
	//10보다 작은 수 중 3의 배수가 아닌 값
	static void func4_10() {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue;
			System.out.println(i);
		}
	}
	
}
*/

















