package ex7;

public class Exercise7_5 {
	
	public static void main(String[] args) {
		Tv t = new Tv(100);
//		System.out.println(t);
	}

}

class Product{
	int price;
	int bonuspoint;
	
	public Product(int price) {
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(int price){
		super(price);
	}
	
	@Override
	public String toString() {
		return "TV - price : " + price + ", bonuspoint : " + bonuspoint;
	}
}
