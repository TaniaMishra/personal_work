package comparableInterfaces;

public class WorkerStart implements Comparable<WorkerStart>{
	private int hours;
	private double rate;

	// constructor(s)
	public WorkerStart() {
		hours = 40;
		rate = 3.50;
	}

	public WorkerStart(int newHours, double newRate) {
		hours = newHours;
		rate = newRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int xHours) {
		hours = xHours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double xRate) {
		rate = xRate;
	}

	public double payCheck() {
		return hours * rate;
	}

	public void raise(double amount) {
		rate = rate + amount;
	}
	
	public String toString() {
		return ("WorkerStart: hours - " + hours + ", rate: " + rate);
	}
	
	public int compareTo(WorkerStart user) {
		if (Math.abs(rate-user.getRate()) <= 0.001) {
			return 0;
		}
		else if (rate < user.getRate()) {
			return -1;
		}
		else {
			return 1;
		}
	}
}
