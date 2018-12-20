package classes;

import java.util.Random;

public class Employee {
	private String name;
	private double rate;
	private double[] hoursWorked;
	private static int employeeClassNum = 0;
	private int employeeNum;
	
	public Employee() {
		name = "John Smith";
		rate = 10;
		employeeNum = employeeClassNum;
		employeeClassNum++;
		hoursWorked = new double[52];
		Random rand = new Random();
		for (int i = 0; i < hoursWorked.length; i++) {
			int num = rand.nextInt(41);
			hoursWorked[i] = (double)num;
		}
	}
	
	public Employee(String n, double r) {
		name = n;
		rate = r;
		employeeNum = employeeClassNum;
		employeeClassNum++;
		Random rand = new Random();
		hoursWorked = new double[52];
		for (int i = 0; i < hoursWorked.length; i++) {
			int num = rand.nextInt(41);
			hoursWorked[i] = (double)num;
		}
	}
	
	public void modifyRate(double add) {
		rate += add;
	}
	
	public double calcPay(int week) {
		double hours = hoursWorked[week-1];
		double pay = hours * rate;
		return pay;
	}
	
	public String toString() {
		String emp = ("Employee: name - " + name + ", rate - " + rate + ", employeeClassNum - " + employeeClassNum + ", employeeNum - " + employeeNum + ", hoursWorked - " + hoursWorked); //fix - APPEND STRING
		//for (double x : hoursWorked) {
		//	emp.append(hoursWorked[x]);
		//}
		return emp;
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
