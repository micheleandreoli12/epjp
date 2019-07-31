package b09;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ExArraylistTest {

	@Test
	void test() {
		ArrayList <Integer> a = new ArrayList<Integer>(Arrays.asList(3,7,12));
		ArrayList <Integer> b = new ArrayList<Integer>(Arrays.asList(1,5,6));
		ArrayList<Integer> result= ExArraylist.join(a, b);
		assertEquals(result,(new ArrayList<Integer>(Arrays.asList(1,3,5,6,7,12))));
	}
	
	@Test
	void test2() {
		ArrayList <Integer> a = new ArrayList<Integer>(Arrays.asList(3,7,12));
		ArrayList <Integer> b = new ArrayList<Integer>(Arrays.asList(1));
		ArrayList<Integer> result= ExArraylist.join(a, b);
		assertEquals(result,(new ArrayList<Integer>(Arrays.asList(1,3,7,12))));
	}
	@Test
	void testjoin() {
		ArrayList <Integer> a = new ArrayList<Integer>(Arrays.asList(3,7,12));
		ArrayList <Integer> b = new ArrayList<Integer>(Arrays.asList(1));
		ArrayList<Integer> result= ExArraylist.join2(a, b);
		assertEquals(result,(new ArrayList<Integer>(Arrays.asList(1,3,7,12))));
	}


}
