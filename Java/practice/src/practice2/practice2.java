package practice2;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		//func2_1();
		//func2_2();
		//func2_3();
		//func2_4();
		//func2_5();
		//func2_6();
		//func2_7();
		//func2_8();
		//func2_9();
		//func2_10();
		//func2_11();
		//func2_12();
		func2_13();
	}

	private static void func2_1() {
		Scanner scan = new Scanner(System.in);

		int[] scores = new int[5];
		
		for(int i = 0; i <= 4; i++) {
			scores[i] = scan.nextInt();
			}
		
		for(int y = 0; y <= 4; y++) {
			System.out.println(scores[y]);
		}
	}
	private static void func2_2() {
		Scanner scan = new Scanner(System.in);

		int[] score2 = new int[5];
		
		for(int i = 0; i <=4; i++) {
			score2[i] = (int) (Math.random()*45)+1;
		}
		for(int y = 0; y <= 4; y++) {
			System.out.println(score2[y]);
		}
	}
	private static void func2_3() {
		int i;
		int[] arr = {10,20,30,40,50};
		int sum = 0;
		for(i=0; i<5; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
	private static void func2_4() {
		int[]ball=new int[45];
		
		for(int i = 0; i<ball.length; i++)
			ball[i] = i+1;
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < 100; i++) {
			j = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[j];
			ball[j]=temp;
		}
		for(int i =0; i<6;i++) {
			System.out.println(ball[i]+" ");
		}
	}
	private static void func2_5() {
		//길이 5 선언 후 1부터 5까지 정수로 초기화
		int[] arr = new int[5];
		int ran = 0;
		int temp = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int x = 0; x< 30; x ++) {
			ran = (int)(Math.random()*arr.length);
			temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;
		}
		
		for(int x =0; x<5;x++) {
			System.out.println(arr[x]+" ");
		}
	}
	private static void func2_6() {
		int[]ball=new int[45];
		
		for(int i = 0; i<ball.length; i++)
			ball[i] = i+1;
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < 100; i++) {
			j = (int)(Math.random()*45);
			temp = ball[0];
			ball[0] = ball[j];
			ball[j]=temp;
		}
		for(int i =0; i<7;i++) {
			System.out.println(ball[i]+" ");
		}
	}
	private static void func2_7() {
		int[]arr=new int[10];
		
		for(int i = 1; i < 10 ; i ++) {
			arr[i]=i*4;
		}
		for(int y =0; y<10;y++) {
			System.out.println(arr[y]+" ");
		}
	}
	private static void func2_8() {
		int[]arr=new int[5];
		
		for(int i = 0; i < 5; i++) {
				arr[i] = (int)(Math.random()*5)+1;
				}
		func_array(arr);
	}
	private static void func2_9() {
		int[]arr=new int[5];
		int temp = 0;
		
		for(int i = 0; i < 5; i++) {
				arr[i]=i*2+1;
				}
		
		for (int x = 0; x < arr.length; x ++) {
			for(int y = 0; y < arr.length; y ++) {
				if (arr[x] > arr[y]) {
					temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					}
				}
			}
		func_array(arr);
	}
	private static void func2_10() {
		Scanner scan = new Scanner(System.in);
		int[]arr=new int[5];
		int temp = 0;
		for(int i =0; i <5 ; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x = 0; x < arr.length; x ++) {
			for(int y = 0; y < arr.length; y ++) {
				if (arr[x] > arr[y]) {
					temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
					}
				}
			}
		System.out.println(arr[0]);
		func2_11(arr);
	}
	private static void func2_11(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		int temp = 0;
		for(int i =0; i <5 ; i++) {
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
	}
	private static void func2_12() {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
				
		};
		for(int x =0; x< score.length;x++) {
			for(int y =0; y< score[x].length;y++) {
				System.out.print(score[x][y]);
			}
			System.out.println(" , ");
		}
		score[2][1] = 0;
		System.out.println(score[2][1]);
			
	}
	private static void func2_13() {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[5][3];
		
		
		for(int x =0; x< score.length;x++) {
			for(int y =0; y< score[x].length;y++) {
				int temp;
				temp = scan.nextInt();
				score[x][y] = temp;
			}
		}
		func_double_array(score, score.length, score[0].length);
	}
	
	
///////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
	static void func_double_array(int[][] score, int row, int col) {
		for(int x =0; x< row;x++) {
			for(int y =0; y< col;y++) {
				System.out.print(score[x][y]);
				System.out.print(" , ");
			}
			System.out.println(" ");
		}
	}
	static void func_array(int[] arr) {
		System.out.print("{ ");
		for(int x =0; x< arr.length;x++) {System.out.print(arr[x]+",");}
		System.out.println(" }");
	}
	static void func_array(int[] arr, int len) {
		if(len > arr.length) {
			System.out.println("유효하지 않은 입력값입니다.");
			return;
		}
		System.out.print("{ ");
		for(int x =0; x< len;x++) {System.out.print(arr[x]+",");}
		System.out.println(" }");
	}
}
