package week3;
/**
 *Write a program that prompts the user to enter the month and year and then display
 *the number of days in the month the user entered.  Month 2 in 2012 would display 29 days
 *month 2 in 2015 would display 28 days. * 
 */

/**
 * @author mintn
 *
 */
import java.util.Scanner;

public class A3dot11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		// get month
		System.out.print("Enter a month by number:");
		int month = input.nextInt();
		int days = 0;
		
		if (month <1 || month >12) {
			System.out.print("This is not a valid month (must be an "
					+ "integer between 1 and 12)");
			System.exit(1);
		}
		
		//get year
		System.out.print("Enter a year (YYYY):");
		int year = input.nextInt();
				
		//find leap years
		boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
		
		//find how many days in the month
		switch(month)
		{
		case 1: days = 31; break;
		case 2: if (isLeapYear) days = 29;
		else days = 28; break;
		case 3: days = 31; break;
		case 4: days = 30; break;
		case 5: days = 31; break;
		case 6: days = 30; break;
		case 7: days = 31; break;
		case 8: days = 31; break;
		case 9: days = 30; break;
		case 10: days = 31; break;
		case 11: days = 30; break;
		case 12: days = 31;
		default: 
		}
		
		//display the output (number of days in the month for that year)
		System.out.println(month + ", " + year + " had/will have " + days + " days");
		
		input.close();

	}

}