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
		//�ѹ��Է¹޾� �������� ����ϱ�
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
		
		System.out.println(hour1 + "��" + min1 + "��"+ sec1 + "��");
		*/
		/*
		byte b = 127; //128���� �ȴ�
		b = (byte)(b+1);//-128
		char ch = 'A';
		String str = "AB";
		//ch = ''; ĳ���ʹ� ���� �Ұ���
		//str = ""; ��Ʈ���� ����
		System.out.println(str + ch);
		str = "" + 7;
		str = "" + 7 + 7;//77
		str = 7 + 7 + "";//14
		*/
		/* ����ȯ
		float f = 1.5f;
		int i = (int)f;
		*/
		/* ���� ����
		int i ;
		int j ;
		
		i = 5 ; j = 0;
		j = ++ i;
		
		System.out.println("j=++i; ���� �� j��" + j + ", i ��" + i);
		
		i = 5; j = 0;
		j = i++;
		
		System.out.println("j=i++; ���� �� j��" + j + ", i ��" + i);
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
		/* ����ȯ ��ȭ
		float pi = 3.141592f;
		float section1 = pi * 1000;
		float section2 = Math.round(section1);
		System.out.println(section2/1000);
		pi = ((int)(pi*1000))/1000F;
		System.out.println(pi);
		*/
	}
	static void func_3() {
		/* ����ġ���̽�
		double num1, num2, result;
		
		char op;
		Scanner scan = new Scanner(System.in);
		System.out.println("ù°��");
		num1 = scan.nextInt();
		System.out.println("��°��");
		num2 = scan.nextInt();
		System.out.println("��Ģ�����Է�");
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
	
		
		//if(num%2==0) {System.out.println("¦��");}
		//else {System.out.println("Ȧ��");}
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
		else {System.out.println("0~100�Է��ϼ���");}
		*/
		
	}
	static void func_4() {
		//1����10������ ������ �����ϰ� ���
		//(int)(Math.random()*10)+1
		//������
		/*
		int z = 0;
		for(int x = 1; x < 10; x ++)
		{ for (int y = 1 ; y <10; y++) {
			z = x * y;
			System.out.println(x+"*"+y+"="+z);
		}
		}
		*/
		//while �� ���
		/*
		char op;
		
		char ch = 1;
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		while(ch != 'q') {
			func_3();
			System.out.println("���Ḧ���ϸ� q��������");
			
			str = sc.next();
			ch = str.charAt(0);
		}
		System.out.println("���α׷�����");
		*/
		
	}
	static void func_5() {
		/*
		//break�� ���
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

