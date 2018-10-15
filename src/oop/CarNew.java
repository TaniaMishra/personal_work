package oop;

public class CarNew {
	private int mpg;
	private int tankCap;
	private int fuel;
	private int odometer;
	
	public CarNew() {
		mpg = 20;
		tankCap = 20;
		fuel = 20;
		odometer = 0;
	}
	public CarNew(int newMPG, int newTankCap, int newFuel, int newOdometer) {
		mpg = newMPG;
		tankCap = newTankCap;
		fuel = newFuel;
		odometer = newOdometer;
	}
	
	public int getMPG() {
		return mpg;
	}
	public int getTankCap() {
		return tankCap;
	}
	public int getFuel() {
		return fuel;
	}
	public int getOdometer() {
		return odometer;
	}
	public void setMPG(int newMPG) {
		mpg = newMPG;
	}
	public void setTankCap(int newTankCap) {
		tankCap = newTankCap;
	}
	public void setFuel(int newFuel) {
		fuel = newFuel;
	}
	public void setOdometer(int newOdometer) {
		odometer = newOdometer;
	}
	
	public void fillTank(int numGal) {
		fuel += numGal;
	}
	public void driveCar(int milesDriven) {
		double galUsed = milesDriven/mpg;
		fuel -= galUsed;
		odometer += milesDriven;
	}
}
