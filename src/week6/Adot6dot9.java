/**
 * 
 */
package week6;

/**
 * @author mintn
 *
 */
public class Adot6dot9 { //begin class

	/**
	 * @param args
	 */
	public static void main(String[] args) { //begin main
		
		util.TableHelper.printTableHeader("Feet", "Meters", "Meters", "Feet");
	/*	System.out.printf("%10s %10s     | %10s %10s%n-----------------------"
				+ "-----------------------------%n", "Feet", "Meters", "Meters", "Feet"); */
		
		for (int i=1; i<=10; i++) { //for loop
			double foot = (double)i;
			double meter = i * 5 + 15;	
			
		util.TableHelper.printTableRow(foot, feet2meters(foot), meter, meters2feet(meter),2,3);
			
		} //end for loop
	

	} //end main
	
	public static double meters2feet(double meters) {  //meters2feet begin
		double feet = 3.28084 * meters;
		return feet;
	} //meters2feet end
	
	public static double feet2meters(double feet) { //feet2meters begin
		double meters = feet * 0.305;
		return meters;
	} //feet2meters end
	
	} //end class


