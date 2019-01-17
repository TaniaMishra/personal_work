package inheritance;

public class Player {
	private int health; //50 = healthy, 0 = dead
	private int locX;
	private int locY;
	
	public Player() {
		health = 50;
		locX = 20;
		locY = 20;
	}
	public Player(int h, int x, int y) {
		if (h >= 0 && h <= 50) {
			health = h;
		}
		else {
			health = 50;
		}
		locX = x;
		locY = y;
	}
	
	public int getHealth() {
		return health;
	}
	public int getX() {
		return locX;
	}
	public int getY() {
		return locY;
	}
	
	public void setHealth(int h) {
		if (h <= 50 && h >= 0) {
			health = h;
		}
		else {
			health = 0;
		}
	}
	public void setX(int x) {
		locX = x;
	}
	public void setY(int y) {
		locY = y;
	}
	
	public void move() {
		locX++;
		locY++;
	}
	public boolean dead() {
		if (health == 0) {
			return true;		//dead
		}
		else {
			return false;		//alive
		}
	}
	public String stats() {
		return ("Player: health - " + health + ", locX - " + locX + ", locY - " + locY);
	}
}
