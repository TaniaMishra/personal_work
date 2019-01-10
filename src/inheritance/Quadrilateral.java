package inheritance;

public class Quadrilateral {
	private double s1;
	private double s2;
	private double s3;
	private double s4;
	
	public Quadrilateral() {
		s1 = 10;
		s2 = 10;
		s3 = 10;
		s4 = 10;
	}
	public Quadrilateral(double one, double two, double three, double four) {
		s1 = one;
		s2 = two;
		s3 = three;
		s4 = four;
	}
	
	public double getSide1() {
		return s1;
	}
	public double getSide2() {
		return s2;
	}
	public double getSide3() {
		return s3;
	}
	public double getSide4() {
		return s4;
	}
	
	public void setSide1(double side) {
		s1 = side;
	}
	public void setSide2(double side) {
		s2 = side;
	}
	public void setSide3(double side) {
		s3 = side;
	}
	public void setSide4(double side) {
		s4 = side;
	}
	
	public double perimeter() {
		double p = s1 + s2 + s3 + s4;
		return p;
	}
}
