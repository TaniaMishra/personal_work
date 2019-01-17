package inheritance;

public class Manager extends Employee{
	private int level;
	
	public Manager() {
		super();
		level = 2;
	}
	public Manager(String n, double r, int l) {
		super(n, r);
		level = l;
	}
	
	public double getLevel() {
		return level;
	}
	
	public void setLevel(int l) {
		level = l;
	}
	
	public double calcPay(double hours) {
		double pay = hours * super.getRate();
		double bonus = level/100;
		pay += bonus;
		return pay;
	}
	
	public String toString() {
		return ("Manager: level - " + level + " " + super.toString());
	}
	public boolean equals(Object user) {
		return (this.toString().equals(user.toString()));
	}
	public Manager clone() {
		return (new Manager(super.getName(), super.getRate(), level));
	}
}
