/** Eck Chapter 2 Exercise 2.4
 * Program asks how many quarter (25)
 * how many nickels (5)
 * how many dimes (10)
 * how many pennies (1)
 * and adds up and prints the total in dollars
 * @author Joel
 *
 */

import textio.TextIO;

public class CountChange {
	public static void main(String[] args) {
		int numQuarters; // number of quarters
		int numDimes; // number of dimes
		int numNickels; // number of nickels
		int numPennies; // number of pennies
		double sumTotal; // sum total in dollars
		
		System.out.println("How many quarters do you have?");
		numQuarters = TextIO.getlnInt();
		System.out.println("How many dimes do you have?");
		numDimes = TextIO.getlnInt();
		System.out.println("How many nickels do you have?");
		numNickels = TextIO.getlnInt();
		System.out.println("How many pennies do you have?");
		numPennies = TextIO.getlnInt();
		
		sumTotal = (numQuarters*25 + 
				numDimes*10 + 
				numNickels*5 + 
				numPennies*1)/100.0;
		
		System.out.printf("You have $%.2f dollars\n",sumTotal);
		
	}
}
