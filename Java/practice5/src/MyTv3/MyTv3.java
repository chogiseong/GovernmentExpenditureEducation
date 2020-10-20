package MyTv3;

public class MyTv3 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prev_channel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	void setChannel(int channel) {
		prev_channel = this.channel;
		this.channel = channel;
	}
	
	int getChannel() {
		return channel;
	}
	void setVolume(int volume) {
		this.volume =volume;

	}
	int getVolume() {
		return volume;
	}
	
	void gotoPrevChannel() {
		int temp;
		temp = channel;
		channel = prev_channel;
		prev_channel = temp;
	}
	
	
	//ispoweron channel volume 을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 멤버변수들을 어디서나 읽고 변경할 수 있도록 getter와 setter
}
/*
class Exercise7_10{
	public static void main(String args[]) {
		MyTv3 t = new MyTv3();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
	}
}
*/
class Exercise7_11{
	public static void main(String args[]) {
		MyTv3 t = new MyTv3();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.setChannel(30);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}