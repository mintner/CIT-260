package week5;
/**
*(Financial application: compute future tuition) Suppose that the tuition for a university
*is $10,000 this year and increases 5% every year. In one year, the tuition
*will be $10,500. Write a program that computes the tuition in ten years and the
*total cost of four years’ worth of tuition after the tenth year.
 * 
 */

/**
 * @author mintn
 *
 */
public class A5dot7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// count the total cost of four years tuition
		int totalCost = 0;
		int tuition = 10000;
		int tuitionYearTen = 0;

		for (int year = 1; year <= 14; year++) {
			// Increase tuition by 5% every year
			tuition += (tuition * 0.05);  
			
			// Test for after 10 years
			if (year > 10) 
				totalCost += tuition;

			// Cost of tuition in ten years
			if (year == 10)
				tuitionYearTen = tuition; 
		}

		// Display the cost of tuition in ten years
		System.out.println("Tuition in ten years: $" + tuitionYearTen);

		// Display the cost of four years' worth of tuition after tenth year
		System.out.println("Total cost for four years' worth of tuition" +
			" after the tenth year: $" + totalCost);
	}
}