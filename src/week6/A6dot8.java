/**6.8 (Conversions between Celcius and Fahrenheit) Write a class that contains
 * the following:
 * Convert from Celcius to Fahrenheit
 * public static double celciusToFarenheit (double celsius)
 * Convert from Fahrenheit to Celcius
 * public static double fahrenheitToCelcius (double fahrenheit)
 * 
 * (formulat for the conversion)
 * fahrenheit = (9.0 / 5) * celcius + 32
 * celcius = (5.0 / 9) * (fahrenheit - 32)
 */

/**
 * @author mintn
 *
 */
package week6;


public class A6dot8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Print the table header
		util.TableHelper.printTableHeader("Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		
		// set parameters for the table
		for(int i = 10; i >=1; i--) {

			//Use i to calculate your starting temperatures
			float celsius = i+30;
			float fahrenheit = i*10+20;
			
			//The printing of each row has been handed off to a helper method.
			//Notice the decimal precision of each column 
			util.TableHelper.printTableRow(celsius, c2f(celsius), fahrenheit, f2c(fahrenheit), 1, 2);
		}

	}
	
	/**
	 * C2F - Celsius to Fahrenheit Conversion Method 
	 * @param Temperature in Celsius
	 * @return Temperature in Fahrenheit
	 */
	public static float c2f(float celsius) {
		float fahrenheit = (float) ((9.0 / 5) * celsius +  32);
		return fahrenheit;
	}

	/**
	 * F2C - Fahrenheit to Celsius Conversion Method   
	 * @param Temperature in Fahrenheit
	 * @return Temperature in Celsius
	 */
	public static float f2c(float fahrenheit) {
		float celsius = (float) ((5.0 / 9) * (fahrenheit -32));
		return celsius;
		
	}

}
