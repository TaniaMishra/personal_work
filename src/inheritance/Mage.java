package inheritance;

import java.util.Random;

public class Mage extends Player {
	private int spells;
	
	public Mage() {
		super();
		spells = 0;
	}
	public Mage(int h, int x, int y, int s) {
		super(h, x, y);
		if (s >= 0) {
			spells = s;
		}
		else {
			spells = 0;
		}
	}
	
	public int getSpells() {
		return spells;
	}
	
	public void setSpells(int s) {
		spells = s;
	}
	
	public void move() {
		Random rand = new Random();
		int x = super.getX();
		x += (1 + rand.nextInt(10));
		super.setX(x);
		
		int y = super.getY();
		y += (1 + rand.nextInt(10));
		super.setY(y);
		
		int healthPoints = 1 + rand.nextInt(10);
		if (healthPoints == 1) {
			int newHealth = super.getHealth();
			newHealth = newHealth-10;
			super.setHealth(newHealth);
		}
		
		int learnSpell = 1 + rand.nextInt(8);
		if (learnSpell == 1) {
			spells++;
		}
	}
	public String stats() {
		return ("Mage: spells - " + spells + " " + super.stats());
	}
}
