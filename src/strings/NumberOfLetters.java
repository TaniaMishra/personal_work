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
		int other = 0;
		int length = sentence.length();
		
		for (int i = 0; i < length; i++) {
			char character = sentence.charAt(i);
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
				vowels++;
			}
			else if (character > 65 && character <= 90) {
				consonants++;
			}
			else if (character > 97 && character <= 122) {
				consonants++;
			}
			else if ((character >= 48 && character <= 57) || character == ' '){
				other++;
			}
			else {
				punctuation++;
			}
		}
		
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Number of consonants: " + consonants);
		System.out.println("Number of punctuation marks: " + punctuation);

	}
}
