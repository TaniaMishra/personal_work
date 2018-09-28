package mathOperators;

import java.util.Scanner;

public class PhoneNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long areaCode = 000;
		long first3 = 000;
		long last4 = 0000;
		
		System.out.println("What is your phone number?");
		long phoneNum = input.nextLong();
		
		
		last4 = phoneNum % 10000;
		phoneNum = phoneNum / 10000;
		first3 = phoneNum % 1000;
		phoneNum = phoneNum / 1000;
		areaCode = phoneNum % 1000;
		
		System.out.println("Your phone number is: (" + areaCode + ") " + first3 + "-" + last4);
	}
}
