package objectTest;

public class practice3 {
	public static void main(String[] args) {
		/*
		//기본예제
		Tv tv1 = new Tv();
		tv1.color = "흑백";
		tv1.channel = 7;
		
		Tv tv2 = new Tv();
		tv2.color = "컬러";
		tv2.channel = 11;
		tv2.channelDown();
		*/
		
		/*
		//t2값 t1으로 바꾸기
		Tv t;
		t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재채널은"+t.channel+"입니다.");
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t2 = t1;
		t1.channel = 7;
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		*/
		
		//private으로 인해 채널과 볼륨에 직접 영향을 줄 수 없어 셑채널 셑볼륨 사용
		Tv tv = new Tv();
		tv.power = true;
		tv.setChannel(11);
		tv.setVolume(10);
		
		//볼륨값을 모를시 겟볼륨에서 값을 얻어와 셑볼륨에서 증가시켜줄 수 있다.
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
	
	//메서드 :
	//getChannel
	//기능 - 멤버인 channel의 값을 반환
	//매개변수 - 없음
	//반환값: int
	int getChannel() {
		return channel;
	}
	
	//getVolume
	//기능 - 멤버인 volume의 값을 반환
	//매개변수 - 없음
	//반환값 - int
	int getVolume() {
		return volume;
	}
	//setChannel
	//기능 - 전달받은 정수값을 channel에 저장
	//매개변수 - 한 개의 정수
	
	void setChannel(int num) {
		channel = num;
	}
	//setVolume
	//기능 - 전달받은 정수값을 volume에 저장
	//매개변수 - 한 개의 정수
	
	void setVolume(int num) {
		volume = num;
	}
	
	//getInfo
	//기능 : 멤버변수 값들을 문자열로 만들어서 반환
	//매개변수 업음
	//반환값 : String
	
	String getInfo() {
		String pwr = (power)? "켜짐" : "꺼짐";
		return "전원은 " + pwr + ", 채널은 " + getChannel() + "번, 볼륨은" + getVolume() + "입니다.";
	}
	//powerOnOff - 기능: power 값을 반전, 매개변수 및 반환값 없음
	
	void powerOnOff() {
		if (power = false) {power = true;}
		else if (power = true) {power = false;}
		else;
		}
	}


