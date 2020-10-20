package CardGame;

import java.util.Scanner;

public class CardGame{

   public static void main(String[] args) {
      Deck de = new Deck();
      Game gm = new Game();
      
      Scanner sc = new Scanner(System.in);
      int a, b;
      boolean pi = true;
      
      // 카드리스트
      System.out.println("++++++++++카드리스트++++++++++");
      for(int i=0; i<52;i++)
         System.out.println(de.c[i].toString_card());
      
      // 셔플
      de.shuffle();
      System.out.println("딜러 : 카드셔플완료.");
      
      // 자동 드로
      while (pi) {
         System.out.println("딜러 : 셔플된 덱에서 자동으로 카드 두 장을 뽑습니다.");
         a = (int) (Math.random()*52)+1;
         b = (int) (Math.random()*52)+1;
         
         // 게임
         Card card1 = de.pick(a);
         System.out.println(card1.toString_card());
         Card card2 = de.pick(b);
         System.out.println(card2.toString_card());
         System.out.println("딜러 : 당신의 카드 합은 " + (card1.number+card2.number) + "입니다.");
         gm.BlackJack(card1.number+card2.number);
         
         // 특수룰
         if (card1.number == 1 && card1.number+card2.number <10) {
        	 System.out.println("딜러 : 특수 룰 적용.");
        	 System.out.println("딜러 : 당신의 카드 합은 " + (card1.number+card2.number+9) + "입니다.");
        	 gm.BlackJack(card1.number+card2.number+9);
         }
         else if (card2.number == 1 && card1.number+card2.number <10) {
        	 System.out.println("딜러 : 특수 룰 적용.");
        	 System.out.println("딜러 : 당신의 카드 합은 " + (card1.number+card2.number+9) + "입니다.");
        	 gm.BlackJack(card1.number+card2.number+9);
         }
         
         break;
         }
      }
}
   

class Deck {
   final int CARD_NUM = 52;
   Card c[] = new Card[CARD_NUM];

   Deck() {
      int i = 0;
      for (int k = Card.KIND_MAX; k > 0; k--) {
         for (int n = 1; n < Card.NUM_MAX + 1; n++) {
            c[i++] = new Card(k, n);
         }
      }
   }

   Card pick(int index) {
      if (0 <= index - 1 && index - 1 < CARD_NUM)
         return c[index - 1];
      else
         return pick();
   }

   Card pick() {
      return null;
   }

   void shuffle() {
      int ran = 0;
      Card temp = new Card();
      for (int i = 0; i < 1000; i++) {
         ran = (int) (Math.random() * CARD_NUM);
         temp = c[0];
         c[0] = c[ran];
         c[ran] = temp;
      }
   }
}
class Game {
	void BlackJack(int num_str){
		int x = (int) (Math.random()*26)+1;
		System.out.println("딜러 : 제 카드 합은 "+ x + "입니다.");
			   if (21-x > 21-num_str) {
				   System.out.println("딜러가 졌습니다.");
			   }
			   else if (x>21) {
				   System.out.println("딜러가 졌습니다.");
			   }
			   else if (num_str>21) {
				   System.out.println("딜러가 이겼습니다.");
			   }
			   else if (21-x < 21-num_str) {
				   System.out.println("딜러가 이겼습니다.");
			   }
			   else if (21-x == 21-num_str) {
				   System.out.println("비겼습니다.");
			   }
	   }
}
class Card {
   static final int KIND_MAX = 4; // 카드 무늬의 수
   static final int NUM_MAX = 13; // 무늬별 카드 수
   static final int SPADE = 4;
   static final int DIAMOND = 3;
   static final int HEART = 2;
   static final int CLOVER = 1;

   int kind, number;

   Card() {
      this(4,1);
   }

   Card(int kind, int number) {
      this.kind = kind;
      this.number = number;
   }

   String toString_card() {
      String kind_str, num_str = "";
      String[] num_str_list = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
      
      if (kind == 4) {kind_str = "SPADE";} 
      else if (kind == 3) {kind_str = "DIAMOND";} 
      else if (kind == 2) {kind_str = "HEART";} 
      else if (kind == 1) {kind_str = "CLOVER";} 
      else kind_str = "SPADE";
      
      for (int i = 1; i < 14; i++) {
         if (number == i) {num_str = num_str_list[i - 1];}
      }
      return "+++++     " + kind_str + "  " + num_str + "     +++++";
   }
}
