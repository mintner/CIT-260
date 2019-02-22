package week4;
/**Write a program that reads the following information and prints a payroll statement:
 * Employee's name (e.g. Smith)
 * Number of hours worked in a week (e.g. 10)
 * Hourly pay rate (e.g. 9.75)
 * Federal tax withholding rate (e.g., 20%)
 * State tax withholding rate (e.g., 9%)
 * 
 */

/**
 * @author mintn
 *
 */
import java.util.Scanner;
public class A4dot23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get employee's name
		System.out.print("Enter Employee's last name: ");
		String name = input.next();			
		
		//Get hours worked in a week
		System.out.print("Enter number of hours worked in a week: ");
		
		// Read a number of double type
		double hoursWorked=input.nextDouble();
		
		//Get the user to enter the hourly pay rate
		System.out.print("Enter hourly pay rate: ");
		double hourlyRate=input.nextDouble();
			if (hourlyRate < 0)
			{
				System.out.print("Invalid input, please enter a number greather than"
						+ "zero.");
				System.exit(1);
			}
			
		//Get user to enter federal tax withholding rate
		System.out.print("Enter federal tax withholding rate (enter as decimal "
				+ "e.g. .20 equals 20%): ");
		double fedTaxWithholdRate=input.nextDouble();
			if (fedTaxWithholdRate >= 1)
			{
				System.out.print("Invalid input, please enter a decimal number less than 1"
						+ "as percentage (i.e. .15 for 15%");
				System.exit(1);
			}
			
		//Get user to enter state tax withholding rate
		System.out.print("Enter state tax withholding rate: (enter as decimal"
				+ "e.g. .10 equals 10%): ");
		double stateTaxWithholdRate=input.nextDouble();
			if (stateTaxWithholdRate >= 1)
			{
				System.out.print("Invalid input, please enter a decimal number less that 1"
						+ "(i.e. .09 for 9%");
				System.exit(1);
			}
		
		//Compute the gross pay first
		double grossPay = Math.round((hourlyRate * hoursWorked) *100.0) / 100.0;
		
		//Compute the amount withheld for federal tax
		double fedWithholding=grossPay*fedTaxWithholdRate;
		
		//Compute the amount withheld for state tax
		double stateWithholding=grossPay*stateTaxWithholdRate;
		
		//Calculate total withheld for state and federal taxes
		double totalDeduction=fedWithholding+stateWithholding;
		
		//Calculate net pay
		double netPay=grossPay - totalDeduction;
		
		//Display the requested payroll information
		//Employee name, hourse worked, pay rate, gross pay, deductions, withholding
		//net pay
		System.out.println("Employee name: "+ name);
		System.out.println("Hours worked: "+ hoursWorked);
		System.out.println("Pay rate: "+ hourlyRate);
		System.out.println("Gross pay: "+grossPay);
		System.out.println("\t Federal Withholding ("+ fedTaxWithholdRate*100 +"%): $" 
		+fedWithholding);
		System.out.println("\t State Withholding (" + stateTaxWithholdRate*100+"%): $" + 
		stateWithholding);
		//total withheld
		System.out.println("\t Total Deduction: $"+ totalDeduction);
		//net pay
		System.out.println("Net Pay: $" + netPay);
input.close();		

	}

}
