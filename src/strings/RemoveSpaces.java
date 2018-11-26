package strings;

import java.util.Scanner;

public class RemoveSpaces {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int length = sentence.length();
		
		for (int i = 0; i < length; i++) {
			char character = sentence.charAt(i);
			if (character != ' ' && character != 'a') {
				System.out.print(character);
			}
		}
		System.out.println("");
		
		System.out.println(sentence);
	}
}
