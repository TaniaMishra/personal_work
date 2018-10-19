package decisions;

import java.util.Scanner;

public class InsuranceCost {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double cost = 200;
		System.out.println("What is your age?");
		double age = input.nextDouble();
		System.out.println("What is your weight? (pounds)");
		double weight = input.nextDouble();
		System.out.println("Do you smoke? (true or false)");
		boolean smoke = input.nextBoolean();
		
		if (age > 75) {
			cost += 125;
		}
		if (age < 30) {
			cost -= 25;
		}
		if (weight > 700) {
			cost += 300;
		}
		if (smoke == true) {
			cost += 50;
		}
		else {
			cost -= 40;
		}
		
		System.out.println("Total insurance cost: " + cost);
		input.close();

	}
}
