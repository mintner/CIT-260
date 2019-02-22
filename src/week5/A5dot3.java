package week5;
/**
*(Conversion from kilograms to pounds) Write a program that displays the following
*table (note that 1 kilogram is 2.2 pounds):
*Kilograms     Pounds
*1                2.2
*3                6.6
*...
*197            433.4
*199            437.8
*
*@author mintn
*/

public class A5dot3 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create Constant
		final double poundsPerKg = 2.2;

		// Display header for table
		System.out.println("Kilograms      Pounds");

		// Display table after conversion is made
		for (int i = 1; i <= 199; i += 2) {
			System.out.printf(
				"%-15d%6.1f\n", i, (i * poundsPerKg));  	
		}  
}
}