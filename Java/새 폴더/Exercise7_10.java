//package ex7;	// ������
//class MyTv2 {
//	private boolean isPowerOn;
//	private int     channel;
//	private int     volume;
//
//	final int MAX_VOLUME  = 100;
//	final int MIN_VOLUME  = 0;
//	final int MAX_CHANNEL = 100;
//	final int MIN_CHANNEL = 1;
//
//	/*
//		(1) �˸��� �ڵ带 �־� �ϼ��Ͻÿ�.
//	*/
//	public void setChannel(int channel){
//		if(channel<MIN_CHANNEL || channel>MAX_CHANNEL) return;
//		
//		this.channel = channel;
//	}
//	
//	public int getChannel(){
//		return channel;
//	}
//	
//	public void setVolume(int volume){
//		if(volume<MIN_VOLUME || volume>MAX_VOLUME) return;
//		this.volume = volume;
//	}
//	
//	public int getVolume(){
//		return volume;
//	}
//}
//
//class Exercise7_10 {
//	public static void main(String args[]) {
//		MyTv2 t = new MyTv2();
//
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:"+t.getVolume());
//	}
//}
//
