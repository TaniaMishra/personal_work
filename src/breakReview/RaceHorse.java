package breakReview;

public class RaceHorse {
	private String name;
	private int numRaces;
	private int numMiles;
	
	public RaceHorse() {
		name = "Bob";
		numRaces = 0;
		numMiles = 0;
	}
	public RaceHorse(String n, int r, int m) {
		name = n;
		numRaces = r;
		numMiles = m;
	}
	public String getName() {
		return name;
	}
	public int getNumRaces() {
		return numRaces;
	}
	public int getNumMiles() {
		return numMiles;
	}
	public void setName(String n) {
		name = n;
	}
	public void setNumRaces(int r) {
		numRaces = r;
	}
	public void setNumMiles(int m) {
		numMiles = m;
	}
	public void race(int length) {
		numRaces++;
		numMiles += length;
	}
	
}
