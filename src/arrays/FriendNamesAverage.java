package arrays;

import java.util.Scanner;

public class FriendNamesAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many friends do you have? MUST BE ABOVE 0");
		int length = input.nextInt();
		double average = 0;
		
		int[] ages = new int[length];
		String[] names = new String[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter your friend's first name: ");
			names[i] = input.next();
			System.out.println("Enter your friend's ages: ");
			ages[i] = input.nextInt();
			int nameLength = names[i].length();
			average += nameLength;
		}
		
		average = average/length;
		
		System.out.println(average + " is the average length of your friend's names.");

	}
}
