package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class S56Test {

    @Test
    void reverseStringPlain() {
        String actual = S56.reverse("abc");

        assertThat(actual, is("cba"));
    }
    
    @Test
    void reverseStringSub() {
        String actual = S56.reverse("abc");

        assertEquals("ba", actual.substring(1));
    }
    
    @Test
    void reverseStringChar() {
        String actual = S56.reverse("abc");

        assertEquals('c', actual.charAt(0));
    }

    @Test
    void isPalindromePlain() {
        boolean actual = S56.isPalindrome("abba");

        assertThat(actual, is(true));
    }
    
    @Test
    void isPalindromePlainodd() {
        boolean actual = S56.isPalindrome("ingegni");

        assertThat(actual, is(true));
    }

    @Test
    void removeVowelsPlain() {
        String actual = S56.removeVowels("example");

        assertThat(actual, is("xmpl"));
    }
    
    @Test
    void removeVowelsVowels() {
        String actual = S56.removeVowels("aoaoa");

        assertThat(actual, is(""));
    }

    @Test
    void bin2decPlain() {
        int actual = S56.bin2dec("1001");

        assertThat(actual, is(9));
    }
    
    @Test
    void bin2decchar() {
        int actual = S56.bin2dec("cane");

        assertThat(actual, is(0));
    }
    
    @Test
    void bin2decNegative() {
        int actual = S56.bin2dec("-1001");

        assertThat(actual, is(-9));
    }

    @Test
    void reverseIntArrayPlain() {
        int[] original = new int[] {1, 2, 3};
        int[] actual = S56.reverse(original);

        assertThat(actual.length, is(original.length));
        for(int i = 0; i < original.length; i++) {
            assertThat(actual[i], is(original[original.length - i - 1]));
        }
    }

    @Test
    void averagePlain() {
        double actual = S56.average(new int[] {1, 2, 3});

        assertThat(actual, is(2.0));
    }

    @Test
    void maxPlain() {
        int actual = S56.max(new int[] {2, 3, 1});

        assertThat(actual, is(3));
    }

}
