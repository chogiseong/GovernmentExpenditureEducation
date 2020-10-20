package repractice;

public class Customer1 {
	
	String name;
	String id;
	int product_no;
	static int cnt;
	
	Customer1(String name){
		this.name = name;
		
		cnt++;
		id = "°í°´¾ÆÀÌµð_" + cnt;
	}
	
	void setProductNo(int no) {
		product_no = no;
	}
	
	int getProductNo() {
		return product_no;
	}
	
	String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + id;
	}

}
