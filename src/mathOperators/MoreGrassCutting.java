package mathOperators;

import java.util.Scanner;

public class MoreGrassCutting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length = 0.0;
		double width = 0.0;
		double area = 0.0;
		double deckWidth = 0.0;
		double speed = 0.0;
		double money = 0.0;
		double miles = 0.0;
		
		System.out.println("What is the length of the lawn? (ft)");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn? (ft)");
		width = input.nextDouble();
		System.out.println("What is the deck width of the lawn mower? (in)");
		deckWidth = input.nextDouble();
		System.out.println("What is the speed of the lawn mower? (MPH)");
		speed = input.nextDouble();

		area = length*width;
		deckWidth = deckWidth/12;
		miles = (length / deckWidth) * width; 		// one pass times the rest of the passes
		miles = miles * 5280;						// from feet to miles
		miles = miles * speed;
		money = (area/100.0) * 1.25;				//DOESN'T WORK
		
		System.out.println("Amount Owed: $" + money);

	}
}
