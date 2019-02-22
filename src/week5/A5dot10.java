package week5;

/**
*(Find numbers divisible by 5 and 6) Write a program that displays all the numbers
*from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
*separated by exactly one space.
 * @author mintn
 *
 */

public class A5dot10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Display 10 numbers per line 
		final int numPerLine = 10;	
		// Count the number of numbers divisible by 5 and 6
		int count = 0;	

		// Test all numbers from 100 to 1,000
		for (int i = 100; i <= 1000; i++) {
			// Test if number is divisible by 5 and 6
			if (i % 5 == 0 && i % 6 == 0) {
				//count by increments
				count++;
				// Test if numbers per line is 10 
				if (count % numPerLine == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");		
			}
		}
	}
}