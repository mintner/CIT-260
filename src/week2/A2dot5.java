package week2;


/**
 * @author mintn
 *
 */
import java.util.Scanner;

public class A2dot5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// scanner
		Scanner input=new Scanner(System.in);
		
		//get input for subtotal and gratuity rate then store them
		System.out.print("Enter the subtotal and a gratuity rate: (i.e. 20 for 20%)");
		double subtotal = input.nextDouble();
		double gratuityrate = input.nextDouble();
		
		//calculate gratuity
		double gratuity = subtotal * (gratuityrate/100);
		
		//calculate total
		double total = subtotal + gratuity;
		
		//output
		System.out.println("The gratuity is $"+gratuity+" and the total is $"+total);
		
		input.close();

	}

}
