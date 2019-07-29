package b06.s071;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle();
		Hound hound= new Hound("Wilson", 60);
		Poodle p2= new Poodle("Bobby");

		System.out.println(poodle.toString());
		System.out.println(hound.toString());
		System.out.println(hound.getName());
		System.out.println(p2.toString());
	}

	
}
