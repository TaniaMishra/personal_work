package comparableInterfaces;

public class CatStart implements Comparable<CatStart> {
	private int age;
	private int sleep;

	public CatStart() {
		age = 1;
		sleep = 12;
	}

	public CatStart(int xAge, int xSleep) {
		age = xAge;
		sleep = xSleep;
	}

	public int getAge() {
		return age;
	}

	public int getSleep() {
		return sleep;
	}

	public void setAge(int xAge) {
		age = xAge;
	}

	public void setSleep(int xSleep) {
		sleep = xSleep;
	}

	public void birthday() {
		age++;
	}

	public void sleepMore() {
		sleep++;
	}

	public void sleepless() {
		sleep--;
	}
	
	public int compareTo(CatStart user) {
		if (age == user.getAge()) {
			return 0;
		}
		else if (age > user.getAge()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
