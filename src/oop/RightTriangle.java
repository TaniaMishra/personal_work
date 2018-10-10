package oop;

public class RightTriangle {
	private double base;
	private double height;
	
	public RightTriangle() {
		base = 2.0;
		height = 4.0;
	}
	public RightTriangle(double newBase, double newHeight) {
		base = newBase;
		height = newHeight;
	}
	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return base;
	}
	public void changeBase(double newBase) {
		base = newBase;
	}
	public void changeHeight(double newHeight) {
		height = newHeight;
	}
	
	public double hypot() {
		double hypot = (base * base) + (height * height);
		hypot = Math.sqrt(hypot);
		return hypot;
	}
	public double perimeter(double hypot) {
		double perimeter = base + height + hypot;
		return perimeter;
	}
	public double area() {
		double area = base * height;
		area = area/2;
		return area;
	}
}
