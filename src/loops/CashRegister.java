package loops;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many items are you buying?");
		int items = input.nextInt();
		double tax = 0.05;
		double sum = 0;
		double total = 0;
		
		for (int i = 0; i < items; i++) {
			System.out.println("What is the price of this item?");
			double price = input.nextDouble();
			
			sum += price;
		}
		
		tax *= sum;
		total = sum + tax;
		
		System.out.println("Cost of the items: $" + sum);
		System.out.println("Cost of the tax: $" + tax);
		System.out.println("Total Cost (w/tax): $" + total);
		
		input.close();
	}
}
