package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class TestWorkPlace {
	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Employee> peeps = new ArrayList<Employee>();
		for (int i = 0; i < 50; i++) {
			int type = 1 + rand.nextInt(2);
			if (type == 1) {
				peeps.add(new Worker());
			}
			else {
				peeps.add(new Manager());
			}
		}
		
		double totalPay = 0;	//total pay for all employees for working 40 hours
		for (Employee x : peeps) {
			
		}
	}
}
