package oop;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee bob = new Employee();
		
		System.out.println("Starting wage: " + bob.getWage());
		System.out.println("What is your new wage?");
		double newWage = input.nextDouble();
		bob.setWage(newWage);
		System.out.println("Your new wage: " + bob.getWage());
		
		/*System.out.println("Starting years of experience: " + bob.getExperience());
		System.out.println("How many years of experience do you have now?");
		double newExperience = input.nextDouble();
		bob.setExperience(newExperience);
		System.out.println("You now have " + bob.getExperience() + " years of experience.");
*/
		System.out.println("Your new wage (w/10% raise): " + bob.getWage());
		input.close();
	}

}
