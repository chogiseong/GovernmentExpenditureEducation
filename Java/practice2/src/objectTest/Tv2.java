package objectTest;

public class Tv2 {

}
class Tv3{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channel1UP() { ++channel;}
	void channel1Down() { --channel;}
}
class CaptionTv extends Tv{
	boolean caption; 
	
}