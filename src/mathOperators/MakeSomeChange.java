package mathOperators;

import java.util.Scanner;

public class MakeSomeChange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double value = 0.0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		int cents = 0;
		
		System.out.println("What is the value you need change for?");
		value = input.nextDouble();
		
		dollars = (int)value;
		cents = (int)((value-dollars)*100);
		quarters = cents/25;
		cents = cents-(quarters*25);
		dimes = cents/10;
		cents = cents-(dimes*10);
		nickels = cents/5;
		cents = cents-(nickels*5);
		pennies = cents;
		
		System.out.println("Amount to Break Down: " + value);
		System.out.println("Number of Dollars: " + dollars);
		System.out.println("Number of Quarters: " + quarters);
		System.out.println("Number of Dimes: " + dimes);
		System.out.println("Number of Nickels: " + nickels);
		System.out.println("Number of Pennies: " + pennies);
		
	}
}
