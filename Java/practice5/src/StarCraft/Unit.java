package StarCraft;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
}

abstract class Dropship extends Unit {
	
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	void load() {}
	void unload() {}

}
abstract class Marine extends Unit {
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	void stimPack() {}
}
abstract class Tank extends Unit {
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	void changeMode() {}
}