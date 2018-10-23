package decisions;

public class ModifiedCar {
	private int mpg;
	private int tankCap;
	private int fuel;
	private int odometer;
	
	public ModifiedCar() {
		mpg = 20;
		tankCap = 20;
		fuel = 20;
		odometer = 0;
	}
	public ModifiedCar(int newMPG, int newTankCap, int newFuel, int newOdometer) {
		if (newMPG <= 0) {
			mpg = 20;
		}
		else {
			mpg = newMPG;
		}
		
		if (tankCap <= 0) {
			tankCap = 20;
		}
		else {
			tankCap = newTankCap;
		}

		if (fuel < 0 || fuel > tankCap) {
			fuel = 20;
		}
		else {
			fuel = newFuel;
		}

		if (odometer < 0) {
			odometer = 0;
		}
		else {
			odometer = newOdometer;
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
		if (newMPG <= 0) {
			mpg = 20;
		}
		else {
			mpg = newMPG;
		}
	}
	public void setTankCap(int newTankCap) {
		if (tankCap <= 0) {
			tankCap = 20;
		}
		else {
			tankCap = newTankCap;
		}
	}
	public void setFuel(int newFuel) {
		if (fuel < 0 || fuel > tankCap) {
			fuel = 20;
		}
		else {
			fuel = newFuel;
		}
	}
	public void setOdometer(int newOdometer) {
		if (odometer < 0) {
			odometer = 0;
		}
		else {
			odometer = newOdometer;
		}
	}
	
	public void fillTank(int numGal) {
		if (numGal <= (tankCap - fuel) && numGal >= 0) {
			fuel += numGal;
		}
		else {
			System.out.println("Overload of fuel! (OR) Invalid entry.");
		}
	}
	public void driveCar(int milesDriven) {
		if (milesDriven > 0) {
			double galUsed = milesDriven/mpg;
			fuel -= galUsed;
			odometer += milesDriven;
		}
		else {
			System.out.println("Invalid entry");
		}
	}
}
