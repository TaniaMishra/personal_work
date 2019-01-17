package inheritance;

public class TestSquare {
	public static void main(String[] args) {
		Square square = new Square(10);
		
		System.out.println("Perimeter: " + square.perimeter());
		System.out.println("Area: " + square.area());
		System.out.println(square.toString());
		
		Square cloned = square.clone();
		System.out.println("Cloned == Original? " + square.equals(cloned));

	}
}
