package breakReview;

import java.util.Scanner;

public class EmployeePay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee[][] emp = new Employee[2][1];
		for (int r = 0; r < emp.length; r++) {
			for (int c = 0; c < emp[0].length; c++) {
				System.out.println("Enter name: ");
				input.next();
				String name = input.nextLine();
				System.out.println("Enter rate of pay: ");
				int pay = input.nextInt();
				System.out.println("Enter hours worked: ");
				int hours = input.nextInt();
				emp[r][c] = new Employee(name, pay, hours);
			}
		}
		
		System.out.println("Enter a shift (1, 2, or 3): ");
		int num = input.nextInt();
		num--;
		
		double average = 0;
		for (int c = 0; c < emp[0].length; c++) {
			String name = emp[num][c].getName();
			int space = name.indexOf(' ');
			System.out.println(name.charAt(space-1));
			average += emp[num][c].calcPay();
		}
		average = average/emp[0].length;
		System.out.println("Average Pay: $" + average);
		
		input.close();
	}
}
