package decisions;
public class Circle {
	private double radius;
	
	//Default constructor
	public Circle() {
		radius = 3.0;
	}
	//Alternate constructor
	public Circle(double rad) {
		if (rad <= 0) {
			radius = 3.0;
		}
		else {
			radius =  rad;
		}
	}
	
	//Accessor Methods
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
	
	//Mutator Method
	public void changeRadius(double newRadius) {
		if (newRadius > 0) {
			radius = newRadius;
		}
		else {
			radius = 3.0;
		}
	}
}
