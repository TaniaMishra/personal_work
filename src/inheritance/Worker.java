package inheritance;

public class Worker extends Employee {
	private double years;
	
	public Worker() {
		super();
		years = 2;
	}
	public Worker(String n, double r, double y) {
		super(n, r);
		years = y;
	}
	
	public double getYears() {
		return years;
	}
	
	public void setYears(double y) {
		years = y;
	}
	
	public double calcPay(double hours) {
		double pay = hours * super.getRate();
		if (years > 10) {
			double bonus = 0.20 * pay;
			pay += bonus;
		}
		return pay;
	}
	
	public String toString() {
		return ("Worker: years of experience - " + years + " " + super.toString());
	}
	public boolean equals(Object user) {
		return (this.toString().equals(user.toString()));
	}
	public Worker clone() {
		return (new Worker(super.getName(), super.getRate(), years));
	}
}
