import static org.junit.Assert.*;

import org.junit.Test;

public class TestCount {

	@Test
	public void test() {
		int[] daArray = {5,14,7,3,49,14,21};
		assertEquals (2,Stats.count(daArray, 14));
	}

	

}
