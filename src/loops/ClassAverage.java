package loops;

import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many students took the test?");
		int students = input.nextInt();
		double ave = 0;
		double testSum = 0;
		
		for (int i = 1; i <= students; i++) {
			System.out.print("Test Score: ");
			double score = input.nextDouble();
			testSum += score;
		}
		
		ave = testSum/students;
		
		System.out.println("Average Class Score: " + ave);
		
		input.close();
	}
}
