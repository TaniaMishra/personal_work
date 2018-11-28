package arrays;

public class Circle {
	private double radius;

	public Circle() {
		radius = 10;
	}

	public Circle(double xRadius) {
		if (xRadius > 0)
			radius = xRadius;
		else
			radius = 10;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double xRadius) {
		if (xRadius > 0)
			radius = xRadius;
		else
			radius = 10;
	}

	public double area() {
		return radius * radius * Math.PI;
	}

	public double perimeter() {
		return radius * 2 * Math.PI;
	}
}
