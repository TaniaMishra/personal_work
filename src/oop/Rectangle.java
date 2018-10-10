package oop;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		length = 5;
		width = 3;
	}
	
	public double returnLength() {
		return length;
	}
	public double returnWidth() {
		return width;
	}
	public double perimeter() {
		double perimeter = length + length + width + width;
		return perimeter;
	}
	public double area() {
		double area = length * width;
		return area;
	}
	
	public void changeLength(double newLength) {
		length = newLength;
	}
	public void changeWidth(double newWidth) {
		width = newWidth;
	}
}
