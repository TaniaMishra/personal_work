package polymorphismInterfaces;

import java.util.Scanner;

public class Test2ClassActivities {
	public static void main(String[] args) {
		//Activity 3
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter length: ");
		double length = input.nextDouble();
		System.out.println("Enter width: ");
		double width = input.nextDouble();
		Rectangle rec = new Rectangle(length, width);
		ClassActivities filter = rec;
		rec.getLength();
		rec.getWidth();
		rec.setLength(2);;
		rec.setWidth(2);
		rec.perimeter();
		rec.area();
		filter.perimeter();
		filter.area();
		//filter.getLength();		These don't work because
		//filter.getWidth();		the interface doesn't
		//filter.setLength(2);		have these method's
		//filter.setWidth(2);		signatures.
		
		input.close();
	}
}
