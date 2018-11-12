package strings;

import java.util.Scanner;

public class Contains {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine();
		boolean bob = sentence.contains("bob");
		boolean Bob = sentence.contains("Bob");
		boolean BOB = sentence.contains("BOB");
		if (bob == true || Bob == true || BOB == true) {
			System.out.println("Your sentence has 'Bob' in it!");
		}
		else {
			System.out.println("Your sentence doesn't have 'Bob' in it.");
		}

	}

}
