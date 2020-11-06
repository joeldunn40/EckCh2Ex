/** Eck Chapter 2 Exercsie 2.5
 * Program asks how many eggs there are
 * The tells the user 
 * how many gross (144)
 * how many dozen (12)
 * and how many left over (1)
 * @author Joel
 *
 */

import java.util.Scanner;

public class CountEggsByGroup {
	public static void main(String[] args) {
		int n; // input number of eggs
		int gross; // calculated gross
		int dozen; // calculated dozen
		int left; // calculated left over		
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("How many eggs are there?");
		n = stdin.nextInt();
		
		gross = n/144;
		left = n % 144;
		dozen = left/12;
		left = left % 12;

		System.out.println("Your number of eggs is " +
				gross + " gross, " +
				dozen + " dozen and " +
				left + " left over.");
	}
}
