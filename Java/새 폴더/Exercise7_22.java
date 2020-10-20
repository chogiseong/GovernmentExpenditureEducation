package ex7;

public class Exercise7_22 {

}

class Circle extends Shape{
	
	double r;
	
	Circle(){
		super();
		r = 1;
	}
	
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		
		return Math.PI*r*r;
	}
	
}

class Rectangle extends Shape{
	
	double width;
	double height;
	
	Rectangle(){
		super();
		
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0,0));
	}

	Shape(Point p) {
		this.p = p;
	}


	abstract double calcArea();  // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0,0);
	}

	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public String toString() {
		return "["+x+","+y+"]";
	}
}
