package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class TestWorkPlace {
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Employee> peeps = new ArrayList<Employee>();
		for (int i = 0; i < 15; i++) {
			int type = 1 + rand.nextInt(2);
			if (type == 1) {
				peeps.add(new Worker("Bob" + i, i+10, i+1));
			}
			else {
				peeps.add(new Manager("Smith" + i, i+10, i+1));
			}
		}
		
		double totalPay = 0;	//total pay for all employees for working 40 hours
		for (Employee x : peeps) {
			if (x instanceof Worker) {
				Worker tempW = (Worker)x;
				totalPay += tempW.calcPay(40);
			}
			else {
				Manager tempM = (Manager)x;
				totalPay += tempM.calcPay(40);
			}
		}
		System.out.println("Total pay for all employees for working 40 hours: " + totalPay);
		
		System.out.println("State of the workers:");
		for (Employee x : peeps) {
			if (x instanceof Worker) {
				System.out.println(x.toString());
			}
		}
		
		for (int i = peeps.size()-1; i >= 0; i--) {
			if (peeps.get(i) instanceof Manager) {
				peeps.remove(i);
				break;
			}
		}
		
		System.out.println("All employees making more than $20/hour:");
		for (Employee x : peeps) {
			if (x.getRate() > 20) {
				System.out.println(x.getName());
			}
		}
	}
}
