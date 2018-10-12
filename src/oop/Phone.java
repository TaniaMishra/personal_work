package oop;

public class Phone {
	private long phoneNum;
	private long speedDial;
	private long lastCall;
	private int emergency;
	private long numCalls;
	private double numMin;
	
	public Phone() {
		phoneNum = 1111111111;
		speedDial = 1111111111;
		lastCall = 1111111111;
		emergency = 911;
		numCalls = 999;
		numMin = 9999;
	}
	public Phone(long newPhoneNum, long newSpeedDial, long newLastCall, long newNumCalls, double newNumMin) {
		phoneNum = newPhoneNum;
		speedDial = newSpeedDial;
		lastCall = newLastCall;
		emergency = 911;
		numCalls = newNumCalls;
		numMin = newNumMin;
	}
	
	
}
