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
		int highest=-2000000000;
		int lowest=2000000000;
		
		for (int i = 0; i < ints.length; i++)
		{
			highest = Math.max(highest, ints[i]);
			lowest = Math.min(lowest, ints[i]);
		}
		
		return highest - lowest;
	}
/**
 * 
 * @param ints The parameter is an array of integers
 * @return the mode (most common number) as an integer
 */
	public static int mode(int[] ints) {
		//Create integer variables for
			//mode = 0
			//modeCount = 0
		
		//Loop through the array
			//if the count of this number is more than modeCount
				//make this number the mode
				//and make this number's count the modeCount
		
		//return mode;
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

	public static int count(int[] daArray, int daNum) {

		int count = 0;
		
		for (int i = 0; i < daArray.length; i++)
		{
			if (daArray[i]==daNum)
				count++;
		}

		return count;
	}

}
