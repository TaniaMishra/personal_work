package arrays;

import java.util.Scanner;

public class StudentTests {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are in the class?");
		int students = input.nextInt();
		System.out.println("How many tests were taken by each student?");
		int testsTaken = input.nextInt();
		int allAverage = 0;
		double[][] tests = new double[students][testsTaken];
		for (int r = 0; r < tests.length; r++) {
			for (int c = 0; c < tests[0].length; c++) {
				System.out.println("Score of test " + (c+1) + " for student " + (r+1) + ":");
				tests[r][c] = input.nextDouble();
				allAverage += tests[r][c];
			}
		}
		allAverage = allAverage/(tests.length*tests[0].length);
		
		
		for (int r = 0; r < tests.length; r++) {
			double average = 0;
			for (int c = 0; c < tests[0].length; c++) {
				average += tests[r][c];
			}
			average = average/tests[0].length;
			System.out.println("Student " + (r+1) + " Average: " + average);
		}
		
		for (int c = 0; c < tests[0].length; c++) {
			double average = 0;
			for (int r = 0; r < tests.length; r++) {
				average += tests[r][c];
			}
			average = average/tests.length;
			System.out.println("Test " + (c+1) + " Average: " + average);
		}
		
		System.out.println("Average of all the tests: " + allAverage);
		
		input.close();
	}
}
