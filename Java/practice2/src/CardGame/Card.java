package CardGame;

class Card {
	int kind;
	int number;
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	String ToString() {
	
		String kindstr = "";
		String numberstr = "";
		if (kind ==1) kindstr = "CLOVER";
		else if (kind ==2) kindstr = "HEART";
		else if (kind ==3) kindstr = "DIAMOND";
		else if (kind ==4) kindstr = "SPADE";
		
		if (number == 11) numberstr = "J";
		else if (number == 12) numberstr = "Q";
		else if (number == 13) numberstr = "K";
		else
			for(int i = 1; i < 11; i ++) {
				if (number == i) {
					numberstr = String.valueOf(number);
				}
			}
		return "("+kindstr + "," + numberstr +")";
	}
}



