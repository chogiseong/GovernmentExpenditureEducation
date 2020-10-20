package SutdaCard;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		//SutdaCard �迭 �ʱ�ȭ
		
			int NUM = 0;
			boolean IS_KWANG = false;
			for(int i = 0; i < cards.length ; i++) {
				NUM = (i + 1)%10;
				if (NUM == 0) NUM = 10;
				if(i<10 && (NUM==1 || NUM ==3 || NUM==8)) IS_KWANG = true;
				cards[i] = new SutdaCard(NUM,IS_KWANG);
				IS_KWANG = false;
				
				
					}
				}
			}

final class SutdaCard{
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard(){
		this(1, true);
	}
	SutdaCard(int NUM, boolean IS_KWANG){
		this.NUM=NUM;
		this.IS_KWANG = IS_KWANG;
	}
	
	public String toString() {
		//info ��� objectŬ������ toString�� �������̵� ��
		return NUM + (IS_KWANG ? "K":"");
	}
}

class Exercise7_1{
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i = 0; i < deck.cards.length; i++)
			System.out.println(deck.cards[i]+",");
	}
}