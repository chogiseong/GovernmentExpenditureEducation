package CardGame;

public class DeckTest2_pre {
	public static void main(String args[])
	{
		Deck d = new Deck();
	}

}

class Deck{
	final int CARD_NUM = 52;
	Card c[] = new Card[CARD_NUM];
}

class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
}