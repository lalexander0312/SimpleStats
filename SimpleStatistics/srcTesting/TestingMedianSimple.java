import static org.junit.Assert.*;

import org.junit.Test;

public class TestingMedianSimple {

	@Test
	public void test() {
		int[] ints = {27,100,13,82,16,51,51};
		assertEquals(51, Stats.median(ints));
	}
}
