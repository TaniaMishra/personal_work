package strings;

import java.util.Scanner;

public class DisplayEvery4thChar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int length = sentence.length();
		for (int i = 0; i < length; i += 4) {
			System.out.println(sentence.charAt(i));
		}
		input.close();
	}
}
