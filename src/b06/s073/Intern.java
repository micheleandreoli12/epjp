package b06.s073;

public class Intern extends Person {

	protected int refund;
	private static int DEFAULT_REFUND=1000;
	
	public Intern() {
		this(DEFAULT_REFUND);
	}
	
	public Intern(int refund) {
		super();
		this.refund=refund;
	}
	
	public Intern(String name, String surname, int refund) {
		super(name, surname);
		this.refund=refund;
	}
	
	

	@Override
	public String toString() {
		String s=super.toString()+" il suo rimborso è " + refund;
		// TODO Auto-generated method stub
		return s;
	}
	
	

}
