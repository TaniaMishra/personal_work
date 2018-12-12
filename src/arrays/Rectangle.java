package arrays;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle() {
		length = 10;
		width = 10;
	}

	public Rectangle(int xLength, int xWidth) {
		length = xLength;
		width = xWidth;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int xLength) {
		length = xLength;
	}

	public void setWidth(int xWidth) {
		width = xWidth;
	}

	public int perimeter() {
		return length * 2 + width * 2;
	}

	public int area() {
		return length * width;
	}

}
