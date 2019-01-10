package inheritance;

public class Rectangle extends Quadrilateral {
	public Rectangle() {
		this.setSide1(10);
		this.setSide2(10);
		this.setSide3(10);
		this.setSide4(10);
	}
	public Rectangle(double l, double w) {
		this.setSide1(l);
		this.setSide2(w);
		this.setSide3(l);
		this.setSide4(w);
	}
	
	public double area() {
		double a = this.getSide1() * this.getSide2();
		return a;
	}
}
