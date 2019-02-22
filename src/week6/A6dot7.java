package week6;

/**(Financial application: compute the future investment value) Write a method that 
 * computes future investment value at a given interest rate for a specified number of
 * years. The future investment is determined using the formula: */
 // futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)(numberOfYears * 12)
 /** Using the following method header:
 * public static double futureInvestmentValue(double investmentAmount, double
 * monthlyInterestRate,int years)
 * i.e. futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59
 */

/**
 * @author mintn
 *
 */

import java.util.Scanner;

public class A6dot7 {  //begin class

	/**
	 * @param args
	 */
	public static void main(String[] args) { //main begin
		/** Main Method */
		Scanner input = new Scanner(System.in); // Create Scanner

		// Prompt the user to enter the investment amount and interest rate
		System.out.print("Enter the amount invested: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate (3 for 3%): ");
		double annualInterestRate = input.nextDouble();

		// figure out monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Print a table that displays future value for the years from 1 to 30
		System.out.println(
				"\nYears      |  Future Value\n" + 
				"--------------------------"); // Table header
		for (int years = 1; years <=30; years++) { //for years begin
			System.out.printf(" %-10d|", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
		} //for years end
		input.close();
	} //main end

	/** Method futureInvestmentValue computes future investment value */
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years) {  // compute method
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

	} //end compute method

}  //end class
