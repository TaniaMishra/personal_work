package arrays;

import java.util.Scanner;

public class LongShortNames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many people do you know? (Must be above 0)");
		int people = input.nextInt();
		
		String[] names = new String[people];
		
		int longest = 0;
		int longIndex = 0;
		int shortest = 1000;
		int shortIndex = 0;
		
		for (int i = 0; i < people; i++) {
			System.out.println("Enter a name (first and last):");
			names[i] = input.nextLine();
			if (names[i].length() > longest) {
				longest = names[i].length();
				longIndex = i;
			}
			if (names[i].length() < shortest) {
				shortest = names[i].length();
				shortIndex = i;
			}
		}
		
		System.out.println("Names of the people you know:");
		for (int i = 0; i < people; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("Longest: " + names[longIndex]);
		System.out.println("Shortest: " + names[shortIndex]);
		
		int range = longest - shortest;
		System.out.println("Range: " + range);
		
		input.close();
	}
}
