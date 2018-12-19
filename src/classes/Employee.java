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
	
	public Employee(String n, double r) {
		name = n;
		rate = r;
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
	
	public String toString() {
		return ("Employee: name - " + name + ", rate - " + rate + ", hoursWorked - " + hoursWorked + ", employeeClassNum - " + employeeClassNum + ", employeeNum - " + employeeNum);
	}
	
	public Employee clone() {
		return new Employee(name, rate);
	}
	
	public boolean equal(Employee user) {
		if (this.toString().equals(user.toString())) {
			return true;
		}
		else {
			return false;
		}
	}
}
