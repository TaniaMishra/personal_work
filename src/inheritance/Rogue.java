package inheritance;

import java.util.Random;

public class Rogue extends Player{
	private int kills;
	
	public Rogue() {
		super();
		kills = 0;
	}
	public Rogue(int h, int x, int y, int k) {
		super(h, x, y);
		if (k >= 0) {
			kills = k;
		}
		else {
			kills = 0;
		}
	}
	
	public int getKills() {
		return kills;
	}
	
	public void setKills(int k) {
		if (k >= 0) {
			kills = k;
		}
	}
	
	public void move() {
		Random rand = new Random();
		int x = super.getX();
		x += (1 + rand.nextInt(50));
		super.setX(x);
		
		int y = super.getY();
		y += (1 + rand.nextInt(50));
		super.setY(y);
		
		int healthPoints = 1 + rand.nextInt(4);
		if (healthPoints == 1) {
			int newHealth = super.getHealth();
			newHealth = newHealth-10;
			super.setHealth(newHealth);
		}
		
		int killOpponent = 1 + rand.nextInt(5);
		if (killOpponent == 1) {
			kills++;
		}
	}
	public String stats() {
		return ("Rogue: kills - " + kills + " " + super.stats());
	}
}
