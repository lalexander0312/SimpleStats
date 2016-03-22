import static org.junit.Assert.*;

import org.junit.Test;

public class TestingRangeSimple {

	@Test
	public void test() {
		int[] ints = {27,100,13,82,16,51};
		
		assertEquals(87, Stats.range(ints));
	}

}
