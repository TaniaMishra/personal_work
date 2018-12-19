package classes;

public class Car {
	private int mpg;
	private int tankCap;
	private int fuel;
	private int odometer;
	
	public Car() {
		mpg = 20;
		tankCap = 20;
		fuel = 20;
		odometer = 0;
	}
	/*
	 * @ fuel has to be less than or equal to tankCap and greater than zero
	 */
	public Car(int newMPG, int newTankCap, int newFuel, int newOdometer) {
		mpg = newMPG;
		tankCap = newTankCap;
		odometer = newOdometer;
		if (newFuel <= tankCap && newFuel >= 0) {
			fuel = newFuel;
		}
		else {
			fuel = tankCap;
		}
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
	/*
	 * @ fuel has to be less than or equal to tankCap and greater than zero
	 */
	public void setFuel(int newFuel) {
		if (newFuel <= tankCap && newFuel >= 0) {
			fuel = newFuel;
		}
		else {
			fuel = tankCap;
		}
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
	public Car clone() {
		return new Car(mpg, tankCap, fuel, odometer);
	}
	public String toString() {
		return ("Car object: mpg - " + mpg + ", tankCap - " + tankCap + ", fuel - " + fuel + ", odometer - " + odometer);
	}
	public boolean equals(Car user) {
		if (this.toString().equals(user.toString())) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
