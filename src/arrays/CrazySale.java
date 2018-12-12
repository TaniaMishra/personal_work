package arrays;

import java.util.Scanner;
import java.util.Random;

public class CrazySale {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		double[] costs = new double[5];
		for (int i = 0; i < costs.length; i++) {
			System.out.print("Enter the current cost of an item: $");
			costs[i] = input.nextDouble();
		}
		
		//Sale: each item is marked down a random percentage.
		
		for (int i = 0; i < costs.length; i++) {
			double percentage = rand.nextDouble();
			double decrease = costs[i] * percentage;
			costs[i] -= decrease;
		}
		
		//Display new cost
		System.out.println("New Costs!");
		for (int i = 0; i < costs.length; i++) {
			System.out.println("$" + costs[i]);
		}
		

	}
}
