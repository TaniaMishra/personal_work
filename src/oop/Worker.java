package oop;

public class Worker {
	private int hours;
	private double pay;
	
	public Worker() {
		hours = 1;
		pay = 10.5;
	}
	public Worker(int newhr, double newPay) {
		hours = newhr;
		pay = newPay;
	}
	
	
	public int getHours() {
		return hours;
	}
	public double getPay() {
		return pay;
	}
	public void changeHours(int diffHours) {
		hours = diffHours;
	}
	public void changePay(double diffPay) {
		pay = diffPay;
	}
	
	
	public double payCheck() {
		double totalPay = hours * pay;
		return totalPay;
	}
	
	
	public void raise(double addition) {
		pay = pay + addition;
	}
}
