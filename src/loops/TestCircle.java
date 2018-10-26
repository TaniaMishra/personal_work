package loops;

import decisions.Circle;
import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Circle circ1 = new Circle();
		Circle circ2 = new Circle();
		Circle circ3 = new Circle();
		
		boolean keepGoing = true;
		
		do {
			System.out.print("Enter the radius of the first circle: ");
			double rad1 = input.nextDouble();
			circ1.changeRadius(rad1);
			double circumference1 = circ1.circumference();
			
			System.out.print("Enter the radius of the second circle: ");
			double rad2 = input.nextDouble();
			circ2.changeRadius(rad2);
			double circumference2 = circ2.circumference();
			
			System.out.print("Enter the radius of the third circle: ");
			double rad3 = input.nextDouble();
			circ3.changeRadius(rad3);
			double circumference3 = circ1.circumference();
			
			if (circumference1 > circumference2 && circumference1 > circumference3) {
				System.out.println("The biggest circle is the first circle!");
			}
			else if (circumference2 > circumference1 && circumference2 > circumference3) {
				System.out.println("The biggest circle is the second circle!");
			}
			else if (circumference3 > circumference1 && circumference3 > circumference2) {
				System.out.println("The biggest circle is the third circle!");
			}
			else if (circumference1 == circumference2 && circumference2 > circumference3) {
				System.out.println("The biggest circles are the first and second circle!");
			}
			else if (circumference2 == circumference3 && circumference2 > circumference1) {
				System.out.println("The biggest circles are the second and third circle!");
			}
			else if (circumference3 == circumference1 && circumference3 > circumference2) {
				System.out.println("The biggest circles are the first and third circle!");
			}
			else {
				System.out.println("The biggest circle is the third circle!");
			}
			
			System.out.println("Would you like to test another three circles? (true or false)");
			keepGoing = input.nextBoolean();
		}
		while (keepGoing == true);
		input.close();
	}
}
