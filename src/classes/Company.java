package classes;

import java.util.Scanner;
import java.util.ArrayList;

public class Company {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		System.out.println("Number of Employees:");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			emps.add(new Employee());
		}
		
		System.out.print("Rase: $");
		double raise = input.nextDouble();
		emps.get(emps.size()-1).modifyRate(raise);
		
		System.out.println("Pays for the 7th week of the year:");
		for (int i = 0; i < emps.size(); i++) {
			System.out.println("$" + emps.get(i).calcPay(7));
		}
		
		double total = 0;
		for (int e = 0; e < emps.size(); e++) {
			for (int w = 0; w < 52; w++) {
				total += emps.get(e).calcPay(w);
			}
		}
		
		System.out.println("Total amount paid to the employees this year: $" + total);

	}
}
