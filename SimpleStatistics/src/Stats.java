/**
 * 
 * This program is a statistics library.
 * It will include a mean, mode, range, and median method.
 * 
 * @author Richard Poore
 * 
 *
 */
public class Stats {

	/**
	 * 
	 * @param ints The parameter is an array of integers
	 * @return mean() will return the mean as an integer
	 */
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

	/**
	 * 
	 * @param ints The parameter is an array of integers
	 * @return the range as an integer
	 */
	public static int range(int[] ints) {
		
		return 0;
	}
/**
 * 
 * @param ints The parameter is an array of integers
 * @return the mode (most common number) as an integer
 */
	public static int mode(int[] ints) {
		
		return 0;
	}

	/**
	 * 
	 * @param ints The parameter is an array of integers
	 * @return the median (middle number when sorted (or mean of the two middle numbers) as an integer
	 */
	public static Object median(int[] ints) {
	
	return 0;
}

}
