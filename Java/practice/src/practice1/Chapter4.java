package practice1;
/*
import java.util.Scanner;

public class Chapter4 {
	
	public static void main(String[] args) {
		func4_9();
		
	}

	//�ϳ��� ������ �Է¹޾� ¦��, Ȧ���� ���
	static void func4_1() {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
		
	}
	
	static void func4_2() {
		String strGrade = "";

		System.out.println("������ �Է��ϼ���");

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

		System.out.println("����� ������ " + strGrade + "�Դϴ�.");
		
	}
	
	static void func4_3() {
		String strGrade = "";

		System.out.println("������ �Է��ϼ���");

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

			System.out.println("����� ������ " + strGrade + "�Դϴ�.");
		}else {
			System.out.println("�߸��� �Է��Դϴ�");
		}
	}
	
	// �ΰ��� ������  �����ڸ� ���ù޾Ƽ� ��Ģ������ ����
	static void func4_4() {
		int num1, num2, result;
		char op; // +, -, *, /
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° �� �Է� ");
		num1 = sc.nextInt();
		
		System.out.println("�ι�° �� �Է� ");
		num2 = sc.nextInt();
		
		
		System.out.println("+, -, *, / �� �ϳ��� �Է��ϼ��� ");
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

		System.out.println("������ " + result);

	}
	
	//1���� 10������ ������ �����ϰ� ���
	static void func4_5() {
		
		int number = (int)(Math.random()*6) + 1;
		System.out.println(number);
		
	}
	
	//������ 5 �� ���
	static void func4_6() {
		
		for(int j = 2 ; j < 10 ; j++) {
			for(int i = 1 ; i < 10 ; i++) {
				System.out.println( j + "*" + i + "= " + (j*i));
			}
			System.out.println();
		}
	}
	
	//func4_4()�� q�� �ԷµǱ� ������ �ݺ�, q�� �Է� �Ǹ� ����, while�� ���
	static void func4_7() {
		
		char ch = 1;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while(ch != 'q') {
			func4_4();
			System.out.println("���Ḧ ���Ͻø� q�� ��������");
		 
			str = sc.next();
			ch = str.charAt(0);
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	//func4_4()�� q�� �ԷµǱ� ������ �ݺ�, q�� �Է� �Ǹ� ����, do-while�� ���
	static void func4_8() {
		
	}
	
	//1���� �ϳ��� ������Ų ������ ���� 100���� Ŀ�� ���� �հ� ��������?
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
	
	//10���� ���� �� �� 3�� ����� �ƴ� ��
	static void func4_10() {
		for(int i=0;i <= 10;i++) {
			if (i%3==0)
				continue;
			System.out.println(i);
		}
	}
	
}
*/

















