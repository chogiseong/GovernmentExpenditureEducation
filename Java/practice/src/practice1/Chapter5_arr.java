package practice1;

import java.util.Scanner;

public class Chapter5_arr {
	
	public static void main(String[] args) {
		func5_10();
	}
	
	//���̰� 5�� ������ �迭�� ����� ����ڷκ��� ���� �Է°��� ����
	static void func5_1() {
		
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
	
		//�Է�
		for(int i = 0 ; i < score.length ; i++) {
			
			score[i] = sc.nextInt();
			
		}
		
		printArr(score);
			
	}

	//���̰� 5�� ������ �迭�� 1���� 45������ ������ ����
	static void func5_2() {
		int arr[] = new int[5];
		
		for(int i = 0 ;i < arr.length ;i++) {
			arr[i] = (int)(Math.random()*45) + 1;
		}
		
		//���
		printArr(arr);
		
	}
	
	// ������ �迭�� ��� ��� ���� �� ���ϱ�
	static void func5_3() {
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum: " + sum );
	}
	
	//���̰� 5�� �迭�� �����ϰ� 1���� 5������ ������ �ʱ�ȭ����
	//�ڼ��� �ֱ�
	static void func5_4() {
		
		int[] arr = new int[5];
		int ran = 0;
		int temp = 0;
		
	
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0 ; i < 20 ; i++) {
		
			ran = (int)(Math.random()*5); // �ε���
			temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		
		
		printArr(arr, arr.length);
			
	}
	
	//�ζ� ��ȣ ����
	static void func5_5() {
		
		int[] arr = new int[45];
		int ran = 0;
		int temp = 0;
		
	
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0 ; i < arr.length * 3 ; i++) {
		
			ran = (int)(Math.random()*45); // �ε���
			temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		
		// �ζ� ��ȣ ���
		printArr(arr, 7);
				
	}
	
	//���̰� 10�� ������ �迭�� 4�� ��� 10���� ����
	static void func5_6() {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i< arr.length ;i++) {
			arr[i] = 4 * i;
		}
	}

	//���̰� 5�� ������ �迭�� 5���� Ȧ���� �����ϰ�
	//������������ ����
	static void func5_7() {
		
		int[] arr = new int[5];
		
		// 5���� Ȧ���� ����
		for(int i = 0 ; i< arr.length ;i++) {
			arr[i] = i*2 + 1;
		}
		
		//����
		int temp = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i + 1 ; j < arr.length ;j ++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		
		printArr(arr, arr.length);
	}

	//showMaxAndMin �޼����� �׽�Ʈ �ڵ�
	static void func5_8() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		for(int i = 0 ;i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		showMaxAndMin(arr);
						
	}
	
	//���޹��� 1���� ������ �迭��� �� �ִ밪�� �ּҰ��� ��� 
	static void showMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0 ; i<arr.length ;i++) {
			
			if(max < arr[i]) max = arr[i];
			
			if(min > arr[i]) min = arr[i];
			
		}
		
		System.out.println("�ִ밪: " + max + ",   �ּҰ�: " + min);
	
	}
	
	//2���� �迭�� ���� �� ������ �� ���
	static void func5_9() {
		
		int[][] score = {
				{ 100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},
		};
		
		for(int i = 0 ; i< score.length ; i++) {
			for( int j = 0 ; j < score[i].length ; j++)
				System.out.print(score[i][j] + ", ");
			
			System.out.println();
		}
		
		score[2][1] = 0;	
		
	}
	
	//5x3 ������ �迭�� �����ϰ� ����ڷκ��� �Է°��� ����
	static void func5_10() {
		
		int[][] score = new int[5][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ;i < score.length ;i++) {
			for(int j = 0 ; j < score[i].length ;j++)
				score[i][j] = sc.nextInt();
		}
		
		printArr(score);
		
	}
	
	//1���� �迭�� ��Ҹ� ���޹��� len ��ŭ ȭ�鿡 ���
	static void printArr(int[] arr, int len) {
		
		if(len > arr.length) {
			System.out.println("��ȿ���� ���� �Է°��Դϴ�. Ȯ�����ּ���");
			return;
		}
		
		System.out.print("{ ");
		
		for(int i = 0 ; i < len ; i++) {
			
			System.out.print(arr[i] + ", ");		
			
		}
		System.out.print("} ");
	}
	
	//1���� �迭�� ��� ��Ҹ� ���
	static void printArr(int[] arr) {
		System.out.print("{ ");
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + ", ");		
			
		}
		System.out.print("} ");
	}
	
	//2���� �迭�� ��� ��Ҹ� ���
	static void printArr(int[][] arr) {
		for(int i = 0 ; i< arr.length ; i++) {
			for( int j = 0 ; j < arr[i].length ; j++)
				System.out.print(arr[i][j] + ", ");
			
			System.out.println();
		}
	}
	
	
}














