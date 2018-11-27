package arrays;

import java.util.Scanner;

public class ObjectArraysOneDimensional {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[5];
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter a friend's name:");
			names[i] = input.nextLine();
		}
		
		System.out.println("Friends:");
		for (int i = names.length - 1; i >= 0; i--) {
			System.out.println(names[i]);
		}

		System.out.println("Enter a letter:");
		String letterString = input.next();
		String letter = letterString.substring(0, 1);
		
		for (int i = 0; i < names.length; i++) {
			String lastLetter = names[i].substring(names[i].length()-1);
			if (lastLetter.equals(letter)) {
				System.out.println(names[i] + " ends with " + letter);
			}
		}

		System.out.println("Enter a first name length:");
		int userLength = input.nextInt();
		int lengthCount = 0;
		for (int i = 0; i < names.length; i++) {
			int space = names[i].indexOf(" ");
			if (space != -1) {
				String firstName = names[i].substring(0, space);
				if (userLength == firstName.length()) {
					lengthCount++;
				}
			}
			else {
				if (userLength == names[i].length()) {
					lengthCount++;
				}
			}
		}
		System.out.println(lengthCount + " names had the same length.");
		
		input.close();
	}
}
