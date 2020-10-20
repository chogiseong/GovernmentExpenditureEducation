package test;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		MyClass mc1= MyClass.getInstance();
		MyClass mc2 = MyClass.getInstance();
	}

}
class MyClass{
	int num;
	static MyClass mine;
	
	private MyClass(){
		
	}
	
	void method_test() {
		
	}
	
	static MyClass getInstance(){
		
		if(mine == null) {
			mine = new MyClass();
		}
		return mine;
	}
}