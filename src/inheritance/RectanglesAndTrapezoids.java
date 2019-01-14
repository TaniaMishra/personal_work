package inheritance;

public class RectanglesAndTrapezoids {
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		Trapezoid trap1 = new Trapezoid();
		Rectangle rec2 = new Rectangle();
		Trapezoid trap2 = new Trapezoid();
		
		System.out.println(rec1.toString());
		System.out.println(rec2.toString());
		
		System.out.println("Rectangles equal? " + rec1.equals(rec2));
		
		System.out.println(trap1.toString());
		System.out.println(trap2.toString());
		
		System.out.println("Trapezoids equal? " + trap1.equals(trap2));
	}
}
