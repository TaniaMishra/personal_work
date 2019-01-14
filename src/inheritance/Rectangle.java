package inheritance;

public class Rectangle extends Parallelogram implements Geometry {
	public Rectangle() {
		super(10, 10, 10);
	}
	public Rectangle(double l, double w) {
		super(l, w, l);
	}
	
	public String toString() {
		return ("Rectangle: " + super.toString());
	}
	public boolean equals(Object user) {
		return (this.toString().equals(user.toString()));
	}
	public Rectangle clone() {
		return (new Rectangle(super.getSide1(), super.getSide2()));
	}
}
