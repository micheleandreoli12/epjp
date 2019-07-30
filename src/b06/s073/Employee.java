package b06.s073;

public class Employee extends Person {
	
	protected int wage;
	private static int DEFAULT_WAGE=1500;
	
	public Employee() {
		this(DEFAULT_WAGE);
	}
	
	public Employee(int wage) {
		super();
		this.wage=wage;
	}
	
	public Employee(String name, String surname, int wage) {
		super(name, surname);
		this.wage=wage;
	}
	
	public double getAnnual() {
		double annual= (wage*15)*1.1;
		return annual;
	}
	
	

	@Override
	public String toString() {
		String s=super.toString()+" il suo stipendio è " + wage;
		// TODO Auto-generated method stub
		return s;
	}
	
	

}
