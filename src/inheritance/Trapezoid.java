package inheritance;

public class Trapezoid extends Quadrilateral implements Geometry {
	private double height;
	
	public Trapezoid() {
		super(5, 6, 5, 10);
		double leg = Math.abs(super.getSide2()-super.getSide4());
		double temp = (super.getSide1()*super.getSide1()) - (leg*leg);
		height = Math.sqrt(temp);
	}
	public Trapezoid(double one, double two, double three, double four) {
		super(one, two, three, four);
		double leg = Math.abs(super.getSide2()-super.getSide4());
		double temp = (super.getSide1()*super.getSide1()) - (leg*leg);
		height = Math.sqrt(temp);
	}

	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	
	public double area() {
		double a = (super.getSide1() + super.getSide3())/2;
		a = a * height;
		return a;
	}

	public String toString() {
		return ("Trapezoid: height - " + height + " " + super.toString());
	}
	public boolean equals(Object user) {
		return (this.toString().equals(user.toString()));
	}
	public Trapezoid clone() {
		return (new Trapezoid(super.getSide1(), super.getSide2(), super.getSide3(), super.getSide4()));
	}
}
