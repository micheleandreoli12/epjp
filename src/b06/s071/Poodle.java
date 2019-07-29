package b06.s071;

public class Poodle extends Dog {
	private String classname = "Barboncino";
	
	public Poodle() {
		super();
	}
	
	public Poodle(String name) {
		super(name);
	}
	
	public Poodle(String name, int weight) {
		super(name, weight);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String toString(String NAMECLASS) {
		// TODO Auto-generated method stub
		return super.toString(classname);
	}
	
	

}
