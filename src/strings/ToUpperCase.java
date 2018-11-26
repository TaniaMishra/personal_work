package strings;

import java.util.Scanner;

public class ToUpperCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		System.out.println("Enter your last name:");
		String lastName = input.nextLine();
		
		System.out.println(firstName.toUpperCase());
		System.out.println(lastName.toUpperCase());
		
		if (firstName.compareTo(lastName) == 0) {
			System.out.println("Your first and last names are the same!");
		}
		else if (firstName.compareTo(lastName) < 0) {
			System.out.println("Your first name comes before your last name.");
		}
		else {
			System.out.println("Your last name comes before your first name.");
		}

	}
}
