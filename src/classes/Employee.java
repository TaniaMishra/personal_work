package classes;

import java.util.ArrayList;
import java.util.Random;

public class Employee {
	private String name;
	private double rate;
	private ArrayList<Double> hoursWorked;
	private static int employeeClassNum = 0;
	private int employeeNum;
	
	public Employee() {
		name = "John Smith";
		rate = 10;
		employeeNum = employeeClassNum;
		employeeClassNum++;
		Random rand = new Random();
		for (int i = 0; i < 52; i++) {
			int num = rand.nextInt(41);
			hoursWorked.add((double)num);
		}
	}
	
	public void modifyRate(double add) {
		rate += add;
	}
	
	public double calcPay(int week) {
		double hours = hoursWorked.get(week);
		double pay = hours * rate;
		return pay;
	}
	
	public String empToString() {
		Employee emp = new Employee();
		return emp.toString();
	}
	
	public Employee clone() {
		Employee emp = new Employee();
		return emp;
	}
	
	public boolean equalsTo(Employee user) {
		Employee emp = new Employee();
		if (emp.equals(user)) {
			return true;
		}
		else {
			return false;
		}
	}
}
