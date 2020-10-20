//package ex7;
//
//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM];
//
//	SutdaDeck() {
//		int num = 0;
//		boolean isKwang = false;
//		for (int i = 0; i < cards.length; i++) {
//			num = (i + 1) % 10;
//			if (num == 0)
//				num = 10;
//			isKwang = ((i == 0 || i == 2 || i == 7) && (i < 10)) ? true : false;
//			// isKwang = i < 10 && (n==1 || n==3 || n==8);
//			cards[i] = new SutdaCard(num, isKwang);
//		}
//	}
//
//	/*
//	 * (1) 위에 정의된 세 개의 메서드를 작성하시오.
//	 */
//	void shuffle() {
//
//		int rdm_1, rdm_2;
//		SutdaCard temp_card;
//
//		for (int i = 0; i < cards.length * 2; i++) {
//			rdm_1 = (int) (Math.random() * cards.length);
//			rdm_2 = (int) (Math.random() * cards.length);
//
//			temp_card = cards[rdm_1];
//			cards[rdm_1] = cards[rdm_2];
//			cards[rdm_2] = temp_card;
//		}
//	}
//
//	SutdaCard pick(int index) {
//		if (index < 0 || index >= cards.length) {
//			System.out.println("pick:잘못된 매개변수");
//			return null;
//		}
//		return cards[index];
//	}
//
//	SutdaCard pick() {
//		return pick((int) (Math.random() * cards.length));
//	}
//
//} // SutdaDeck
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
//	public String toString() {
//		return num + (isKwang ? "K" : "");
//	}
//}
//
//class Exercise7_2 {
//	public static void main(String args[]) {
//		SutdaDeck deck = new SutdaDeck();
//
//		System.out.println(deck.pick(0));
//		System.out.println(deck.pick());
//		deck.shuffle();
//
//		for (int i = 0; i < deck.cards.length; i++)
//			System.out.print(deck.cards[i] + ",");
//
//		System.out.println();
//		System.out.println(deck.pick(0));
//	}
//}
