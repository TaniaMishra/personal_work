package inheritance;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 20);
		
		System.out.println("Perimeter: " + rec.perimeter());
		System.out.println("Area: " + rec.area());
		
	}
}
