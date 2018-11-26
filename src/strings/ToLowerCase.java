package strings;

import java.util.Scanner;

public class ToLowerCase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence);
		input.close();
	}
}
