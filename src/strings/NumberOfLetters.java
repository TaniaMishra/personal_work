package strings;

import java.util.Scanner;

public class NumberOfLetters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int vowels = 0;
		int consonants = 0;
		int punctuation = 0;
		int length = sentence.length();
		
		for (int i = 0; i < length; i++) {
			char character = sentence.charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
				
			}
		}

	}
}
