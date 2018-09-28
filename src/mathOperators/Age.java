package mathOperators;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.println("How old are you?");
		age = input.nextInt();
		age = age + 7;
		System.out.println("In 7 years, you will be " + age + " years old.");
	}
}
