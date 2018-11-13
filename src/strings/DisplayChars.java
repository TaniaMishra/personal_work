package strings;

import java.util.Scanner;

public class DisplayChars {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int length = sentence.length();
		for (int i = 0; i < length; i++) {
			char character = sentence.charAt(i);
			System.out.println("Index " + i + ": " + character);
		}
		
		input.close();
	}
}
