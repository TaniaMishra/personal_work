package decisions;

import java.util.Scanner;

public class GradeCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		double testAve = input.nextDouble();
		System.out.println("What is your homework average?");
		double hwAve = input.nextDouble();
		System.out.println("Is your teacher nice? (true = nice, false = not nice)");
		boolean teacher = input.nextBoolean();
		
		double grade = 0;
		
		if (teacher == true) {
			if (testAve > hwAve) {
				grade = testAve;
			}
			else {
				grade = hwAve;
			}
		}
		else {
			if (testAve < hwAve) {
				grade = testAve;
			}
			else {
				grade = hwAve;
			}
		}
		
		System.out.println("Your grade will be: " + grade + "%.");
		input.close();
	}
}
