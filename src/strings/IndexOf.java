package strings;

import java.util.Scanner;

public class IndexOf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		int x = sentence.indexOf("Bob");
		if (x < 0) {
			System.out.println("'Bob' isn't in the sentence :(");
		}
		else {
			System.out.println("'Bob' is found at index " + x);
		}
		
		input.close();
	}
}
