package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class TestGeometry {
	public static void main(String[] args) {
		Random rand = new Random();
		
		ArrayList<Geometry> shapes = new ArrayList<Geometry>();
		for (int i = 0; i < 10; i++) {
			int type = 1 + rand.nextInt(2);
			if (type == 1) {
				shapes.add(new Rectangle(i+1, i+2));
			}
			else {
				shapes.add(new Trapezoid(i+2, i+3, i+2, i+5));
			}
		}
		
		String type = "";
		double largestArea = 0;
		for (Geometry x : shapes) {
			if (x.area() > largestArea) {
				largestArea = x.area();
				if (x instanceof Rectangle) {
					type = "Rectangle";
				}
				else {
					type = "Trapezoid";
				}
			}
		}
		
		System.out.println("A " + type + " has the largest area of " + largestArea + ".");

	}
}
