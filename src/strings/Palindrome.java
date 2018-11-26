package strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String original = input.next();
		int lastIndex = original.length() - 1;
		int counter = 0;
		for (int i = 0; i <= lastIndex; i++) {
			char atI = original.charAt(i);
			char last = original.charAt(lastIndex-i);
			if (atI == last) {
				counter++;
			}
		}
		if (counter == original.length()) {
			System.out.println("It is a palindrome!");
		}
		else {
			System.out.println("It is not a palindrome.");
		}
	}
}
