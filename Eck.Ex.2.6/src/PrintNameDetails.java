/** Eck Chapter 2 Exercise 2.6
 * Program asks user for name
 * Program tells the user their first name and number of characters
 * Program tells the user their second name and number of characters
 * Program tells the user their initials.
 * @author Joel
 *
 */

import java.util.Scanner;

public class PrintNameDetails {
	public static void main(String[] args) {
		String userFullName; // Full name from user
		int wsIndex; // Whitespace index
		String userFirstName; // First name from user
		String userSecondName; // Second name from user
		String userIntitials; // user initials
		
		Scanner stdin = new Scanner ( System.in );
		
		System.out.println("Please enter your full name with a space:");
		userFullName = stdin.nextLine(); // get user input
		wsIndex = userFullName.indexOf(" "); // get index of whitespace
		userFirstName = userFullName.substring(0, wsIndex); // substring upto ws
		userSecondName = userFullName.substring(wsIndex+1); // subtring from ws
		// get first letter of each (charAt produces int)
		userIntitials = userFirstName.substring(0,1) + userSecondName.substring(0,1);
		
		System.out.println("Your first name is " +
				userFirstName + ", with " + userFirstName.length() + " characters");
		System.out.println("Your second name is " +
				userSecondName + ", with " + userSecondName.length() + " characters");
		System.out.println("Your initials are " + userIntitials);
		
	}
}
