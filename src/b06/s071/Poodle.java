package b06.s071;

public class Poodle extends Dog {
	String classname = "Barboncino";
	private int curldensity;
	private static int curlDensitydef=12;
	
	public Poodle() {
		super();
	}
	
	public Poodle(String name) {
		super(name);
	}
	
	public Poodle(int weight) {
		super(weight);
	}
	
	public Poodle(String name, int weight) {
		super(name, weight);
		this.curldensity=curlDensitydef;
	}
	
	public Poodle(String name, int weight, int curldensity) {
		super(name, weight);
		this.curldensity=curldensity;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String toString(String NAMECLASS) {
		// TODO Auto-generated method stub
		return (super.toString(classname) +" curldensity " + curldensity);
	}
	
	

}
