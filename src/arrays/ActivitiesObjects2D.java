package arrays;

import java.util.Scanner;
import java.util.Random;

public class ActivitiesObjects2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String[][] names = new String[4][3];
		Friend[][] ages = new Friend[4][3];
		
		for (int r = 0; r < names.length; r++) {
			for (int c = 0; c < names[0].length; c++) {
				System.out.println("Enter a full name:");
				names[r][c] = input.nextLine();
			}
		}
		
		System.out.println("");

		for (int r = 0; r < names.length; r++) {
			for(int c = 0; c < names[0].length; c++) {
				System.out.print(names[r][c] + "      ");
			}
			System.out.println("");
		}
		
		for (int r = 0; r < ages.length; r++) {
			for (int c = 0; c < ages[0].length; c++) {
				ages[r][c] = new Friend();
				int xAge = rand.nextInt(101);
				ages[r][c].setAge(xAge);
			}
		}
		
		for (int r = 0; r < ages.length; r++) {
			for(int c = 0; c < ages[0].length; c++) {
				System.out.print(ages[r][c].getAge() + "      ");
			}
			System.out.println("");
		}
	}
}
