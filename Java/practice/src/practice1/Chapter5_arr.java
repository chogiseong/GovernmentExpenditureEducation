package practice1;

import java.util.Scanner;

public class Chapter5_arr {
	
	public static void main(String[] args) {
		func5_10();
	}
	
	//길이가 5인 정수형 배열을 만들고 사용자로부터 받은 입력값을 저장
	static void func5_1() {
		
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
	
		//입력
		for(int i = 0 ; i < score.length ; i++) {
			
			score[i] = sc.nextInt();
			
		}
		
		printArr(score);
			
	}

	//길이가 5인 정수형 배열에 1부터 45까지의 난수를 저장
	static void func5_2() {
		int arr[] = new int[5];
		
		for(int i = 0 ;i < arr.length ;i++) {
			arr[i] = (int)(Math.random()*45) + 1;
		}
		
		//출력
		printArr(arr);
		
	}
	
	// 정수형 배열의 모든 요소 값의 합 구하기
	static void func5_3() {
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum: " + sum );
	}
	
	//길이가 5인 배열을 선언하고 1부터 5까지의 정수로 초기화한후
	//뒤섞어 주기
	static void func5_4() {
		
		int[] arr = new int[5];
		int ran = 0;
		int temp = 0;
		
	
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0 ; i < 20 ; i++) {
		
			ran = (int)(Math.random()*5); // 인덱스
			temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		
		
		printArr(arr, arr.length);
			
	}
	
	//로또 번호 생성
	static void func5_5() {
		
		int[] arr = new int[45];
		int ran = 0;
		int temp = 0;
		
	
		for(int i = 0 ; i< arr.length ; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0 ; i < arr.length * 3 ; i++) {
		
			ran = (int)(Math.random()*45); // 인덱스
			temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		
		// 로또 번호 출력
		printArr(arr, 7);
				
	}
	
	//길이가 10인 정수형 배열게 4의 배수 10개를 저장
	static void func5_6() {
		
		int[] arr = new int[10];
		
		for(int i = 0 ; i< arr.length ;i++) {
			arr[i] = 4 * i;
		}
	}

	//길이가 5인 정수형 배열에 5개의 홀수를 저장하고
	//내림차순으로 정렬
	static void func5_7() {
		
		int[] arr = new int[5];
		
		// 5개의 홀수를 저장
		for(int i = 0 ; i< arr.length ;i++) {
			arr[i] = i*2 + 1;
		}
		
		//정렬
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

	//showMaxAndMin 메서드의 테스트 코드
	static void func5_8() {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
		for(int i = 0 ;i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		showMaxAndMin(arr);
						
	}
	
	//전달받은 1차원 정수형 배열요소 중 최대값과 최소값을 출력 
	static void showMaxAndMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0 ; i<arr.length ;i++) {
			
			if(max < arr[i]) max = arr[i];
			
			if(min > arr[i]) min = arr[i];
			
		}
		
		System.out.println("최대값: " + max + ",   최소값: " + min);
	
	}
	
	//2차원 배열을 선언 및 생성한 후 출력
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
	
	//5x3 정수형 배열을 생성하고 사용자로부터 입력값을 저장
	static void func5_10() {
		
		int[][] score = new int[5][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ;i < score.length ;i++) {
			for(int j = 0 ; j < score[i].length ;j++)
				score[i][j] = sc.nextInt();
		}
		
		printArr(score);
		
	}
	
	//1차원 배열의 요소를 전달받은 len 만큼 화면에 출력
	static void printArr(int[] arr, int len) {
		
		if(len > arr.length) {
			System.out.println("유효하지 않은 입력값입니다. 확인해주세요");
			return;
		}
		
		System.out.print("{ ");
		
		for(int i = 0 ; i < len ; i++) {
			
			System.out.print(arr[i] + ", ");		
			
		}
		System.out.print("} ");
	}
	
	//1차원 배열의 모든 요소를 출력
	static void printArr(int[] arr) {
		System.out.print("{ ");
		for(int i = 0 ; i < arr.length ; i++) {
			
			System.out.print(arr[i] + ", ");		
			
		}
		System.out.print("} ");
	}
	
	//2차원 배열의 모든 요소를 출력
	static void printArr(int[][] arr) {
		for(int i = 0 ; i< arr.length ; i++) {
			for( int j = 0 ; j < arr[i].length ; j++)
				System.out.print(arr[i][j] + ", ");
			
			System.out.println();
		}
	}
	
	
}














