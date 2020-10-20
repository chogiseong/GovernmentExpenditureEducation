package CardGame;

public class Deck {
	final int CARD_NUM = 52;
	Card c[] = new Card[CARD_NUM];
	
	Deck() {
		int i = 0;
		for(int k = Card.KIND_MAX; k > 0 ; k--) {
			for(int n = 1; n < Card.NUM_MAX +1; n++) {
				c[i++] = new Card(kind, name);
			}
		}
	}
	
	Card pick(int index) {
		if(0<= index && index < CARD_NUM)
			return c[index];
		else
			return pick();
	}
	Card pick() {
		//deck에서 카드 하나 선택 기능
		return null;
	}
	void shuffle() {
		int shuf = 0;
		for(int k = Card.KIND_MAX; k > 0 ; k--) {
			for(int n = 1; n < Card.NUM_MAX +1; n++) {
				
			}
		}
		//카드 순서 섞음
	}

}
