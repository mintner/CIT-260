package week2;


/**input data for area and length of cylinder
 * @author mintn
 * output data the volume of the cyliner
 */
import java.util.Scanner;

public class A2dot2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create scanner to get inputs from user
		Scanner input = new Scanner(System.in);
		
		//get input
		System.out.print("Enter the radius and " + "length of a cylinder: ");
		
		//store values in variables
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		//calculate area
		double area = radius*radius*3.14;
		
		//calculate volume
		double volume = area*length;
		
		//output
		System.out.println("The volume of the cylinder " + "is " + volume);

		input.close();
	}

}
