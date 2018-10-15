package oop;

public class Phone {
	private long phoneNum;
	private long speedDial;
	private long lastCall;
	private final int EMERGENCY;
	private long numCalls;
	private double numMin;
	
	public Phone() {
		phoneNum = 1111111111;
		speedDial = 1111111111;
		lastCall = 1111111111;
		EMERGENCY = 911;
		numCalls = 999;
		numMin = 9999;
	}
	public Phone(long newPhoneNum, long newSpeedDial, long newLastCall, long newNumCalls, double newNumMin) {
		phoneNum = newPhoneNum;
		speedDial = newSpeedDial;
		lastCall = newLastCall;
		EMERGENCY = 911;
		numCalls = newNumCalls;
		numMin = newNumMin;
	}
	
	public long getNum() {
		return phoneNum;
	}
	public long getSpeedDial() {
		return speedDial;
	}
	public long getLastCall() {
		return lastCall;
	}
	public int getEmergency() {
		return EMERGENCY;
	}
	public long getNumCalls() {
		return numCalls;
	}
	public double getNumMin() {
		return numMin;
	}
	
	public void setNum(long diffNum) {
		phoneNum = diffNum;
	}
	public void setSpeedDial(long diffSpeedDial) {
		speedDial = diffSpeedDial;
	}
	public void setLastCall(long diffLastCall) {
		lastCall = diffLastCall;
	}
	public void setNumCalls(long diffNumCalls) {
		numCalls = diffNumCalls;
	}
	public void setNumMin(double diffNumMin) {
		numMin = diffNumMin;
	}
	
	
	public void makeCall(long numCalled, double min) {
		lastCall = numCalled;
		numMin += min;
		numCalls++;
	}
	
}
