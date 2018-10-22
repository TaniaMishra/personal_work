package decisions;

import java.util.Scanner;

public class Weight {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your weight?");
		double weight = input.nextDouble();
		System.out.println("Enter the corresponding number for the planet you would like to see your weight for.");
		System.out.println("1. Mercury");
		System.out.println("2. Venus");
		System.out.println("3. Mars");
		System.out.println("4. Jupiter");
		System.out.println("5. Saturn");
		int planet = input.nextInt();
		
		
		switch (planet) {
			case 1:
				weight = 0.37 * weight;
				System.out.println("On Mercury, your weight is : " + weight + " lbs.");
				break;
			case 2:
				weight = 0.88 * weight;
				System.out.println("On Venus, your weight is : " + weight + " lbs.");
				break;
			case 3:
				weight = 0.38 * weight;
				System.out.println("On Mars, your weight is : " + weight + " lbs.");
				break;
			case 4:
				weight = 2.64 * weight;
				System.out.println("On Jupiter, your weight is : " + weight + " lbs.");
				break;
			case 5:
				weight = 1.15 * weight;
				System.out.println("On Saturn, your weight is : " + weight + " lbs.");
				break;
			default:
				System.out.println("You did not enter one of the planet options :( ");
		}
		input.close();
	}
}
