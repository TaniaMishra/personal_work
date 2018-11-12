package strings;

import java.util.Scanner;

public class CompareTo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("First Name:");
		String first = input.next();
		System.out.println("Last Name:");
		String last = input.next();
		
		if (first.compareTo(last) == 0) {
			System.out.println("Your first and last names are the same!");
		}
		else if (first.compareTo(last) < 0) {
			System.out.println("In alphabetical order, your first name comes before your last name.");
		}
		else {
			System.out.println("In alphabetical order, your last name comes before your first name.");
		}
		
	}

}
