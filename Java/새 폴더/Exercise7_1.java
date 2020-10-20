//package ex7; // 오버라이딩 toString
//
//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//	SutdaDeck() {
//		/*
//		   (1) SutdaCard배열을 적절히 초기화 하시오.
//		*/
//		int num = 0;
//		boolean isKwang = false;
//		for(int i = 0 ; i < cards.length ; i++) {
//			num = (i+ 1)%10;
//			if(num==0) num = 10;
//			isKwang = ((num==1 || num==3 || num==8) && (i<10))? true : false;
//			cards[i] = new SutdaCard(num, isKwang);
//			
//		}
//
//	}
//	
//
//}
//
//class SutdaCard {
//	int num;
//	boolean isKwang;
//
//	SutdaCard() {
//		this(1, true);
//	}
//
//	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//	public String toString() {	// info()대신 Object클래스의 toString()을 오버라이딩 했다.
//		return num + ( isKwang ? "K":"");
//	}
//}
//
//class Exercise7_1 {
//	public static void main(String args[]) {
//		SutdaDeck deck = new SutdaDeck();
//
//		for(int i=0; i < deck.cards.length;i++)
//			System.out.print(deck.cards[i]+",");
//	}
// }
