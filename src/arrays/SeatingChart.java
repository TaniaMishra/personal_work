package arrays;

import java.util.Scanner;

public class SeatingChart {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students in the class:");
		int students = input.nextInt();
		while(students % 4 != 0) {
			System.out.println("Try again. Enter the number of students in the class:");
			students = input.nextInt();
		}
		
		int rows = students / 4;
		
		String[][] chart = new String[rows][4];
		
		for (int r = 0; r < chart.length; r++) {
			for (int c = 0; c < chart[0].length; c++) {
				System.out.println("Enter the name of a student:");
				chart[r][c] = input.nextLine();
			}
		}
		
		for (int r = 0; r < chart.length; r++) {
			for (int c = 0; c < chart[0].length; c++) {
				System.out.println(chart[r][c].charAt(0) + "   ");
			}
			System.out.println("");
		}
		
		for (int r = 0; r < chart.length; r++) {
			for (int c = 0; c < chart[0].length; c++) {
				System.out.println(chart[r][c].length() + "   ");
			}
			System.out.println("");
		}
		
		
		input.close();
	}
}
