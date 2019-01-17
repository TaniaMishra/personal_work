package inheritance;

public class Employee {
	private String name;
	private double rate;
	
	public Employee() {
		name = "John Smith";
		rate = 5;
	}
	public Employee(String n, double r) {
		name = n;
		rate = r;
	}
	
	public String getName() {
		return name;
	}
	public double getRate() {
		return rate;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setRate(double r) {
		rate = r;
	}
	
	public double calcPay(double hours) {
		double pay = hours * rate;
		return pay;
	}
	
	public String toString() {
		return ("Employee: name - " + name + ", rate - " + rate);
	}
	public boolean equals(Object user) {
		return (this.toString().equals(user.toString()));
	}
	public Employee clone() {
		return (new Employee(name, rate));
	}
}
