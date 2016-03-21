import static org.junit.Assert.*;

import org.junit.Test;

public class testMeanOfZeroInts {

	@Test
	public void test() {
		int[] ints = {};
		assertEquals(0, Stats.mean(ints));
	}

}
