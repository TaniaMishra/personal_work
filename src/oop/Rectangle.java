package oop;

public class Rectangle {
	private double length;
	private double width;
	
	//default
	public Rectangle() {
		length = 5;
		width = 3;
	}
	//alternate
	public Rectangle(double newL, double newW) {
		length = newL;
		width = newW;
	}
	
	//accessors
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
	
	//mutators
	public void changeLength(double newLength) {
		length = newLength;
	}
	public void changeWidth(double newWidth) {
		width = newWidth;
	}
}
