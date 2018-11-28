package arrays;

import java.util.Scanner;

public class SentenceBreakdown {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		
		int[] alphabet = new int[26];
		
		for (int i = 0; i < sentence.length(); i++) {
			char character = sentence.charAt(i);
			int element = 0;	//starts at a/A
			int lowercase = 97;
			for (int uppercase = 65; uppercase < 91; uppercase++) {		//goes for each letter (uppercase)
				if (character == uppercase || character == lowercase) {
					alphabet[element]++;
				}
				element++;
				lowercase++;
			}
		}
		System.out.println("Number of times each letter appeared:");
		for (int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}
	}
}
