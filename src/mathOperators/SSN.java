package mathOperators;

import java.util.Scanner;

public class SSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		int til18 = 18;
		int ssn = 0;
		int digits = 0000;
		
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("What is your social security number?");
		ssn = input.nextInt();
		
		til18 = 18-age;
		digits = ssn % 10000;
		
		System.out.println("Age: " + age);
		System.out.println("Years Until 18: " + til18);
		System.out.println("SSN: " + ssn);
		System.out.println("Last 4 digits of your SSN: " + digits);
		
		input.close();
		
	}
}
