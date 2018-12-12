package arrays;

import java.util.Scanner;

public class WeddingPlanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of people attending the wedding:");
		int people = input.nextInt();
		while (people % 8 != 0) {
			System.out.println("Enter the number of people attending the wedding:");
			people = input.nextInt();
		}
		
		int rows = people/8;
		Friend[][] seats = new Friend[rows][8];
		
		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c < seats[0].length; c++) {
				System.out.println("Enter the age of a guest:");
				int age = input.nextInt();
				System.out.println("Enter the name of the guest:");
				String name = input.nextLine();
				seats[r][c] = new Friend(name, age);
			}
		}
		
		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c < seats[0].length; c++) {
				System.out.println(seats[r][c].getName() + "   ");
			}
			System.out.println("");
		}
		
		for (int r = 0; r < seats.length; r++) {
			for (int c = 0; c < seats[0].length; c++) {
				String name = seats[r][c].getName();
				int space = name.indexOf(' ');
				System.out.println(name.substring(space+1) + "   ");
			}
			System.out.println("");
		}

	}
}
