package strings;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		while (quit == false) {
			System.out.println("Enter a sentence:");
			String sentence = input.nextLine();
			int spacesCount = 1;
			int index = 0;
			int sentLength = sentence.length();
			for (int i = 0; i < sentLength; i++) {
				char character = sentence.charAt(i);
				if (character == ' ') {
					spacesCount++;
					System.out.println(sentence.substring(index, i));
					index = i + 1;
				}
			}
			System.out.println(sentence.substring(index, sentLength));
			System.out.println("Do you want to quit? (true = yes, false = no)");
			quit = input.nextBoolean();
		}
	}
}
