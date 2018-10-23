package decisions;

import java.util.Scanner;

public class Honors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		System.out.println("What grade are you in? (answer with the number - ex. 10)");
		int gradeLevel = input.nextInt();
		
		if (gradeLevel == 12 && gpa >= 3.5) {
			System.out.println("Congrats! You can graduate with honors!");
		}
		else {
			System.out.println("Sorry, but you cannot graduate with honors.");
		}
		input.close();
	}
}
