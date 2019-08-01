package b09;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

class TabellaTest {

	@Test
	void test() {
		Tabella table = new Tabella();
		table.add(3);
		assertThat(table.check(3), is(true));
	}
	
	@Test
	void testsort() {
		Tabella table = new Tabella();
		table.add(3);
		table.add(8);
		table.add(2);
		table.add(12);
		Collection<Integer> prova = new ArrayList<Integer>(Arrays.asList(2,3,8,12));
			assertEquals( table.getData(),  prova);
		
		
	}

}
