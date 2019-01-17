package inheritance;

public class TestQuadRecTrap {
	public static void main(String[] args) {
		Quadrilateral quad1 = new Quadrilateral();
		Quadrilateral quad2 = new Quadrilateral();
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		Trapezoid trap1 = new Trapezoid();
		Trapezoid trap2 = new Trapezoid();
		
		System.out.println("Quadrilateral 1 - Perimeter: " + quad1.perimeter());
		System.out.println("Quadrilateral 2 - Perimeter: " + quad2.perimeter());
		System.out.println("Rectangle 1 - Perimeter: " + rec1.perimeter() + ", Area: " + rec1.area());
		System.out.println("Rectangle 2 - Perimeter: " + rec2.perimeter() + ", Area: " + rec2.area());
		System.out.println("Trapezoid 1 - Perimeter: " + trap1.perimeter() + ", Area: " + trap1.area());
		System.out.println("Trapezoid 2 - Perimeter: " + trap2.perimeter() + ", Area: " + trap2.area());

	}
}
