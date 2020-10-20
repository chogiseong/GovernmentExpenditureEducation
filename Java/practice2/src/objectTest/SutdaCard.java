package objectTest;

public class SutdaCard {
	public static void main(String[] args) {
		Card1 cd1 = new Card1(1, true);
		
		System.out.println(cd1.info());
	}
}
class Card1{
	int num ;
	boolean isKwang;
	
	Card1(){
		this(3, false);
	}
	
	Card1(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	void isKwang() {
		if (isKwang = true) {String isKwang = "±¤";}
		else if (isKwang = false) {String isKwang = " ";}
		else;
	}
	
	String info() {
		return "Ä«µå¹øÈ£´Â"+num+"±¤ÀÎ°¡?"+isKwang;
	}
}
