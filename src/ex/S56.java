package ex;

public class S56 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		// TODO
		StringBuilder reverse = new StringBuilder();
		int l = s.length();
		for (int i = 0; i < l; i++) {
			reverse = reverse.append(s.charAt(l - 1 - i));
		}
		return reverse.toString();
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		// TODO
		int l = s.length();
		boolean palindrome = true;
		for (int i = 0; i < Math.ceil(l / 2); i++) {
			if (s.charAt(i) == s.charAt(l - 1 - i)) {
				palindrome = true;
			} else {
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {
		// TODO

		StringBuilder novowel = new StringBuilder(s);
		int l = s.length();
		for (int i = 0; i < l; i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				novowel = novowel.delete(i, i);
				i = i - 1;
				l = novowel.length();
			}
		}

		return novowel.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// TODO
		int l = s.length();
		int dec = 0;
		if (s.charAt(0) == '-') {
			for (int i = 1; i < l; i++) {
				if (s.charAt(i) != '0' || s.charAt(i) != '1') {
					dec = 0;
					break;
				} else if (s.charAt(i) == '1') {
					dec = (int) (dec + Math.pow(2, l - i));
				}
				// If char is 0 there is no need to complete an action
			}
			dec = -dec;
		} else {
			for (int i = 0; i < l; i++) {
				if (s.charAt(i) != '0' || s.charAt(i) != '1') {
					dec = 0;
					break;
				} else if (s.charAt(i) == '1') {
					dec = (int) (dec + Math.pow(2, l - i));
				}
				// If char is 0 there is no need to complete an action
			}
		}
		return dec;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];

		// TODO
		int l=data.length;
		for(int i=0; i<l; i++) {
			result[i]=data[data.length-1];
		}
		

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		// TODO
		return 0;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		// TODO
		return 0;
	}
}
