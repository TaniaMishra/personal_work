package oop;

public class IsoscelesTrapezoid {
	private double base1;
	private double base2;
	private double height;
	private double leg;
	
	public IsoscelesTrapezoid() {
		base1 = 2.0;
		base2 = 3.0;
		height = 4.0;
		leg = 5.0;
	}
	public IsoscelesTrapezoid(double newBase1, double newBase2, double newHeight, double newLeg) {
		base1 = newBase1;
		base2 = newBase2;
		height = newHeight;
		leg = newLeg;
	}
	
	public double getBase1() {
		return base1;
	}
	public double getBase2() {
		return base2;
	}
	public double getHeight() {
		return height;
	}
	public double getLeg() {
		return leg;
	}
	
	
	public double perimeter() {
		double perimeter = leg + leg + base1 + base2;
		return perimeter;
	}
	public double area() {
		double area = 0.5 * (base1 + base2) * height;
		return area; 
	}
}
