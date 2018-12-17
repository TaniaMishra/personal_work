package classes;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = 10;
		width = 10;
	}
	
	public Rectangle (double l, double w) {
		length = l;
		width = w;
	}
	
	public double perimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}
}
