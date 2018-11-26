package strings;

import java.util.Scanner;

public class CharAt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = input.nextLine();
		System.out.println("First letter: " + sentence.charAt(0));
		System.out.println("Third letter: " + sentence.charAt(2));
		System.out.println("Entire sentence: " + sentence);
	}
}
