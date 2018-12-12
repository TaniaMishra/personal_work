package arrays;

import java.util.Scanner;

public class SSNBreakdown {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a social serurity number in the format XXX-XX-XXXX:");
		String ssn = input.next();
		int dash = ssn.indexOf('-');
		String ending = ssn.substring(dash+1);
		dash = ending.indexOf('-');
		String middle = ending.substring(0, dash);
		
		int firstChar = middle.charAt(0);
		char lastChar = middle.charAt(1);
		
		for (int i = 48; i < 58; i++) {
			if (firstChar == i) {
				
			}
		}
		
		System.out.println(firstChar);
		
	}
}
