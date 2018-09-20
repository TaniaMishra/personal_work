package inputExamples;

import java.util.Scanner;

public class LockerCombo {
	public static void main(String[] args) {
		Scanner inputNum = new Scanner(System.in);
		int comboNum1 = 00;
		int comboNum2 = 00;
		int comboNum3 = 00;
		System.out.println("What is the first number (first 2 digits) of your combination lock?");
		comboNum1 = inputNum.nextInt();
		System.out.println("What is the second number (second 2 digits) of your combination lock?");
		comboNum2 = inputNum.nextInt();
		System.out.println("What is the third number (third 2 digits) of your combination lock?");
		comboNum3 = inputNum.nextInt();
		System.out.println("Your combination is: " + comboNum1 + " - " + comboNum2 + " - " + comboNum3);
	}
}
