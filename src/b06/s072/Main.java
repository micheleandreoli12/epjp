package b06.s072;

public class Main {
	public static void main(String[] args) {
		Dog tom = new Dog("Tom", 2.42);

		String name = tom.getName();
		double speed = tom.getSpeed();

		System.out.println("Name and speed: " + name + ", " + speed);

		Dog[] Dogs = new Dog[12];
		Dogs[0] = new Dog("Bobby", 1.1);
		Dogs[1] = new Dog("Wilson", 3.5);
		Dogs[2] = new Dog("Fido", Math.random());
		Dogs[3] = new Dog("Rocco", Math.random() * 3);
		Dogs[4] = new Dog("Kevin", Math.random() * 4);
		Dogs[5] = new Dog("Pippo", 3);
		Dogs[6] = new Dog("Pluto", 2.6);
		Dogs[7] = new Dog("Kripton", 2.1);
		Dogs[8] = new Dog("Archie", 2.2);
		Dogs[9] = new Dog("Argo", 0.4);
		Dogs[10] = new Dog("Fuffy", 0.9);
		Dogs[11] = new Dog("Spike", Math.random() * 2);

		Dog fastest = Dogs[0];

		for (int i = 1; i < 12; i++) {
			if (Dogs[i].getSpeed() > fastest.getSpeed()) {
				fastest = Dogs[i];
			}
		}
		System.out.println("Il cane pi� veloce � " + fastest.getName() + " v=" + fastest.getSpeed());

	}
}
