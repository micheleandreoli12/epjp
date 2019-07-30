package b06.s073;

public class Person {
	protected String name;
	protected String surname;
	
	Person() {
		this("Mario");
	}
	
	Person(String name) {
		this(name,"Rossi");
	}
	
	Person(String name, String surname) {
		this.name=name;
		this.surname=surname;
	}

	@Override
	public String toString() {
		String s="La persona si chiama "+name + " " + surname;
		// TODO Auto-generated method stub
		return s;
	}
	
	

}
