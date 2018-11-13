package strings;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int length = sentence.length();
		
		System.out.println("There are " + length + " of characters in the string.");
		
		input.close();
	}
}
