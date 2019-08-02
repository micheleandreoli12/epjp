package ex;

public class Hero extends Person {
	private int bonus;
	private static final int BONUSDEF=50;
	
	Hero(String name) {
		super(name);
		this.bonus=BONUSDEF;
	}
	
	Hero(String name, int value) {
		super(name,value);
		this.bonus=BONUSDEF;
	}
	

	Hero(String name, int value, int power) {
		super(name,value);
		this.bonus=power;
	}
	
	public boolean arrest(Person person) {
		int energy= this.getenergy();
		int boosted= energy+ bonus;
		if(boosted>person.getenergy()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getclass() {
		return "eroe";
	}

}
