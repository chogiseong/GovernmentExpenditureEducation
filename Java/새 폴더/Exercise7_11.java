//package ex7;
//class MyTv2 {
//	private boolean isPowerOn;
//	private int     channel;
//	private int     volume;
//	private int		prevChannel;
//
//	final int MAX_VOLUME  = 100;
//	final int MIN_VOLUME  = 0;
//	final int MAX_CHANNEL = 100;
//	final int MIN_CHANNEL = 1;
//
//	/*
//		(1) 알맞은 코드를 넣어 완성하시오.
//	*/
//	public void setChannel(int channel){
//		if(channel<MIN_CHANNEL || channel>MAX_CHANNEL) return;
//		
//		prevChannel = this.channel;
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
//	
//	public void gotoPrevChannel(){
//		setChannel(prevChannel);
//	}
//}
//
//class Exercise7_11 {
//	public static void main(String args[]) {
//		MyTv2 t = new MyTv2();
//
//		t.setChannel(10);
//		System.out.println("CH:"+t.getChannel());
//		t.setChannel(20);
//		System.out.println("CH:"+t.getChannel());
//		t.gotoPrevChannel();
//		System.out.println("CH:"+t.getChannel());
//		t.gotoPrevChannel();
//		System.out.println("CH:"+t.getChannel());
//	}
//}
