package repractice;

import java.util.ArrayList;

public class CuctomerTest {
	
	public static void main(String[] args) {
		
		String names[] = { "aaa", "bbb", "ccc", "ddd", "eee" };
		ArrayList<Customer> list = new ArrayList<>();
		Customer temp = null;
		
		for(int i = 0 ; i < names.length ; i++) {
			list.add(new Customer(names[i]));
		}
		
		for(int i = 0 ; i < list.size() ; i++) {
			temp = list.get(i);
			System.out.println(temp);
		}

		
		return ;
		
		
//		String names[] = { "aaa", "bbb", "ccc", "ddd", "eee" };
//		
//		Customer arr[] = new Customer[5];
//		
//		for(int i = 0 ; i < arr.length ;i++) {
//			arr[i] = new Customer(names[i]);
//		}
//		
//		for(int i = 0 ; i < arr.length ;i++) {
//			System.out.println(arr[i]);
//		}
		
	}

}
