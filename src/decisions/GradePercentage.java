package decisions;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is one test score?");
		double test1 = input.nextDouble();
		System.out.println("What is another test score?");
		double test2 = input.nextDouble();
		System.out.println("What is another test score?");
		double test3 = input.nextDouble();
		
		double average = test1 + test2 + test3;
		average = average/3;
		
		System.out.println("Did you do the extra credit? (true or false)");
		boolean extra = input.nextBoolean();
		if (extra == true) {
			System.out.println("How many extra credit points do you have?");
			double extraCredit = input.nextDouble();
			average = average + extraCredit;
		}
		
		System.out.println("Your average grade is: " + average);
		
		input.close();
	}

}
