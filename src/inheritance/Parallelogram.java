package inheritance;

public class Parallelogram extends Quadrilateral {
	private double height;
	
	public Parallelogram() {
		super(2, 4, 2, 4);
		height = 2;
	}
	public Parallelogram(double l, double w, double h) {
		super(l, w, l, w);
		height = h;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double area() {
		double a = super.getSide4() * height;
		return a;
	}
	
	public String toString() {
		return ("Parallelogram: height - " + height + " " + super.toString());
	}
	public boolean equals(Object user) {
		return (this.toString().equals(user.toString()));
	}
	public Parallelogram clone() {
		return (new Parallelogram(super.getSide1(), super.getSide2(), height));
	}
}
