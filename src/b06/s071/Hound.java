package b06.s071;

public class Hound extends Dog {
	private String classname = "Mastino";
	
	public Hound() {
		super();
	}
	
	public Hound(String name) {
		super(name);
	}
	
	public Hound(int weight) {
		super(weight);
	}
	
	public Hound(String name, int weight) {
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