
public class Stats {

	public static int mean(int[] ints) {

		if (ints.length == 0)
			return 0;
		else {
			int sum = 0;
			for (int i = 0; i < ints.length; i++) {
				sum += ints[i];
			}

			return sum / ints.length;
		}
	}

}
