package week3;
import java.util.Scanner;

/**
 * Write a program that prompts the user to enter an integer for todays day of the week
 * Sunday = 0, Monday = 1, etc...
 * Enter the number of days after today for a future day and display the future day
 * of the week.
 */


/**
 * @author mintn
 *
 */
public class A3dot5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt for an Integer to represent the day of the week.
		System.out.println("Sunday = 0, Monday=1,...Saturday = 6");
		System.out.print("Please enter the day of the week as an Integer: ");
		int dayOfWeek = input.nextInt();
		
		if (dayOfWeek <0 || dayOfWeek >6) {
			System.out.print("This is not a valid start day (must be between 0 and 6)");
			System.exit(1);
		}
		
		//Prompt for number of days after today
		System.out.print("How many days into the future do you want to calculate?: ");
		int futureDays = input.nextInt();
		
		if (futureDays <0) {
			System.out.print("This is not a valid future day request "
					+ "(it must be a positive integer)");
			System.exit(1);
		}
		
		//Calculate the future day of the week
		int futureDayofweek;
		
		
		
			futureDayofweek = futureDays % 7 + dayOfWeek;
			
		if (futureDayofweek >= 7 ) {
			futureDayofweek %= 7;
		}
		
		//Display future day of the week
		
		System.out.println("Today is " + getDayOfWeekName(dayOfWeek) 
		+ " and the future day is " + getDayOfWeekName(futureDayofweek) + ".");
		
		input.close();
	}
	
	public static String getDayOfWeekName(int day) {

		String s = "NOT A DAY OF WEEK";
		switch (day) {
		case 0: s = "Sunday"; break;
		case 1: s = "Monday"; break;
		case 2: s = "Tuesday"; break;
		case 3: s = "Wednesday"; break;
		case 4: s = "Thursday"; break;
		case 5: s = "Friday"; break;
		case 6: s = "Saturday";
		}
		return s;
		
	}

}
