package polymorphismInterfaces;

public class Rectangle implements ClassActivities {
	private double length;
	private double width;

	public Rectangle() {
		length = 10;
		width = 10;
	}

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double l) {
		length = l;
	}

	public void setWidth(double w) {
		width = w;
	}

	public double perimeter() {
		return ((length + width) * 2);
	}

	public double area() {
		return (length * width);
	}
}
