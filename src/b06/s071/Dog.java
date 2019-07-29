package b06.s071;

abstract public class Dog {
	private static final int DEFAULT_WEIGHT = 10;
	private static final String DEFAULT_NAME = "Unknown";

	private int weight;
	private String name;
	private String classname= "Cane";

	public Dog() {
		this(DEFAULT_NAME);
	}

	public Dog(String name) {
		this(name, DEFAULT_WEIGHT);
	}

	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		String s=toString(classname);
		return s;
	}

	public String toString(String NAMECLASS) {
		// TODO Auto-generated method stub
		String s = ("Il " + NAMECLASS + " si chiama " + name + " e pesa " + weight);
		return s;

	}

}
