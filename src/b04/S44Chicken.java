package b04;

public class S44Chicken {
	private String name;
	private double weight;
	private boolean female;
	private static final double DEFAULT_WEIGHT = 1.0;
	private static final String DEFAULT_NAME = "Unknown";

	

	public S44Chicken(String name) {
		
		this.weight = DEFAULT_WEIGHT;
		this.name = name;
		this.female = true;
		
	}
	public S44Chicken(String name, double weight) {
		
		this.weight = weight;
		this.name = name;
		this.female = true;
		
	}
	public S44Chicken() {
		
		this.weight = DEFAULT_WEIGHT;
		this.name = DEFAULT_NAME;
		this.female = true;
		
	}
public S44Chicken(String name, double weight, boolean female) {
		
		this.weight = weight;
		this.name = name;
		this.female = female;
		
	}
@Override
public String toString() {
//	return "S44Chicken [name=" + name + ", weight=" + weight + ", female=" + female + "]";
//	String result = "["+ name + "," + weight + "," + female + "]";
	
	String result = String.format("%s, %.5f, %b", name , weight , female );
	
	return result;
}

}
