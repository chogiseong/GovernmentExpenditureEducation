package practice1;

public class Example4 {
	public static void main(String[] args) {
		func9();
	}
	
	static void func1() {
		
		int sum = 0;

		for (int i = 1; i <= 20; i++) {

			if (i%2 != 0 && i%3 != 0)
				sum += i;
		}
		
		System.out.println("합은 " + sum);
	}
	
	static void func2() {
		
		int sum=0, total_sum = 0;
		
//		for(int i = 1 ; i <= 10 ; i++ ) {
//			sum += i;
//			total_sum += sum;
//		}
		
//		int sum = 0;
		for( int i = 1 ; i <= 10 ; i++)
			for(int j = 1 ; j <= i ; j++ )
				sum += j;

		System.out.println("결과는 " + sum);

		
//		System.out.println(total_sum);
	}
	
	static void func3() {
		
		int num = 0, sum = 0; 
		
		while(sum < 100) {
			num++;
			sum += (num%2==0) ? -num : num;
		}
		
		System.out.println(num);
		
	}
	
	static void func4() {
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//			}
		
		int i = 0;
		while(i<10) {
			int  j = 0;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	static void func5() {
		for(int i = 1 ; i <= 6 ; i++)
			for(int j = 1 ; j <=6 ; j++)
			{
				if(i+j == 6) {
					System.out.println(i + ", " + j);
				}
			}
	}
	
	static void func6() {
		int value = (int)(Math.random()*6) + 1;
		System.out.println(value);
		
	}
	
	static void fun7() {
		
		for(int x = 0 ; x <= 10 ; x++)
			for(int y = 0 ; y<=10 ; y++) {
				if((2*x + 4*y)== 10) {
					System.out.println(x + ", " +y);
				}
			}
	}
	
	static void func8() {
		String str = "12345";
		int sum = 0;
		int temp = 0;
		
		for(int i = 0 ; i<str.length() ;i++) {
//			sum += str.charAt(i) - '0';
			temp = str.charAt(i) - '0';
			sum += temp;
		}
		
		System.out.println("sum : " + sum);
	}
	
	static void func9() {
		int num = 12345;
		int sum = 0;
		
		while(num>0) {
			sum += num%10;
			num = num/10;
		}
		
		System.out.println("sum : " + sum);
	}

}










