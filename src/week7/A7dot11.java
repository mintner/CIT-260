/**(Statistics: compute deviation) Programming Exerices 5.45 computes the standard deviation of
 * numbers. This exercise uses a different but equivalent formula.  The following is the
 * formula to compute the standard deviation of n numbers.
 * mean = x1+x2+x3+...xn/n  deviation = square root of (xi - mean)/n-1
 * To compute the standard deviation with this formula, you have to store the individual numbers
 * using an array, so the can be used after the mean is obtained.  
 * Write a test program that prompts the user to enter 10 numbers and displays the mean and
 * standard deviation.*/
//compute the deviation of double values
/**public static double deviation(double[] x)*/
// compute the mean of an array of double values
/**public static double mean(double [] x)*/

package week7;

/**
 * @author mintn
 */
import java.util.Scanner;

public class A7dot11 {  // begin class

	/**
	 * @param args
	 */
	public static void main(String[] args) {  // begin method
		// create scanner
		Scanner input = new Scanner(System.in);
		// create array with length of 10
		double[] numbers = new double[10];
		
		//prompt user to enter ten numbers
		System.out.print("Enter ten numbers (separated by a space): ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextDouble();
		
		// display the mean and standard deviation
		System.out.printf("The mean is " + "%.2f\n", mean(numbers));
		System.out.printf("The standard deviation is " + "%.2f", deviation(numbers));		

		input.close();
		
	} // end method
	
	// compute the deviation of double values
	public static double deviation(double[] x) {  // begin method
		double deviation = 0;
		double mean = mean(x);
		for (double e: x) {  //begin loop
			deviation += Math.pow(e - mean, 2);
		} //end loop
		return Math.sqrt(deviation / (x.length - 1));
	}  // end method

	// Compute the mean of an array of double values
	public static double mean(double[] x) {  // begin method
		double mean = 0;
		for (double e: x) {  //begin loop
			mean += e;
		}  // end loop
		return mean / x.length;
	}  // end method

} //end class
