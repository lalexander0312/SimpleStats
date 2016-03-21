import static org.junit.Assert.*;

import org.junit.Test;

public class TestingMeanSimple {

	@Test
	public void test() {
		int[] ints = {27,100,13,82,16,51};
		
		assertEquals(48, Stats.mean(ints));
	}

}
