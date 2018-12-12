package arrays;

import java.util.Scanner;
import java.util.Random;

public class SplitActivity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(5);
		
		System.out.println("Enter a sentence:");
		String sentence = input.nextLine();
		System.out.println("Enter a key word:");
		String key = input.next();
		
		String[] words = sentence.split(" ");
		int counter = 0;
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].charAt(0));
			if (words[i].equals(key)) {
				counter++;
			}
		}
		System.out.println("The key word showed up " + counter + " times.");
		
		int randElement = rand.nextInt(words.length);
		System.out.println("Random Word: " + words[randElement]);
	
	}
}
