package week2;


/**
 * @author mintn
 *
 */
import java.util.Scanner;

public class A2dot1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declare variables
		double celcius;
		double fahrenheit;
		
		//create object for scanner
		Scanner input = new Scanner(System.in);
		
		//get input from user for celcius
		System.out.print("Enter a degree in Celcius");
		celcius = input.nextDouble();
		
		//do the conversion math
		fahrenheit = (9.0/5)*celcius + 32;
		
		//output the temps
		System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");

		//lets see if this works
		input.close();
	}

}
