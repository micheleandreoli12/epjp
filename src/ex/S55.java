package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		// TODO
		int sum = 0;
		if (first - last > 0) {
			return 0;
		} else {
			for (int i = first; i <= last; i++) {
				sum = sum + i;
			}
			return sum;
		}
	}
	
	public static long sumex(int first, int last) throws Exception {
		// TODO
		int sum = 0;
		if (first - last > 0) {
			throw new Exception("first should be smaller than last");
		} else {
			for (int i = first; i <= last; i++) {
				sum = sum + i;
			}
			return sum;
		}
	}


	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		// TODO
		int sum = 0;
		if (first - last > 0) {
			return 0;
		} else {
			for (int i = first; i <= last; i++) {
				if (i % 2 == 0) {
					sum = sum + i;
				} else {
					sum = sum + 0;
				}
			}
			return sum;
		}
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		// TODO
		int fatt = 1;
		if (value < 0) {
			return 0;
		} else {
			if (value < 25) {
				if (value == 0) {
					return fatt;
				} else {
					for (int i = 1; i <= value; i++) {
						fatt = fatt * i;
					}
				}
			} else {
				return 0;
			}
		}
		return fatt;
	}
	
	public static long factorialE(int value) throws Exception {
		// TODO
		int fatt = 1;
		if (value < 0) {
			throw new Exception("value must be positive and < 25");
		} else {
			if (value < 25) {
				if (value == 0) {
					return fatt;
				} else {
					for (int i = 1; i <= value; i++) {
						fatt = fatt * i;
					}
				}
			} else {
				throw new Exception("value must be positive and < 25");
			}
		}
		return fatt;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		// TODO
		long f0=0;
		long f1=1;
		long fvalue=0;
		if(value==0) {
			return 0;
		} else if(value==1) {
			return 1;
		} else {
			for(int i=2; i<=value; i++) {
				fvalue=f1+f0;
				f0=f1;
				f1=fvalue;
			}
			return fvalue;
		}
	}
	
	public static long fibonacciExc(int value) throws Exception {
		// TODO
		long f0=0;
		long f1=1;
		long fvalue=0;
		if(value<0) {
			throw new Exception("index cannot be < 0");
		}else if(value==0) {
			return 0;
		} else if(value==1) {
			return 1;
		} else {
			for(int i=2; i<=value; i++) {
				fvalue=f1+f0;
				f0=f1;
				f1=fvalue;
			}
			return fvalue;
		}
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[Math.abs(value)][Math.abs(value)];

		// TODO
		for(int i=0; i<Math.abs(value); i++) {
			for(int j=0; j<Math.abs(value); j++) {
				result[i][j] = (i+1)*(j+1);
				if(value<0) {
					result[i][j] = -result[i][j];
				}
			}
		}

		return result;
	}
}
