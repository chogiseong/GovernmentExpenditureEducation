package repractice;

import java.util.ArrayList;

//customerŬ���� ����
//string �̸�
//string ���̵�
//int ��ǰ��ȣ
public class repractice {
	public static void main(String[] arg) {
		String names[] = {"aaa","bbb","ccc","ddd","eee"};
		ArrayList<Customer> list = new ArrayList<>();
		Customer temp = null;
		
		for(int i = 0;i <names.length;i++) {
			list.add(new Customer(names[i], i));
		}
		for(int i = 0; i < list.size(); i++) {
			list.get(i)
		}
		return;
		
		/*
		
		
		Customer[] c = new Customer[5];
		for(int i =0; i< c.length; i++) {
			c[i] = new Customer("cho"+i, i);
		}
		for(int i =0; i< c.length;i++) {
			System.out.println("+++++++++++++++");
			c[i].show();
		}
		*/
		
	}//main

}
class Customer{
	String name;
	String ID;
	int product_num;
	
	static int cnt;
	
	void setter_num(int product_num) {
		this.product_num = product_num;
	}
	
	int getter_num() {
		return product_num;
	}
	
	String getter_ID() {
		return ID;
	}
	
	Customer(String ID, int product_num){
		this.name = name;
		cnt++;
			this.product_num = product_num;
		}
	
	void show() {
		System.out.println("ID��"+getter_ID()+"��ǰ��ȣ��"+getter_num());
	}
}