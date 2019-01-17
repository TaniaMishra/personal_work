package inheritance;

import java.util.Random;

public class RectanglesAndTrapezoids {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int length = 1 + rand.nextInt(10);
		int width = 1 + rand.nextInt(10);
		Rectangle rec1 = new Rectangle(length, width);
		length = 1 + rand.nextInt(10);
		width = 1 + rand.nextInt(10);
		Rectangle rec2 = new Rectangle(length, width);
		int s1 = 1 + rand.nextInt(10);
		int s2 = 1 + rand.nextInt(10);
		int s3 = 1 + rand.nextInt(10);
		int s4 = 1 + rand.nextInt(10);
		Trapezoid trap1 = new Trapezoid(s1, s2, s3, s4);
		s1 = 1 + rand.nextInt(10);
		s2 = 1 + rand.nextInt(10);
		s3 = 1 + rand.nextInt(10);
		s4 = 1 + rand.nextInt(10);
		Trapezoid trap2 = new Trapezoid(s1, s2, s3, s4);
		
		System.out.println(rec1.toString());
		System.out.println(rec2.toString());
		
		System.out.println("Rectangles equal? " + rec1.equals(rec2));
		
		System.out.println(trap1.toString());
		System.out.println(trap2.toString());
		
		System.out.println("Trapezoids equal? " + trap1.equals(trap2));
	}
}
