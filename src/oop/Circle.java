package oop;

public class Circle {
	private double radius;
	
	public Circle() {
		radius = 3.0;
	}
	
	public double returnRadius() {
		return radius;
	}
	public double circumference() {
		double circumference = (radius * 2) * Math.PI;
		return circumference;
	}
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public void changeRadius(double newRadius) {
		radius = newRadius;
	}
}
