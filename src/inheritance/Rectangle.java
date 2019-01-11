package inheritance;

public class Rectangle extends Parallelogram implements Geometry {
	public Rectangle() {
		super(10, 10, 10);
	}
	public Rectangle(double l, double w) {
		super(l, w, l);
	}
}
