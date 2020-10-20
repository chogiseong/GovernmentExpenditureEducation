package practice1;

import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		func_5();
		func_4();
		func_3();
		func_2();
		func_1();
	}
	static void func_1() {
		//한번입력받아 여러가지 출력하기
		/*
		Scanner scan = new Scanner(System.in);
		
		int hour;
		int min;
		int sec = scan.nextInt();
		int sec1;
		int min1;
		int hour1;
		
		
		min = sec/60;
		hour = min/60;
		sec1 = sec%60;
		min1 = min%60;
		hour1 = hour%60;
		
		System.out.println(hour1 + "시" + min1 + "분"+ sec1 + "초");
		*/
		/*
		byte b = 127; //128부턴 안댐
		b = (byte)(b+1);//-128
		char ch = 'A';
		String str = "AB";
		//ch = ''; 캐릭터는 빈문자 불가능
		//str = ""; 스트링은 가능
		System.out.println(str + ch);
		str = "" + 7;
		str = "" + 7 + 7;//77
		str = 7 + 7 + "";//14
		*/
		/* 형변환
		float f = 1.5f;
		int i = (int)f;
		*/
		/* 연산 전후
		int i ;
		int j ;
		
		i = 5 ; j = 0;
		j = ++ i;
		
		System.out.println("j=++i; 실행 후 j는" + j + ", i 는" + i);
		
		i = 5; j = 0;
		j = i++;
		
		System.out.println("j=i++; 실행 후 j는" + j + ", i 는" + i);
		*/
	}
	static void func_2() {
		/*
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b);
		System.out.println(c);
		
		int x = 1000000;
		int y = 
		*/
		/* 형변환 심화
		float pi = 3.141592f;
		float section1 = pi * 1000;
		float section2 = Math.round(section1);
		System.out.println(section2/1000);
		pi = ((int)(pi*1000))/1000F;
		System.out.println(pi);
		*/
	}
	static void func_3() {
		/* 스위치케이스
		double num1, num2, result;
		
		char op;
		Scanner scan = new Scanner(System.in);
		System.out.println("첫째수");
		num1 = scan.nextInt();
		System.out.println("둘째수");
		num2 = scan.nextInt();
		System.out.println("사칙연산입력");
		String str_op = (scan.next());
		op = str_op.charAt(0);
		
		switch(op) 
		{
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '/':
			if (num2 == 0) {break;}
			else {
			result = num1 / num2;
			System.out.println(result);
			break;
			}
		}
		*/
	
		
		//if(num%2==0) {System.out.println("짝수");}
		//else {System.out.println("홀수");}
		/*
		if(num <= 100 & num > 0)
		{
			if(num>= 90) {System.out.println("a");}
			else if(num >= 80) {System.out.println("b");}
			else if(num >= 70) {System.out.println("c");}
			else if(num >= 60) {System.out.println("d");}
			else if(num >= 50) {System.out.println("e");}
			else {System.out.println("f");}
		}
		else {System.out.println("0~100입력하세요");}
		*/
		
	}
	static void func_4() {
		//1부터10사이의 정수를 랜덤하게 출력
		//(int)(Math.random()*10)+1
		//구구단
		/*
		int z = 0;
		for(int x = 1; x < 10; x ++)
		{ for (int y = 1 ; y <10; y++) {
			z = x * y;
			System.out.println(x+"*"+y+"="+z);
		}
		}
		*/
		//while 문 사용
		/*
		char op;
		
		char ch = 1;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while(ch != 'q') {
			func_3();
			System.out.println("종료를원하면 q를눌러라");
			
			str = sc.next();
			ch = str.charAt(0);
		}
		System.out.println("프로그램종료");
		*/
		
	}
	static void func_5() {
		/*
		//break문 사용
		int sum = 0;
		int i = 0;
		
		while(true) {
			if (sum>100)
				break;
			i++;
			sum+=i;
		}
		System.out.println("i =" +i);
		System.out.println("sum = "+sum);
		*/
		
		/*
		//1
		int x, y, z;
		y = 0;
		z = 0;
		for (x = 1 ;x <= 20 ;x ++) {
			if (x%2 != 0 && x%3 !=0){	
				z += x;
				}
		}
		System.out.println(z);
		*/
		
		/*
		//2
		int a,b,c,d;
		b = 0;
		c = 0;
		d = 0;
		for(c=1; c<=10;c++) {
			for(a=1; a<=c;a++) {b += a;}
			}
			
		System.out.println(b);
		*/
		
		//3
		int x, y, z;
		for(x=0; x >=100;x++) {}
		}
		
	
	}

