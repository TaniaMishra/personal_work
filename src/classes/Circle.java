package classes;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 5;
	}
	
	public Circle (double r) {
		radius = r;
	}
	
	public double circumference() {
		double circ = 2 * radius * Math.PI;
		return circ;
	}
	
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}
}
