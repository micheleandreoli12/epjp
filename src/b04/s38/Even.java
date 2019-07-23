package b04.s38;

public class Even {

	public static void main(String[] args) {
		int value = 0;

		if (value % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		if (value < 0) {
			System.out.println("negative");
		} else if (value < 100) {
			if (value % 2 == 0) {
				System.out.println("small even");
			} else {
				System.out.println("small odd");
			}
		} else {
			System.out.println("big");
		}
	}

}
