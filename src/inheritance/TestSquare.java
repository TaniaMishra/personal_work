package inheritance;

public class TestSquare {
	public static void main(String[] args) {
		Square square = new Square(10);
		
		System.out.println("Perimeter: " + square.perimeter());
		System.out.println("Area: " + square.area());
	}
}
