package loops;

import java.util.Scanner;
import decisions.Triangle;

public class TestTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean keepGoing = true;

		do {
			System.out.println("What is the height of the first right triangle?");
			double height1 = input.nextDouble();
			System.out.println("What is the length of the base of the first right triangle?");
			double base1 = input.nextDouble();
			System.out.println("What is the hypotenuse of the first right triangle?");
			double hypo1 = input.nextDouble();
			Triangle tri1 = new Triangle(base1, height1, hypo1);
			double area1 = tri1.area();
			
			System.out.println("What is the height of the first right triangle?");
			double height2 = input.nextDouble();
			System.out.println("What is the length of the base of the first right triangle?");
			double base2 = input.nextDouble();
			System.out.println("What is the hypotenuse of the first right triangle?");
			double hypo2 = input.nextDouble();
			Triangle tri2 = new Triangle(base2, height2, hypo2);
			double area2 = tri2.area();

			if (area1 > area2) {
				System.out.println("The first right triangle has the larger area!");
			}
			else if (area2 > area1) {
				System.out.println("The second right triangle has the larger area!");
			}
			else {
				System.out.println("The right triangles have the same area!");
			}
			
			System.out.println("Would you like to test two more triangles? (true or false)");
			keepGoing = input.nextBoolean();
		}
		while (keepGoing == true);
		
		
		input.close();
	}
}
