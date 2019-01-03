package breakReview;

import java.util.Scanner;

public class DetensionSupervisor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Student[][] kids = new Student[7][5];
		for (int r = 0; r < kids.length; r++) {
			for (int c = 0; c < kids[0].length; c++) {
				System.out.println("Type Start: ");
				input.nextLine();
				System.out.println("Name: ");
				String name = input.nextLine();
				System.out.println("Grade: ");
				int grade = input.nextInt();
				kids[r][c] = new Student(name, grade);
			}
		}
		
		double average = 0;
		int ninth = 0;
		double twelth = 0;
		for (int r = 0; r < kids.length; r++) {
			for (int c = 0; c < kids[0].length; c++) {
				if (kids[r][c].getGrade() == 9) {
					ninth++;
				}
				if (kids[r][c].getGrade() == 12) {
					twelth++;
				}
				average += kids[r][c].getName().length();
			}
		}
		average = average/(kids.length*kids[0].length);
		twelth = twelth/(kids.length*kids[0].length);		//decimal
		twelth = twelth * 100;								//percentage
		
		System.out.println(ninth + " ninth graders.");
		System.out.println(twelth + " twelth graders.");
		System.out.println("Average length of student's names: " + average);
		
		input.close();
	}
}
