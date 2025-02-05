package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class S54Test {

	@Test
	void checkSignPositive() {
		String actual = S54.checkSign(42);

		assertThat(actual, is("positive"));
	}

	@Test
	void checkSignNegative() {
		String actual = S54.checkSign(-42);

		assertThat(actual, is("negative"));
	}

	@Test
	void checkSignZero() {
		String actual = S54.checkSign(0);

		assertThat(actual, is("zero"));
	}

	@Test
	void isOddTrue() {
		boolean actual = S54.isOdd(19);

		assertThat(actual, is(true));
	}

	@Test
	void isOddFalse() {
		boolean actual = S54.isOdd(-12);

		assertThat(actual, is(false));
	}

	@Test
	void isOddZero() {
		boolean actual = S54.isOdd(0);

		assertThat(actual, is(false));
	}

	@Test
	void asWordZero() {
		String actual = S54.asWord(0);

		assertThat(actual, is("zero"));
	}

	@Test
	void asWordOther() {
		String actual = S54.asWord(42);

		assertThat(actual, is("other"));
	}

	@Test
	void voteLowA() {
		char actual = S54.vote(90.01);

		assertThat(actual, is('A'));
	}

	@Test
	void voteTopB() {
		char actual = S54.vote(90);

		assertThat(actual, is('B'));
	}

	@Test
	void voteOverA() {
		char actual = S54.vote(102);

		assertThat(actual, is('X'));
	}

	@Test
	void voteBelowZeroExc() {
		try {
			S54.voteExc(-11);
			fail("You should not get to this point");
		} catch (Exception e) {
			String expected = "percentile must be >0 and <100";
			assertThat(expected, is("percentile must be >0 and <100"));
		}
	}

	@Test
	void voteAboveExc() {
		try {
			S54.voteExc(110);
			fail("You should not get to this point");
		} catch (Exception e) {
			String expected = "percentile must be >0 and <100";
			assertThat(expected, is("percentile must be >0 and <100"));
		}
	}

	@Test
	void voteBelowZero() {
		char actual = S54.vote(-54);

		assertThat(actual, is('X'));
	}

	@Test
	void isLeapTrue() {
		boolean actual = S54.isLeapYear(2020);

		assertThat(actual, is(true));
	}

	@Test
	void isLeapFalse() {
		boolean actual = S54.isLeapYear(1900);

		assertThat(actual, is(false));
	}

	@Test
	void sortPlain() {
		int[] actual = S54.sort(3, 2, 1);

		assertThat(actual.length, is(3));
		assertThat(actual[0], is(1));
		assertThat(actual[1], is(2));
		assertThat(actual[2], is(3));
	}

	@Test
	void sortNegative() {
		int[] actual = S54.sort(3, -2, 1);

		assertThat(actual.length, is(3));
		assertThat(actual[0], is(-2));
		assertThat(actual[1], is(1));
		assertThat(actual[2], is(3));
	}

	@Test
	void sortZero() {
		int[] actual = S54.sort(3, 2, 0);

		assertThat(actual.length, is(3));
		assertThat(actual[0], is(0));
		assertThat(actual[1], is(2));
		assertThat(actual[2], is(3));
	}

	@Test
	void sortEquals() {
		int[] actual = S54.sort(3, 2, 2);

		assertThat(actual.length, is(3));
		assertThat(actual[0], is(2));
		assertThat(actual[1], is(2));
		assertThat(actual[2], is(3));
	}
}
