package breakReview;

public class Employee {
	private String name;
	private double rate;
	private double hours;
	
	public Employee() {
		name = "John Smith";
		rate = 10;
		hours = 0;
	}
	public Employee(String n, double r, double h) {
		name = n;
		rate = r;
		hours = h;
	}
	
	public void setRate(double r) {
		rate = r;
	}
	public void setHours(double h) {
		hours = h;
	}
	public String getName() {
		return name;
	}
	public double calcPay(int week) {
		double pay = hours * rate;
		return pay;
	}
}
