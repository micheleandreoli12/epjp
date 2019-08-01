package ex;

public class Villain extends Person {
	private static final int SHOOTINGDEF= 500;
	private int shootingpower;

	Villain(String name) {
		super(name);
		this.shootingpower=SHOOTINGDEF;
	}
	
	Villain(String name, int value) {
		super(name,value);
		this.shootingpower=SHOOTINGDEF;
	}
	

	Villain(String name, int value, int power) {
		super(name,value);
		this.shootingpower=power;
	}
	
	public void shoot(Person person) {
		person.changeenergy(-shootingpower);
	}

}
