package objectTest;

public class CardTest {
	public static void main(String[] args) {
		Card cd = new Card();
		cd.id = 1;
		cd.number = 7;
		cd.shape = "��Ʈ";
		cd.width = 4;
		cd.height = 4;
		System.out.println(cd.getInfo());
		
		Card cd2 = new Card();
		cd2.id = 2;
		cd2.number = 7;
		cd2.shape = "��Ʈ";
		
		System.out.println(cd2.getInfo());
	}
}
class Card{
	int id;
	int number;
	
	String shape;
	int width= 100;
	int height= 250;
	
	String getInfo() {
		return "���̴�"+ height +"�ʺ��" + width +"�����" + shape+"���ڴ�"+number;
	}
	
}
