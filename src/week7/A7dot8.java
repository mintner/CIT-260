package week7;
/**(Average an array) Write two overlaoded methods that return the average of an array with the
 * following headers:
 * public static int average (int[] array)
 * public static double average (double[] array)
 * Write a test program that prompts the user to enter 10 double values, invokes this method, then
 * displays the average value.*  
 */

/**
 * @author mintn
 *
 */
import java.util.Scanner;

public class A7dot8 { // class begin

	/**
	 * @param args
	 */
	
	public static void main(String[] args) { // method begin
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// array length 10
		double[] values = new double[10];
		
		// prompt the user to enter ten double digit values
		System.out.print("Enter ten numbers (divided by one space): ");
		for (int i = 0; i < values.length; i++) {  // begin for
			values[i] = input.nextDouble();
		} //end for
		
		// show the average value
		System.out.printf("The averave value of your numbers is: " + "%.2f", average(values));
		
		input.close();
		
	} // method end
		
		/* Overloaded method average accepts an integer array and returns its average */
		public static int average(int[] array) {  // method begin
			int average = 0; 
			for (int i: array)
				average += i;
			return average / array.length;
		}   // method end

		/* Overloaded method average accepts a double array and returns its average */
		public static double average(double[] array) { //method begin
			double average = 0; 
			for (double i: array)
				average += i;
			return average / array.length;
			} // method end
		
} //class end