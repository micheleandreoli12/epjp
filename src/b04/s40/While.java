package b04.s40;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

public class While {
	public static void main(String[] args) {
		boolean condition = true;
		boolean something = true;

		while (condition) {
			System.out.println("something is true");

			if (something) {
				condition = false;
			}
		}

		int[] array = { 3, 6, 8, 5, 9 };
//		int i = 0;

//		while (array[i] % 3 == 0) {
//			System.out.println(array[i]);
//			i += 1;
//		}
		
		for (int i=0; i < array.length; i++) {
			if(i%2 ==1) {
				continue;
			}
			if(array[i] % 3 == 0) {
			System.out.println(array[i]);
		}
	}
}
}
