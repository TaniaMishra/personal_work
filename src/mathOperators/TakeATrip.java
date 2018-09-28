package mathOperators;

import java.util.Scanner;

public class TakeATrip {
	public static void main(String[] args) {
		double miles = 0.0;
		double mpg = 0.0;
		double total_money = 0.0;
		double gallons = 0.0;
		double cpg = 0.0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many miles did you travel?");
		miles = input.nextDouble();
		System.out.println("What is the fuel economy of the car? (MPG)");
		mpg = input.nextDouble();
		System.out.println("What is the total amount of money spent on gas? ($)");
		total_money = input.nextDouble();
		
		gallons = miles / mpg;
		cpg = total_money / gallons;
		
		System.out.println("Total Distance Traveled: " + miles + " miles");
		System.out.println("Gallons of Gas Used: " + gallons + " gallons");
		System.out.println("Total Amount of Money Spent on Gas: $" + total_money);
		System.out.println("Average Cost per Gallon of Gas: $" + cpg);
		
	}
}
