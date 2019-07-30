package ex;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class S55Test {

	@Test
	void sumPositive() {
		long actual = S55.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumNegPos() {
		long actual = S55.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S55.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
	long actual = S55.sum(1003, 1002);

		assertThat(actual, is(0L));
	}
	@Test
	void sumExc() {
		try {
			S55.sumex(3, 1);
			fail("Should not get to this point");
		} catch(Exception e) {
			String expected = "first should be smaller than last";
			assertThat(e.getMessage(), is(expected));
		}
	}
	
	
	

	@Test
	void sumNegative() {
		long actual = S55.sum(-3, -1);

		assertThat(actual, is(-6L));
	}

	@Test
	void evenSumPositive() {
		long actual = S55.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S55.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S55.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumSingle2() {
		long actual = S55.evenSum(1001, 1001);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S55.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S55.factorial(4);

		assertThat(actual, is(24L));
	}

	@Test
	void factorialNegative() {
		long actual = S55.factorial(-4);

		assertThat(actual, is(0L));
	}
	
	@Test
	void factorialNegativeExc() {
		try {
			S55.factorialE(-4);
			fail("Should not get to this point");
		} catch(Exception e) {
			String expected = "value must be positive and < 25";
			assertThat(e.getMessage(), is(expected));
		}
		
	}
	
	@Test
	void factorialOver25Exc() {
		try {
			S55.factorialE(28);
			fail("Should not get to this point");
		} catch(Exception e) {
			String expected = "value must be positive and < 25";
			assertThat(e.getMessage(), is(expected));
		}
		
	}

	@Test
	void factorialZero() {
		long actual = S55.factorial(0);

		assertThat(actual, is(1L));
	}

	@Test
	void factorialOver25() {
		long actual = S55.factorial(39);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacciZero() {
		long actual = S55.fibonacci(0);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacciOne() {
		long actual = S55.fibonacci(1);

		assertThat(actual, is(1L));
	}

	@Test
	void fibonacciPlain() {
		long actual = S55.fibonacci(7);

		assertThat(actual, is(13L));
	}
	
	@Test
	void fibonacciPlainExc() {
		try {
			S55.fibonacciExc(-2);
			fail("Should not get to this point");
		} catch(Exception e) {
			String expected = "index cannot be < 0";
			assertThat(e.getMessage(), is(expected));
		}
		long actual = S55.fibonacci(7);

		assertThat(actual, is(13L));
	}

	@Test
	void multiplicationTableSqr() {
		int[][] actual = S55.multiplicationTable(5);

		assertThat(actual[4][4], is(25));
	}

	@Test
	void multiplicationTablePlain() {
		int[][] actual = S55.multiplicationTable(5);

		assertThat(actual[4][0], is(5));
	}

	@Test
	void multiplicationTableNegative() {
		int[][] actual = S55.multiplicationTable(-5);

		assertThat(actual[4][4], is(-25));
	}

	@Test
	void multiplicationTableZero() {
		int[][] actual = S55.multiplicationTable(0);

		assertThat(actual.length, is(0));
	}

}
