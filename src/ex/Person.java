package ex;

abstract public class Person {
	private static final int INITIALENERGY = 100;
	private int energy = INITIALENERGY;
	private String name;

	Person(String name) {
		this(name, INITIALENERGY);
	}

	Person(String name, int energy) {
		this.name = name;
		this.energy = energy;
	}

	public void changeenergy(int value) {
		energy = energy + value;
	}

	public boolean isalive() {
		if (energy > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getenergy() {
		return energy;
	}
	
	public String getname() {
		return name;
	}
	
	

}
