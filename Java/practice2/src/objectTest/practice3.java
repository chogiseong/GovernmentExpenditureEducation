package objectTest;

public class practice3 {
	public static void main(String[] args) {
		/*
		//�⺻����
		Tv tv1 = new Tv();
		tv1.color = "���";
		tv1.channel = 7;
		
		Tv tv2 = new Tv();
		tv2.color = "�÷�";
		tv2.channel = 11;
		tv2.channelDown();
		*/
		
		/*
		//t2�� t1���� �ٲٱ�
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("����ä����"+t.channel+"�Դϴ�.");
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		*/
		
		//private���� ���� ä�ΰ� ������ ���� ������ �� �� ���� �Vä�� �V���� ���
		Tv tv = new Tv();
		tv.power = true;
		tv.setChannel(11);
		tv.setVolume(10);
		
		//�������� �𸦽� �ٺ������� ���� ���� �V�������� ���������� �� �ִ�.
		int vol = tv.getVolume();
		tv.setVolume(vol + 5);
		
		System.out.println(tv.getInfo());
	}
}

class Tv{
	String color;
	boolean power = false;
	private int channel;
	private int volume;
	
	void power() {power=!power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	void volumeUp() {volume++;}
	void volumeDown() {volume--;}
	
	//�޼��� :
	//getChannel
	//��� - ����� channel�� ���� ��ȯ
	//�Ű����� - ����
	//��ȯ��: int
	int getChannel() {
		return channel;
	}
	
	//getVolume
	//��� - ����� volume�� ���� ��ȯ
	//�Ű����� - ����
	//��ȯ�� - int
	int getVolume() {
		return volume;
	}
	//setChannel
	//��� - ���޹��� �������� channel�� ����
	//�Ű����� - �� ���� ����
	
	void setChannel(int num) {
		channel = num;
	}
	//setVolume
	//��� - ���޹��� �������� volume�� ����
	//�Ű����� - �� ���� ����
	
	void setVolume(int num) {
		volume = num;
	}
	
	//getInfo
	//��� : ������� ������ ���ڿ��� ���� ��ȯ
	//�Ű����� ����
	//��ȯ�� : String
	
	String getInfo() {
		String pwr = (power)? "����" : "����";
		return "������ " + pwr + ", ä���� " + getChannel() + "��, ������" + getVolume() + "�Դϴ�.";
	}
	//powerOnOff - ���: power ���� ����, �Ű����� �� ��ȯ�� ����
	
	void powerOnOff() {
		if (power = false) {power = true;}
		else if (power = true) {power = false;}
		else;
		}
	}


