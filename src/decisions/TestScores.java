package decisions;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first test score?");
		double first = input.nextDouble();
		System.out.println("What is the second test score?");
		double second = input.nextDouble();
		System.out.println("What is the third test score?");
		double third = input.nextDouble();
		
		double average = (first + second + third) / 3;
		System.out.println("Your average grade is: " + average + "%");
		
		if (average >= 92.5) {
			System.out.println("Grade Letter: A");
		}
		else {
			if (average >= 84.5) {
				System.out.println("Grade Letter: B");
			}
			else {
				if (average >= 77.5) {
					System.out.println("Grade Letter: C");
				}
				else {
					if (average >= 69.5) {
						System.out.println("Grade Letter: D");
					}
					else {
						System.out.println("Grade Letter: F");
					}
				}
			}
		}
		
		input.close();
	}

}
